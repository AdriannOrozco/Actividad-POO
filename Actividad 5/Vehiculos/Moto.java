package Vehiculos;

public class Moto extends Vehiculo {
    String cilindrada;

    public Moto(){

    }

    public Moto(String tipo, String marca, String cilindrada){
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }
}
