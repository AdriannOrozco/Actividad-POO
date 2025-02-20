package Coche;

public class Coche extends Object{

    private static int contadorCoches;
    private String modelo;
    private String marca;

    public Coche(){

    }

    public Coche(String modelo, String marca){
        this.modelo = modelo;
        this.marca = marca;
        contadorCoches++;
    }

    public static void cantidadCoches(){
        System.out.println("Hay " +  contadorCoches + " coches.");
    }

    @Override
    public String toString(){
        return "La marca del coche es " + marca + " y su modelo es " + modelo;
    }


}