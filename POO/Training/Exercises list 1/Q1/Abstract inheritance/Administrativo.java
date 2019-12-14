
package herançaabstrata;

public class Administrativo extends Assistente{
    protected String turno;
    protected double adicional;

    public Administrativo(String turno, double adicional, String matricula, String nome, double salario) {
        super(matricula, nome, salario);
        this.turno = turno;
        this.adicional = adicional;
    }

    protected void exibeDados(){
        System.out.println(" ");
        System.out.println("Assistente administrativo: ");
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Turno: " + turno);
        System.out.println("Adicional noturno: " + adicional);
    }   
}
