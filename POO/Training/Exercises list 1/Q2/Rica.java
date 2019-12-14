
package q2;

public class Rica extends Pessoa{
    private double dinheiro;

    public Rica(double dinheiro, String nome, int idade) {
        super(nome, idade);
        this.dinheiro = dinheiro;
    }
    
    public void fazCompras(){
        System.out.println("Fazer compras");
    }
}
