import java.io.IOException;


public class TestProducto {
    public static void main(String[] args) {
    limpiarPantalla();
    Producto producto = new Producto("Suavitel", 12000, 2);
    producto.MostrarInfo();
    System.out.println(""); //Si fue posible acceder a los datos de la clase Producto!
    
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
