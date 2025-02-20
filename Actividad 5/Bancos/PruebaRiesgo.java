import java.io.IOException;

public class PruebaRiesgo {
    public static void main(String[] args) {
        limpiarPantalla();
        BancoRiesgo banco = new BancoRiesgo(12000);
        banco.saldo -= 3000; //Se puede manipular muy fácil el saldo.
        System.out.println("El saldo es " + banco.saldo);
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
