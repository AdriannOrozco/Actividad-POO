package Banco;

public class CuentaBancaria extends Object {
    
    private String numeroCuenta;
    private int saldo;
    public String tipoCuenta;

    public CuentaBancaria(){
       tipoCuenta = "Ahorros";
       numeroCuenta = "123332";
       saldo = 140000;
    }

    public CuentaBancaria(String numeroCuenta, int saldo, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void verDetalles(){
        System.out.println(" DETALLES DE LA CUENTA");
        System.out.println("NÚMERO DE CUENTA : " + numeroCuenta);
        System.out.println("SALDO DISPONIBLE : " + saldo);
        System.out.println("TIPO DE CUENTA : " + tipoCuenta);
        System.out.println("");
    }

}
