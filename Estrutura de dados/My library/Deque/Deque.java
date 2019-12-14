
package deque_;

public class Deque {
    private No primeiro;
    private No ultimo;
    private No aux;

    public Deque() {
        primeiro = null;
        ultimo = null;
        aux = null;
    }

    public void enqueueFirst(int elemento){
        No novo = new No(elemento);
        
        if (primeiro == null){
            ultimo = novo;
        } else {
            primeiro.setAnterior(novo);         
        }
        
        novo.setProximo(primeiro);
        primeiro = novo;
    }
    
    public void enqueueLast(int elemento){
        No novo = new No(elemento);
        
        if (primeiro == null){
            primeiro = novo;
        } else {
            ultimo.setProximo(novo);
            novo.setAnterior(ultimo);
        }
        
        ultimo = novo;
    }
    
    public No dequeueFirst(){
        if(primeiro == null){
            throw new RuntimeException("O deque está vazio");
        }

        aux = primeiro;

        if(primeiro.getProximo() == null){
            ultimo = null;
        }else{
            primeiro.getProximo().setAnterior(null);
        }

        primeiro = primeiro.getProximo();

        return aux;
    }
    
    public No dequeueLast(){
        if(ultimo == null){
            throw new RuntimeException("O deque está vazio");
        }

        aux = ultimo;

        if(primeiro.getProximo() == null){
            primeiro = null;
        }else{
            ultimo.getProximo().setAnterior(null);
        }

        ultimo = ultimo.getAnterior();

        return aux;
    }
    
    public boolean isEmpty(){
        boolean status = false;
        
        if(primeiro == null){
            status = true;
        }
        
        return status;
    }
    
    public No pickFirst(){
        if(isEmpty()){
            throw new RuntimeException("A fila está vazia");
        }else{
            return primeiro;
        } 
    }
    
    public No pickLast(){
        if(isEmpty()){
            throw new RuntimeException("A fila está vazia");
        }else{
            return ultimo;
        } 
    }
    
    public void printFrente(){
        aux = primeiro;
        
        while(aux != null){
            System.out.println(aux.getElemento() + " ");
            aux = aux.getProximo();
        }
    }
    
    public void printTras(){
        aux = ultimo;
        
        while(aux != null){
            System.out.println(aux.getElemento() + " ");
            aux = aux.getAnterior();
        }
    } 
}
