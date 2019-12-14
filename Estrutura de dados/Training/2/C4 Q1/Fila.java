
package exercicio.pkg1;

public class Fila {
    private No primeiro;
    private No ultimo;
    private No aux;
    
    public Fila() {
        primeiro = null;
        ultimo = null;
        aux = null;
    }
    
    public void adicionar(int numero){
        No novo = new No(numero);
        
        if(primeiro == null){
            primeiro = novo;
            ultimo = novo;
        }else{
            ultimo.setProximo(novo);
            ultimo = novo;
        }
    }
    
    public void print(){
        aux = primeiro;
        
        while(aux != null){
            System.out.println(aux.getNumero() + " ");
            
            aux = aux.getProximo();
        }
    }
}
