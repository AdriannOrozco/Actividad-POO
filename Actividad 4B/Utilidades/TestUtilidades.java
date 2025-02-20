package Utilidades;

import java.io.IOException;

public class TestUtilidades {

    public static void main(String[] args) {
        limpiarPantalla();
        Utilidades utilidades = new Utilidades();
        System.out.println(" -> RESULTADO DE LAS UTILIDADES <- ");
        System.out.println("____________________________________");
        utilidades.sumarNumeros(13, 12);
        System.out.println("");
        utilidades.restarNumeros(34.6, 19.4);
        System.out.println("");
        utilidades.multiplicarNumeros(10, 10);
        System.out.println("");
        utilidades.dividirNumeros(24, 2);
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
