
package av1;

public class Eletro {
    private String tipo;
    private int potencia;
    private int quantidade;
    private float tempo;
    private float consumo;
    private double custoMensal;
    private Eletro proximo;

    public Eletro(String tipo, int potencia, int quantidade, float tempo) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.quantidade = quantidade;
        this.tempo = tempo;
        this.proximo = null;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
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

    public double getCustoMensal() {
        return custoMensal;
    }

    public void setCustoMensal(double custoMensal) {
        this.custoMensal = custoMensal;
    }

    public Eletro getProximo() {
        return proximo;
    }

    public void setProximo(Eletro proximo) {
        this.proximo = proximo;
    }
}
