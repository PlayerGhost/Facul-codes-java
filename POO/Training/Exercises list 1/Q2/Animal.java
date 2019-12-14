
package q2;

public class Animal {
    private String nome;
    private String raca;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }
    
    public void Animal(){
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
    }
    
    public void Animal(String nome){
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
    }
    
    public String caminha(){ 
        return "Estou caminhando";
    }
}
