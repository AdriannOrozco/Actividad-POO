public class BancoRiesgo extends Object{

    /*Declarar el saldo como protected es peligroso ya que se puede manipular
     * el dato desde una subclase u otra clase del mismo package
     * Ejemplo: ver el archivo "PruebaRiesgo.java" En el archivo BancoSeguro
     * se mostrará una manera correcta de manejar el saldo.
     */
    protected double saldo;

    public BancoRiesgo(){

    }

    public BancoRiesgo(double saldo){
        this.saldo = saldo;
    }
}