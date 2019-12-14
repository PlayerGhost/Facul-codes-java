
package herança;

public class Labrador extends Cachorro{
    protected String nome;

    public Labrador(String nome, int mamas, int idade, float peso, String cor, double altura) {
        super(mamas, idade, peso, cor, altura);
        this.nome = nome;
    }
    
    public void brincar(){
        System.out.println("Estou brincando!");
    }
    
    public void print(){
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Cor: " + cor);
        System.out.println("Altura: " + altura);
        System.out.println("Nome: " + nome); 
    }
}

