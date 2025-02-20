public class Empleado extends Object{

    public String nombre;
    double salario;


    public Empleado(){

    }

    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        if (salario >= 0) {
            this.salario = salario;
        }
    }

    @Override
    public String toString(){
        return "NOMBRE DE LA EMPRESA : " + nombre + " Y SU SALARIO ES DE : " + salario;
    }

}