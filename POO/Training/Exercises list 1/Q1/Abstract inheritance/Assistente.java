
package herançaabstrata;

public class Assistente extends Funcionario{
   protected String matricula;

    public Assistente(String matricula, String nome, double salario) {
        super(nome, salario);
        this.matricula = matricula;
    }

   @Override
   protected void exibeDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
        System.out.println("Matrícula: " + matricula);
    } 
}
