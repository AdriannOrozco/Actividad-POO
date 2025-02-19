package Vehiculos;
// Clase Vehículo con propiedad de acceso de paquete (default)
class Vehiculo {
    String tipo;

    // Constructor con acceso de paquete
    Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    // Método para mostrar información del vehículo
    void mostrarInfo() {
        System.out.println("Tipo de vehículo: " + tipo);
    }
}

