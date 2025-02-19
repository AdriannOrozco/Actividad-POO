package Vehiculos;
// Clase Moto que hereda de Vehiculo

class Moto extends Vehiculo {

    // Constructor que llama al constructor de la superclase
    Moto(String tipo) {
        super(tipo);
    }

    // Método para mostrar información de la moto
    void mostrarMoto() {
        System.out.println("Esta es una moto de tipo: " + tipo);
    }
}
