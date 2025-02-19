
class Producto {

    String nombre;
    int precio;
    int stock;
    
    Producto(String nombre, int precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void MostrarInfo(){
        System.out.println("Producto: " + nombre + "| Precio: " + precio + "| Stock: " + stock);
    }
}
