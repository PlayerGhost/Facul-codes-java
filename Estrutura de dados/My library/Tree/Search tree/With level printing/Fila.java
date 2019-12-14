
package arvoreniveis;

public class Fila{
    private No primeiro;
    private No ultimo;
    private No aux;
    
    public Fila() {
        primeiro = null;
        ultimo = null;
        aux = null;
    }
    
    public void enqueue(No elemento){
        if(primeiro == null){
            primeiro = elemento;
            ultimo = elemento;
        }else{
            ultimo.setProximo(elemento);
            ultimo = elemento;
        }
    }
    
    public No dequeue(){
        aux = primeiro;
        
        primeiro = primeiro.getProximo();
        aux.setProximo(null);
 
        return aux;
    }
    
    public boolean isEmpty(){
        boolean status = false;
        
        if(primeiro == null){
            status = true;
        }
        
        return status;
    }
}
