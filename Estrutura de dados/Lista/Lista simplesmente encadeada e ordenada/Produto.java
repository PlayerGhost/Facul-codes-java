
public class Produto {
    private String nome;
    private double salario;
    private Produto anterior;
    private Produto proximo;
	
    public Produto(String nome, double salario) {
	this.nome = nome;
	this.salario = salario;
	this.anterior = null;
        this.proximo = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Produto getAnterior() {
        return anterior;
    }

    public void setAnterior(Produto anterior) {
        this.anterior = anterior;
    }

    public Produto getProximo() {
        return proximo;
    }

    public void setProximo(Produto proximo) {
        this.proximo = proximo;
    }
}
