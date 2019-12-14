
package filaprioridade;

public class No {
    private String tipoNome;
    private int tipoNumero;
    private No anterior;
    private No proximo;

    public No(String tipoNome, int tipoNumero) {
        this.tipoNome = tipoNome;
        this.tipoNumero = tipoNumero;
        this.anterior = null;
        this.proximo = null;
    }

    public String getTipoNome() {
        return tipoNome;
    }

    public void setTipoNome(String tipoNome) {
        this.tipoNome = tipoNome;
    }

    public int getTipoNumero() {
        return tipoNumero;
    }

    public void setTipoNumero(int tipoNumero) {
        this.tipoNumero = tipoNumero;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No snterior) {
        this.anterior = snterior;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
