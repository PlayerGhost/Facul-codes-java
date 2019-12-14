
package q4;

public class Velho extends Imovel{
    private double desconto;

    public Velho(double desconto, String endereço, double preco) {
        super(endereço, preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public double valorDesconto(){
        System.out.println("Desconto: " + desconto);
        
        return desconto;
    }
}
