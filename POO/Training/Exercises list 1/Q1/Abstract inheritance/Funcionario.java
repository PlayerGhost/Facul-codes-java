
package herançaabstrata;

abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
            
    protected void trabalhar(){
        System.out.println("Trabalhado");
    }
    
    protected void comer(){
        System.out.println("comendo");
    }
    
    protected void exibeDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }
}
