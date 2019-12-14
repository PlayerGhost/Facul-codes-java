
package herança;

public class Animal {
    protected int idade;
    protected float peso;
    protected String cor;
    protected double altura;
    
    public Animal(int idade, float peso, String cor, double altura) {
        this.idade = idade;
        this.peso = peso;
        this.cor = cor;
        this.altura = altura;
    }
    
    public void comer(){
        System.out.println("Estou comendo!");
    }    
}
