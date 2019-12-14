
package q3;

public class CamaroteSuperior extends VIP{
    protected double valorAdicional;

    public CamaroteSuperior(double valorAdicional, double adicional, double valor) {
        super(adicional, valor);
        this.valorAdicional = valorAdicional;
    }
    
    public double valorIngresso(){
        double valorIngresso = valorVIP() + valorAdicional;
        
        return valorIngresso;
    }
}
