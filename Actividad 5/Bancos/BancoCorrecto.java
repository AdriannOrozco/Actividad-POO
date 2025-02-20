public class BancoCorrecto extends Object {
    
    /*Esta sería la forma correcta ya que el saldo es privado y sólo se puede
     * acceder a través de métodos de acceso, evitando una manipulación que sea
     * descontrolada.
     */
    private double saldo;

    public BancoCorrecto(){

    }

    public BancoCorrecto(double saldo){
        this.saldo = saldo;
    }

    //Métodos para manipular de manera controlada el saldo
    public double getSaldo(){
        return saldo;
    }

    public void añadirDinero(double cantidad){
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void retirarDinero(double cantidad){
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        }
    }
}
