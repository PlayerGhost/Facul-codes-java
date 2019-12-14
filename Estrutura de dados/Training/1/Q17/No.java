
package q17;

public class No {
    private int caracetere;
    private No proximo;

    public No(int caracetere) {
        this.caracetere = caracetere;
        this.proximo = null;
    }

    public int getCaracetere() {
        return caracetere;
    }

    public void setCaracetere(int caracetere) {
        this.caracetere = caracetere;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
