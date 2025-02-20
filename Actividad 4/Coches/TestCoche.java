package Coches;

import java.io.IOException;

public class TestCoche {
    public static void main(String[] args) {
        limpiarPantalla();
        Coche coche = new Coche();

        //Forma incorrecta de acceder a los datos.
        //(comentar el error para verificar si está bueno).
        coche.modelo = "2025";
        coche.marca = "Toyota"; //Revisar el documento (error_accederADatos)
        
        //Forma correcta de acceder a los datos.
        coche.setModelo("BMW");
        coche.setModelo("2023");
        coche.setVelocidadMaxima(70);
        coche.acelerar(5);
        System.out.println(coche);
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
