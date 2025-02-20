package Personas;

public class Profesor extends Persona {
    
    String curso;

    public Profesor(String nombre, String curso){
        super(nombre);
        this.curso = curso;
    }

    @Override
    public void Presentarse(){
        System.out.println("¡Hola, soy " + nombre + "! " + "y soy profesor del curso " + curso + "...");
    }
}
