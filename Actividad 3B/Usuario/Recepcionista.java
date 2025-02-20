package Usuario;

public class Recepcionista extends Usuario {
    

public Recepcionista(){

}


//Código que genera un error en la compilación! (Explicado en "explicacion.doc")
/*public void Mensaje(String adicional){
System.out.println("Mensaje de un recepcionista" + adicional);
} */


//Aquí se puede ver la mala práctica, no genera error directamente, pero puede causar errores en el futuro.
public void Mensaje(){
    System.out.println("Mensaje de un recepcionista.");
}

}
