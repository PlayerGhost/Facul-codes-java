
package q4;

public class Novo extends Imovel{
    private double adicional;   

    public Novo(double adicional, String endereço, double preco) {
        super(endereço, preco);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
    public double valorAdicional(){
        System.out.println("Valor adicional: " + adicional);
        
        return adicional;
    }
}
