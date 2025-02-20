package Personal;

public class Empleado extends Object {

    protected String nombre;
    protected int salario;

    public Empleado() {

    }

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarInfo() {
        System.out.println("");
        System.out.println("EMPLEADO : " + nombre);
        System.out.println("SALARIO : " + salario);
    }

}