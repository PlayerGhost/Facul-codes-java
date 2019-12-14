

package arvorebuscaavl;

public class ArvoreAVL {
    private No root;
    private No aux;
    private No aux2;

    public ArvoreAVL() {
        root = null;
        aux = null;
        aux2 = null;
    }
    
    public int altura(No elemento){
        if(elemento == null){
            return 0;
        }else{
            return elemento.getAltura();
        }
    }
    
    public void add(int value){
        root = add(root, value);
    }
    
    public No add(No elemento, int value){
        if(elemento == null)
            elemento = new No(value);
        
        if(value < elemento.getValue()){
            elemento.setEsquerdo(add(elemento.getEsquerdo(), value));
        }else if(value > elemento.getValue()){
            elemento.setDireito(add(elemento.getDireito(), value));
        }else{
            return elemento;
        }
        
        elemento.setAltura(1 + Math.max(altura(elemento.getEsquerdo()), altura(elemento.getDireito())));
        
        int balance = getBalance(elemento);
        
        if(balance > 1 && value < elemento.getEsquerdo().getValue()){
            return rotacionarDireita(elemento);
        }
        
        if(balance < -1 && value > elemento.getDireito().getValue()){
            return rotacionarEsquerda(elemento);
        }
        
        if(balance > 1 && value > elemento.getEsquerdo().getValue()){
            elemento.setEsquerdo(rotacionarEsquerda(elemento.getEsquerdo()));
            return rotacionarDireita(elemento);
        }
        
        if(balance < -1 && value < elemento.getDireito().getValue()){
            elemento.setDireito(rotacionarDireita(elemento.getDireito()));
            return rotacionarEsquerda(elemento);
        }
        
        return elemento;
    }
    
    public void remove(int value){
        if(root == null){
            System.out.println("Árvore vazia!");
        }else{
            root = remove(root, value);
        } 
    }
    
    public No remove(No elemento, int value){ 
        if(elemento == null){
            return elemento;
        }
        
        if(value < elemento.getValue()){
            elemento.setEsquerdo(remove(elemento.getEsquerdo(), value));
        }else if(value > elemento.getValue()){
            elemento.setDireito(remove(elemento.getDireito(), value));
        }else{  
            if((elemento.getEsquerdo() == null) || (elemento.getDireito() == null)){  
                aux = null;
                
                if(aux == elemento.getEsquerdo()){  
                    aux = elemento.getDireito();
                }else{
                    aux = elemento.getEsquerdo();  
                }
                
                if(aux == null){  
                    aux = elemento;  
                    elemento = null;  
                }else{
                    elemento = aux;
                } 
            }else{  
                aux = minElemento(elemento.getDireito());  

                elemento.setValue(aux.getValue());  
                
                elemento.setDireito(remove(elemento.getDireito(), aux.getValue()));  
            }  
        }
        
        if(elemento == null){
            return elemento;
        }
        
        elemento.setAltura(Math.max(altura(elemento.getEsquerdo()), altura(elemento.getDireito())));
        
        int balance = getBalance(elemento);
        
        if(balance > 1 && getBalance(elemento.getEsquerdo()) >= 0){
            return rotacionarDireita(elemento);
        }
        
        if(balance < -1 && getBalance(elemento.getDireito()) <= 0){
            return rotacionarEsquerda(elemento);
        }
        
        if(balance > 1 && getBalance(elemento.getEsquerdo()) < 0){
            elemento.setEsquerdo(rotacionarEsquerda(elemento.getEsquerdo()));
            return rotacionarDireita(elemento);
        }
        
        if(balance < -1 && getBalance(elemento.getDireito()) > 0){
            elemento.setDireito(rotacionarDireita(elemento.getDireito()));
            return rotacionarEsquerda(elemento);
        }
        
        return elemento;
    }
    
    public No rotacionarDireita(No elemento){
        aux = elemento.getEsquerdo(); 
        aux2 = aux.getDireito(); 
  
        aux.setDireito(elemento);
        elemento.setEsquerdo(aux2);
  
        elemento.setAltura(Math.max(altura(elemento.getEsquerdo()), altura(elemento.getDireito())) + 1);
        aux.setAltura(Math.max(altura(aux.getEsquerdo()), altura(aux.getDireito())) + 1);

        return aux; 
    }
    
    public No rotacionarEsquerda(No elemento){
        aux = elemento.getDireito(); 
        aux2 = aux.getEsquerdo(); 
  
        aux.setEsquerdo(elemento);
        elemento.setDireito(aux2); 
  
        elemento.setAltura(Math.max(altura(elemento.getEsquerdo()), altura(elemento.getDireito())) + 1);
        aux.setAltura(Math.max(altura(aux.getEsquerdo()), altura(aux.getDireito())) + 1);
  
        return aux; 
    }
    
    public int getBalance(No elemento){
        if(elemento == null){
            return 0;
        }
        
        return altura(elemento.getEsquerdo()) - altura(elemento.getDireito());
    }
    
    public No minElemento(No elemento){
        if(elemento.getEsquerdo() == null){
            return elemento;
        }else{
            return minElemento(elemento.getEsquerdo());
        }
    }
    
    public void preOrdem(){
        preOrdem(root);
    }
    
    public void preOrdem(No elemento){
        System.out.print(elemento.getValue() + " ");
        
        if(elemento.getEsquerdo() != null){
            preOrdem(elemento.getEsquerdo());
        }
        
        if(elemento.getDireito() != null){
            preOrdem(elemento.getDireito());
        }
    }
    
    public void emOrdem(){
        emOrdem(root);
    }
    
    public void emOrdem(No elemento){     
        if(elemento.getEsquerdo() != null){
            emOrdem(elemento.getEsquerdo());
        }
        
        System.out.print(elemento.getValue() + " ");
        
        if(elemento.getDireito() != null){
            emOrdem(elemento.getDireito());
        }
    }
    
    public void posOrdem(){
        posOrdem(root);
    }
    
    public void posOrdem(No elemento){
        if(elemento.getEsquerdo() != null){
            posOrdem(elemento.getEsquerdo());
        }
        
        if(elemento.getDireito() != null){
            posOrdem(elemento.getDireito());
        }
        
        System.out.print(elemento.getValue() + " ");
    }
}
