
package herança;

public class Gato extends Mamifero{

    public Gato(int mamas, int idade, float peso, String cor, double altura) {
        super(mamas, idade, peso, cor, altura);
    }
    
    public void miar(){
        System.out.println("Estou miando!");
    }
    
    public void print(){
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Cor: " + cor);
        System.out.println("Altura: " + altura);
        System.out.println("Namas: " + mamas); 
    }
}
