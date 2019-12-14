
package herança;

public class Cachorro extends Humano{

    public Cachorro(int mamas, int idade, float peso, String cor, double altura) {
        super(mamas, idade, peso, cor, altura);
    }

    public void latir(){
        System.out.println("Estou latindo!");
    }
}
