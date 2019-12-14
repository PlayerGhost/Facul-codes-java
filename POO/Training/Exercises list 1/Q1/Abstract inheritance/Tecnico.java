
package herançaabstrata;

public class Tecnico extends Assistente{
    protected double bonus;

    public Tecnico(double bonus, String matricula, String nome, double salario) {
        super(matricula, nome, salario);
        this.bonus = bonus;
    }
  
    @Override
    protected void exibeDados(){
        System.out.println(" ");
        System.out.println("Assistente técinico: ");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salario: " + salario);
        System.out.println("Bônus salarial: " + bonus);
    }
}
