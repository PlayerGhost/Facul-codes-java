
package q4;

public class No {
    private int key;
    private String nome;
    private No anterior;
    private No proximo;

    public No(int key, String nome) {
        this.key = key;
        this.nome = nome;
        this.anterior = null;
        this.proximo = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
