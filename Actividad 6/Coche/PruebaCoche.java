package Coche;

import java.io.IOException;

public class PruebaCoche {

    public static void main(String[] args) {
        limpiarPantalla();
        Coche coche1 = new Coche("2015", "Kia");
        Coche coche2 = new Coche("2020", "Toyota");
        Coche coche3 = new Coche("2025", "BMW");
        System.out.println(" || COCHES EN LA LISTA || ");
        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);
        System.out.println("");
        System.out.println(" -- contador --");
        coche1.cantidadCoches();
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
