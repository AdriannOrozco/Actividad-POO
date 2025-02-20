package Frutas;

import java.io.IOException;

public class TestFruta {
    public static void main(String[] args) {
        limpiarPantalla();

        Frutas frutas = new Frutas();
       // frutas.nombre = "Banana"; //AQUÍ GENERA ERROR!
        System.out.println(frutas);
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
