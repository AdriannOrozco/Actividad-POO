package Personas;

import java.io.IOException;

public class Main {
    
    public static void main(String[] args) {
        limpiarPantalla();
        Persona persona = new Persona();
        
        //Asignación de la edad
        persona.edad = 28;

        //Forma érronea de acceder a este atributo (Explicado en el documento explicación.doc)
        persona.nombre = "Iván";

        //Forma correcta
        persona.setNombre("Iván");
        persona.verInfo();
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
