package Frutas;

public class Frutas extends Object {

    private String nombre;

    public Frutas(){

    }
    public Frutas(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "La fruta es " + nombre + ".";
    }

}
