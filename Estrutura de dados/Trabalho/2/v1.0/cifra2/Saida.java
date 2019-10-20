
package cifra2;

public class Saida {
    private Mensagem primeiro;
    private Mensagem ultimo;
    private Mensagem aux;

    public Saida() {
        primeiro = null;
        ultimo = null;
        aux = null;
    }

    public void enqueue(String letra1, String letra2){
        Mensagem novo = new Mensagem(letra1, letra2);
        
        if (primeiro == null){
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.setProximo(novo);
            ultimo = novo;            
        }
    }
    
    public void dequeue(){
        primeiro = primeiro.getProximo();
    }
    
    public Mensagem pick(){
        return primeiro;
    }
    
    public void print(){
        aux = primeiro;
        
        System.out.println(" ");
        System.out.println("Texto claro");
        
        while(aux != null){
            System.out.print(aux.getLetra1());
            aux = aux.getProximo();
        }
        
        System.out.println(" ");
        
        aux = primeiro;
        
        System.out.println(" ");
        System.out.println("Criptograma");
        
        while(aux != null){
            System.out.print(aux.getLetra2());
            aux = aux.getProximo();
        }
        
        System.out.println(" ");
    }
}
