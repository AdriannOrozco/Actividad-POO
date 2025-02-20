package Banco;

import java.io.IOException;

public class TestCuentaBancaria {
    public static void main(String[] args) {
    limpiarPantalla();
    CuentaBancaria cuenta = new CuentaBancaria();

    //Error de compilación.
    System.out.println(cuenta.numeroCuenta);
    //Debate en "explicacion.doc"

    
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
