package arvorebusca;

public class No {
    private int elemento;
    private No esquerdo;
    private No direito;

    public No(int elemento) {
        this.elemento = elemento;
        this.esquerdo = null;
        this.direito = null;
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
    
    public void add(int elemento){
        if(elemento < this.elemento){
            if(esquerdo == null){
                esquerdo = new No(elemento);
            }else
                esquerdo.add(elemento);
        }else if(elemento > this.elemento){
            if(direito == null){
                direito = new No(elemento);
            }else
                direito.add(elemento);
        }
    }
    
    public void remove(int value, No parente){
        if(value < this.elemento){
            if(esquerdo != null){
                esquerdo.remove(value, this);
            }    
        }else if(value > this.elemento){
            if(direito != null){
                direito.remove(value, this);
            }  
        }else{
            if(esquerdo != null && direito != null){
                this.elemento = direito.minElemento();
                direito.remove(this.elemento, this);
            }else if(parente.esquerdo == this){
                parente.esquerdo = (esquerdo != null) ? esquerdo : direito;
            }else if(parente.direito == this){
                parente.direito = (esquerdo != null) ? esquerdo : direito;
            }
        }
    }
    
    public int minElemento(){
        if(esquerdo == null){
            return elemento;
        }else{
            return esquerdo.minElemento();
        }
    }
    
    public void preOrdem(){
        System.out.print(elemento + " ");
        
        if(esquerdo != null){
            esquerdo.preOrdem();
        }
        
        if(direito != null){
            direito.preOrdem();
        }
    }
    
    public void emOrdem(){   
        if(esquerdo != null){
            esquerdo.emOrdem();
        }
        
        System.out.print(elemento + " ");
        
        if(direito != null){
            direito.emOrdem();
        }
    }
    
    public void posOrdem(){
        if(esquerdo != null){
            esquerdo.posOrdem();
        }
        
        if(direito != null){
            direito.posOrdem();
        }
        
        System.out.print(elemento + " ");
    }
}