
package cifra2;

public class Mensagem {
    private String bloco1;
    private String bloco2;
    private Mensagem anterior;
    private Mensagem proximo;   

    public Mensagem(String bloco1) {
        this.bloco1 = bloco1;
        this.bloco2 = bloco2;
        this.anterior = null;
        this.proximo = null;
    }

    public String getBloco1() {
        return bloco1;
    }

    public void setBloco1(String bloco1) {
        this.bloco1 = bloco1;
    }

    public String getBloco2() {
        return bloco2;
    }

    public void setBloco2(String bloco2) {
        this.bloco2 = bloco2;
    }

    public Mensagem getAnterior() {
        return anterior;
    }

    public void setAnterior(Mensagem anterior) {
        this.anterior = anterior;
    }

    public Mensagem getProximo() {
        return proximo;
    }

    public void setProximo(Mensagem proximo) {
        this.proximo = proximo;
    }
}
