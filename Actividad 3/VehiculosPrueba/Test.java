package VehiculosPrueba;

import java.io.IOException;

public class Test {
    
    public static void main(String[] args) {
        limpiarPantalla();
        
        Vehiculo vehiculo = new Vehiculo();
        Moto moto = new Moto();

      /* Esto nos genera error ya que no podemos acceder a la carpeta "Vehiculos"
       * ya que este viene tipo default o paquete, por ende solo podemos acceder
       * a esos miembros si estamos dentro de la carpeta "Vehiculos de origen!"
       */
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
