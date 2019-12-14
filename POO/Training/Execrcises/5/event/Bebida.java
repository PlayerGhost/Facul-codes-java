
package poos;

public class Bebida {
    private String nome;
    private double teorAlcoolico;
    private double valorUnitario;

    public Bebida(String nome, double teorAlcoolico, double valorUnitario) {
        this.nome = nome;
        this.teorAlcoolico = teorAlcoolico;
        this.valorUnitario = valorUnitario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
