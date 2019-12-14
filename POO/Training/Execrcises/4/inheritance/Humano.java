
package herança;

public class Humano extends Mamifero{

    public Humano(int mamas, int idade, float peso, String cor, double altura) {
        super(mamas, idade, peso, cor, altura);
    }

    public void falar(){
        System.out.println("Estou falando!");
    }
    
    public void print(){
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Cor: " + cor);
        System.out.println("Altura: " + altura);
        System.out.println("Mamas: " + mamas); 
    }
}
