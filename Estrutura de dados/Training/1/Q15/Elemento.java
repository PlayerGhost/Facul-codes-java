
package q15;

public class Elemento {
    private char caractere;
    private Elemento proximo;

    public Elemento(char caractere) {
        this.caractere = caractere;
        this.proximo = null;
    }

    public char getCaractere() {
        return caractere;
    }

    public void setCaractere(char caractere) {
        this.caractere = caractere;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }
}
