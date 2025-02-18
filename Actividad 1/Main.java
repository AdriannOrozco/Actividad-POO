import java.io.IOException;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    limpiarPantalla();
    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);
    String numeroCuenta; String tipoCuenta; int saldo;

        //--- LIBRO ---
        Libro libro = new Libro();
        System.out.println("   ->||   D A T O S    D E L   L I B R O   ||<-");
        System.out.println("_____________________________________________________________________________________________");
        System.out.println(libro);
        System.out.println("");
        System.out.println("");

        //--- ESTUDIANTE ---
        String nombreEstudiante; 
        String curso; 
        int edad;

        do{
            System.out.print("Introduzca el nombre del estudiante: ");
            nombreEstudiante = leer2.nextLine();
            
            if (contieneNumeros(nombreEstudiante)) {
                System.out.println("El nombre contiene números.");
            }
        
            if (nombreEstudiante.length() < 3) {
                System.out.println("El número es demasiado corto.");
            }
            }while(nombreEstudiante.length() < 3 || contieneNumeros(nombreEstudiante));
    
            do{
                System.out.print("Introduzca el curso de " + nombreEstudiante + ": ");
                curso = leer2.nextLine();
            
                if (curso.length() < 3) {
                    System.out.println("El curso es demasiado corto.");
                }
                }while(curso.length() < 3);
    
                do{
                System.out.print("Introduzca la edad de " + nombreEstudiante + ": ");
                while (!leer.hasNextInt()) {
                System.out.println("La edad debe tener números, no carácteres.");
                leer2.next();
                }
                edad = leer.nextInt();
    
                if (edad <= 0 || edad > 40) { 
                    System.out.println("Edad inválida.");
                }
            
            }while(edad <= 0 || edad > 40);
            Estudiante estudiante = new Estudiante();
            estudiante.nombre = nombreEstudiante;
            estudiante.curso = curso;
            estudiante.edad = edad;
            System.out.println("");
            System.out.println(" ->|| D A T O S   D E L  E S T U D I A N T E ||<-");
            System.out.println("____________________________________________________");
            System.out.println(estudiante);
            System.out.println();

        //-- BANCO --
        System.out.println("");
        System.out.println("");
        System.out.println("   ->||   C U E N T A   B A N C A R I A   ||<-");
        System.out.println("________________________________________________");
    System.out.println("");
        do{
            System.out.print("Introduzca el número de cuenta: ");
            numeroCuenta = leer2.nextLine();
            
            if (!contieneNumeros(numeroCuenta)) {
                System.out.println("El número de cuenta debe contener solo números.");
            }
        
            if (numeroCuenta.length() < 3)  {
                System.out.println("El número es demasiado corto.");
            }
            }while(numeroCuenta.length() < 3 || !contieneNumeros(numeroCuenta));

            do{
                System.out.print("Introduzca el saldo de la cuenta: ");
                while (!leer.hasNextInt()) {
                System.out.println("El saldo debe tener números, no carácteres.");
                leer.next();
                }
                saldo = leer.nextInt();
    
                if (saldo <= 0) { 
                    System.out.println("El saldo es inválido.");
                }
            
            }while(saldo <= 0);

            do{
                System.out.print("Introduzca el tipo de cuenta: ");
                tipoCuenta = leer2.nextLine();
                
                if (contieneNumeros(tipoCuenta)) {
                    System.out.println("El tipo de cuenta no debe contener números");
                }
            
                if (tipoCuenta.length() < 3)  {
                    System.out.println("El tipo de cuenta es demasiado corto.");
                }
                }while(tipoCuenta.length() < 3 || contieneNumeros(tipoCuenta));
        System.out.println("");
        System.out.println("-- DATOS DE LA CUENTA --");

        //Agregamos al constructor
        CuentaBancaria cuentaBancaria = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);
        System.out.println(cuentaBancaria);
        System.out.println("");
        leer.close();
        leer2.close();
        

   } 

   public static void limpiarPantalla() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    
    public static boolean contieneNumeros(String fact) {
        return fact.matches(".*\\d.*");
    }

    }
