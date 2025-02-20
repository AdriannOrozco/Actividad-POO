package Personas;

public class Estudiante extends Persona{
    
    String curso;

    public Estudiante(String nombre, String curso){
        super(nombre);
        this.curso = curso;
    }

    @Override
    public void Presentarse(){
        System.out.println("¡Hola, soy " + nombre + "! " + "y soy estudiante del curso " + curso + "...");
    }


}
