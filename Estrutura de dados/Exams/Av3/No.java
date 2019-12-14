
package av3;

public class No {
    private Pessoa elemento;
    private No esquerdo;
    private No direito;

    public No(Pessoa elemento) {
        this.elemento = elemento;
        this.esquerdo = null;
        this.direito = null;
    }

    public Pessoa getElemento() {
        return elemento;
    }

    public void setElemento(Pessoa elemento) {
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
    
    public void add(Pessoa pessoa, int key){
        if(key < this.getElemento().getNome().charAt(0)){
            if(esquerdo == null){
                esquerdo = new No(pessoa);
            }else{
                esquerdo.add(pessoa, key);
            }
        }else if(key > this.getElemento().getNome().charAt(0)){
            if(direito == null){
                direito = new No(pessoa);
            }else{
                direito.add(pessoa, key);
            }
        }
    }
}
