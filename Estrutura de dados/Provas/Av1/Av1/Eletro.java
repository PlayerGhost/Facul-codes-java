
package av1;

public class Eletro {
    private String tipo;
    private float potencia;
    private int quantidade;
    private float tempo;
    private float consumo;
    private float custoMensal;
    private Eletro proximo;

    public Eletro(String tipo, float potencia, int quantidade, float tempo) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.quantidade = quantidade;
        this.tempo = tempo;
        this.consumo = 0;
        this.custoMensal = 0;
        this.proximo = null;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getTempo() {
        return tempo;
    }

    public void setTempo(float tempo) {
        this.tempo = tempo;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public float getCustoMensal() {
        return custoMensal;
    }

    public void setCustoMensal(float custoMensal) {
        this.custoMensal = custoMensal;
    }

    public Eletro getProximo() {
        return proximo;
    }

    public void setProximo(Eletro proximo) {
        this.proximo = proximo;
    }
}
