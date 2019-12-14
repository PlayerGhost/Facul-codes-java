package q17;

public class Fila{
    private No primeiro;
    private No ultimo;
    private No aux;
    
    public Fila() {
        primeiro = null;
        ultimo = null;
        aux = null;
    }
    
    public void enqueue(int numero){
        No novo = new No(numero);
        
        if(primeiro == null){
            primeiro = novo;
            ultimo = novo;
        }else{
            ultimo.setProximo(novo);
            ultimo = novo;
        }
    }
    
    public void dequeue(){
        primeiro = primeiro.getProximo();
    }
    
    public No pick(){
        return primeiro;
    }
}