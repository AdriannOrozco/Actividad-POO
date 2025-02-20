package UtilesEscolares;

public class Utiles extends Object {

    // Variable para mostrar el error
    private String nombre;

    /*
     * Aquí se puede ver el error donde se ve una relación de un private con un
     * static
     * y el static solo puede realicionarse con el static!
     */
    public static void verNombre() {
        System.out.println("El nombre es " + nombre);
    }

    // Variable para mostrar la solución
    static String apellido;

    public static void verApellido() {
        System.out.println("El apellido es " + apellido);
    }// Aquí podemos ver que no genera error ya que un static si puede relacionarse
     // otro static!

}
