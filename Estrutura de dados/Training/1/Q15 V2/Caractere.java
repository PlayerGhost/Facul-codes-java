
package q16;

public class Caractere {
    private char letra;
    private Caractere proximo;

    public Caractere(char letra) {
        this.letra = letra;
        this.proximo = null;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public Caractere getProximo() {
        return proximo;
    }

    public void setProximo(Caractere proximo) {
        this.proximo = proximo;
    }
}
