package PruebaVehiculos;
import Vehiculos.Moto;
import Vehiculos.Vehiculo;

public class Acceso {

public static void main(String[] args) {
    
    Vehiculo vehiculo = new Vehiculo();

    //Accedemos a los atributos
    System.out.println("MARCA DEL VEHICULO : " + vehiculo.marca);
    System.out.println("MODELO DEL VEHICULO : " + vehiculo.modelo);

    Moto moto = new Moto();
    moto.marca = "Yamaha";
}

}
