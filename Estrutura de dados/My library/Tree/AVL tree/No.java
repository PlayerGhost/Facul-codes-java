package arvorebuscaavl;

public class No {
    private int value;
    private int altura; 
    private No esquerdo;
    private No direito;

    public No(int value) {
        this.value = value;
        this.altura = 1;
        this.esquerdo = null;
        this.direito = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public No getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(No esquerdo) {
        this.esquerdo = esquerdo;
    }

    public No getDireito() {
        return direito;
    }

    public void setDireito(No direito) {
        this.direito = direito;
    }
}