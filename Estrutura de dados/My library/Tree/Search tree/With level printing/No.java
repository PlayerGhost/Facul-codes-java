
package arvoreniveis;

public class No {
    private int elemento;
    private No esquerdo;
    private No direito;
    private No proximo;

    public No(int elemento) {
        this.elemento = elemento;
        this.esquerdo = null;
        this.direito = null;
        this.proximo = null;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
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

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    
    public void add(int elemento){
        if(elemento < this.elemento){
            if(esquerdo == null){
                esquerdo = new No(elemento);
            }else
                esquerdo.add(elemento);
        }else{
            if(direito == null){
                direito = new No(elemento);
            }else
                direito.add(elemento);
        }
    }
}
