package Operaciones;

public class Matematicas extends Object {
    
    public static void suma(double a, double b){
        double resultaldo = a+b;
        System.out.println("La suma es " + resultaldo + ".");
    }

    public static void resta(double a, double b){
        double resultaldo = a-b;
        System.out.println("La resta es " + resultaldo + ".");
    }

    public static void multiplicación(double a, double b){
        double resultaldo = a*b;
        System.out.println("La multiplicación es " + resultaldo + ".");
    }

    public static void división(double a, double b){
        if (b == 0) {
            System.out.println("No se puede devidir entre 0.");
        } else {
            double resultaldo = a/b;
            System.out.println("La división es " + resultaldo + ".");
        }
    }
}
