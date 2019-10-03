
public class Produto {
	private String codigo;
	private double preco;
	private int quantidade;
	private Produto proximo;
	
	public Produto(String codigo, double preco, int quantidade) {
		this.codigo = codigo;
		this.preco = preco;
		this.quantidade = quantidade;
		this.proximo = null;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProximo() {
		return proximo;
	}

	public void setProximo(Produto proximo) {
		this.proximo = proximo;
	}
}
