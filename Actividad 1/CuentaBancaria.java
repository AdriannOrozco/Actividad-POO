public class CuentaBancaria {
    String numeroCuenta;
    int saldo;
    String tipoCuenta;

    //Constructor por defecto
    public CuentaBancaria(){
}

    //Constructor parametrizado
    public CuentaBancaria(String numeroCuenta, int saldo){
    this.numeroCuenta = numeroCuenta;
    this.saldo = saldo;
}

    //Constructor sobrecargado
    public CuentaBancaria(String numeroCuenta, int saldo, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString(){
        return "N° de cuenta - " + saldo + " \nSalario - $" + saldo + "\n Tipo de cuenta -> " + tipoCuenta;
    }



}
