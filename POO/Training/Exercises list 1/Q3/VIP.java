
package q3;

public class VIP extends Ingresso{
    protected double adicional;

    public VIP(double adicional, double valor) {
        super(valor);
        this.adicional = adicional;
    }
    
    public double valorVIP(){
        double valorTotal = valor + adicional;
        
        return valorTotal;
    }
}
