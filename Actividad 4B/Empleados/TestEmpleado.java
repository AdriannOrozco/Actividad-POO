import java.io.IOException;

public class TestEmpleado {
    public static void main(String[] args) {
        limpiarPantalla();
        Empleado empleado = new Empleado();
        empleado.nombre = "Microsoft";
        empleado.setSalario(1500000);
        System.out.println("");
        System.out.println(" || DATOS DE LA EMPRESA ||");
        System.out.println(empleado);
        System.out.println("");
    }

     public static void limpiarPantalla() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
