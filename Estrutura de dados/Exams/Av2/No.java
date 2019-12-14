
package av1;

public class No {
    private int numero;
    private String origem;
    private String destino;
    private int quantidadePassageiros;
    private No proximo;

    public No(int numero, String origem, String destino, int quantidadePassageiros) {
        this.numero = numero;
        this.origem = origem;
        this.destino = destino;
        this.quantidadePassageiros = quantidadePassageiros;
        this.proximo = null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
