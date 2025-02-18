public class Producto {
    String nombre;
    int precio;
    
    //Constructor por defecto
    public Producto(){

    }

    //Constructor parametrizado
    public Producto(String nombre, int precio){
        this.nombre = nombre; //Diferenciamos los atributos (variables) de los parámetros.
        this.precio = precio;
    }

    public void mostrarNombre(){
        System.out.println("El producto es " + nombre + " | COP: " + precio);
    }


  
}
