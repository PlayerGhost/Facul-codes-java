
package criptopilha;

public class No <T>{
    private T elemento;
    private No proximo;
    private No anterior;

    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
        this.anterior = null;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
}
