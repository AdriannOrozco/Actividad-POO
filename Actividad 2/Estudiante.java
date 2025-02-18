public class Estudiante {
    String nombre;
    int edad;


    //Constructor por defecto
    public Estudiante(){
    this("Gilberto", 17);
    }

    //Constructor parametrizado
    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;

    }

    //Método para mostrar al estudiante.
    public void mostrarEstudiante(){
        System.out.println("El estudiante se llama -> " + nombre + " y su edad es de " + edad + " años.");
    }
}
