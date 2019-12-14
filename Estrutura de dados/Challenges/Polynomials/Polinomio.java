
package polinomios;

public class Polinomio {
    private int coeficiente;
    private int expoente;
    private Polinomio proximo;

    public Polinomio(int coeficiente, int expoente) {
        this.coeficiente = coeficiente;
        this.expoente = expoente;
        this.proximo = null;
    }

    public int getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public int getExpoente() {
        return expoente;
    }

    public void setExpoente(int expoente) {
        this.expoente = expoente;
    }

    public Polinomio getProximo() {
        return proximo;
    }

    public void setProximo(Polinomio proximo) {
        this.proximo = proximo;
    }   
}
