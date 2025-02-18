//Clase aparte con el error al intentar usar un this. con static

public class Moto {
    String marca;
    int añoModelo;

//Contructor por defecto
public Moto(){

}

public Moto(String marca, int añoModelo){
    this.marca = marca;
    this.añoModelo = añoModelo;
}

public static void mostrarMoto(){
    System.out.println("La moto es " this.marca + " con modelo " + this.modelo); 
} //Aquí se genera la incompatibilidad del this con el static, y los métodos con "static" no depende de instancias

//Método corregido
public void mostrarMoto2(){
    System.out.println("La moto es " + marca + " con modelo " + añoModelo);
}
}
