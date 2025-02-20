package Personal;

public class Gerente extends Empleado {
    String departamento;

    public Gerente() {

    }

    public Gerente(String nombre, int salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("DEPARTAMENTO : " + departamento);
    }
}