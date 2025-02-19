package Personas;

class Persona { //Clase de paquete
    
    private String nombre;
    int edad;

    //Constructor por defecto
    Persona(){

    }

    //Constructor parametrizado
    Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Creamos el get y set de el atributo nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void verInfo(){
        System.out.println("El nombre de la persona es " + nombre + " y su edad es de " + edad + " años.");
    }

}
