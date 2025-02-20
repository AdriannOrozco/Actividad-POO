package Usuario;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        limpiarPantalla();
        Usuario usuario = new Usuario();
        Usuario recepcionista = new Recepcionista();

        System.out.println(" || APARTADO USUARIO || ");
        usuario.Mensaje();
        System.out.println("");
        System.out.println(" || APARTADO RECEPCIONISTA ||");
        recepcionista.Mensaje();
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
