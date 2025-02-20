import java.io.IOException;

public class TestEstudiante {
    
    public static void main(String[] args) {
        limpiarPantalla();
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Raúl");
        estudiante.setEdad(22);
        estudiante.setDouble(4.76);
        System.out.println("|| DATOS DEL ESTUDIANTE ||");
        System.out.println("");
        System.out.println(estudiante);
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
