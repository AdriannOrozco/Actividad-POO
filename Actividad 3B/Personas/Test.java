package Personas;

import java.io.IOException;

public class Test {
    
    public static void main(String[] args) {
    limpiarPantalla();

    Persona persona = new Persona("Julio");
    Persona estudiante = new Estudiante("Samuel", "11-1");
    Persona profesor = new Profesor("Nayib", "10-2");

    //Mostramos
    System.out.println("__________________________________________________________");
    persona.Presentarse();
    estudiante.Presentarse();
    profesor.Presentarse();
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
