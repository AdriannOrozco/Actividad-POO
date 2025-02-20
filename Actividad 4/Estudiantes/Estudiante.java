public class Estudiante extends Object {

    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante() {

    }

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() >= 3) {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 1) {
            this.edad = edad;
        }
    }

    public double getPromedo() {
        return promedio;
    }

    public void setDouble(Double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "el estudiante se llama " + nombre + ", su edad es de " + edad + " años, y su nota promedio es: "
                + promedio + ".";
    }

}