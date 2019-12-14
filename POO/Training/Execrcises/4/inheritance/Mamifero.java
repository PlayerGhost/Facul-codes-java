
package herança;

public class Mamifero  extends Animal{
    protected int mamas;

    public Mamifero(int mamas, int idade, float peso, String cor, double altura) {
        super(idade, peso, cor, altura);
        this.mamas = mamas;
    }
    
    public void mamar(){
        System.out.println("Estou mamando!");
    }
}
