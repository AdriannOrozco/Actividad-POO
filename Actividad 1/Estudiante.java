public class Estudiante {
    String nombre;
    int edad;
    String curso;

    //Constructor por defecto
    public Estudiante(){
   
    }

    //Constrcutor parametrizado
    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;

    }

    //Contructor sobrecargado
    public Estudiante(String nombre, int edad, String curso){
        this(nombre, edad);
        this.curso = curso;
    }

    @Override
    public String toString(){
        return "Estudiante: " + nombre + "| Grado: " + curso + " | Edad: " + edad + " años.";
         }
}
