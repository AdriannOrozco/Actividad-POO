package Operaciones;

import java.io.IOException;

public class Prueba {
    public static void main(String[] args) {
    limpiarPantalla();
    System.out.println("|| RESULTADOS ||");
    System.out.println("");
    Matematicas matematicas = new Matematicas();
    matematicas.suma(10.5, 5);
    matematicas.resta(-20, 15);
    matematicas.multiplicación(100, 10);
    matematicas.división(19, 9);
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
