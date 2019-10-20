
package cifra2;

public class Mensagem {
    private String letra1;
    private String letra2;
    private Mensagem anterior;
    private Mensagem proximo;   

    public Mensagem(String letra1, String letra2) {
        this.letra1 = letra1;
        this.letra2 = letra2;
        this.anterior = null;
        this.proximo = null;
    }

    public String getLetra1() {
        return letra1;
    }

    public void setLetra1(String letra1) {
        this.letra1 = letra1;
    }

    public String getLetra2() {
        return letra2;
    }

    public void setLetra2(String letra2) {
        this.letra2 = letra2;
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
