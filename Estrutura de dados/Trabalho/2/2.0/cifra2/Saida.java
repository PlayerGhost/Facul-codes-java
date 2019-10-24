
package cifra2;

public class Saida {
    protected Mensagem primeiro;
    protected Mensagem ultimo;
    protected Mensagem aux1;

    public Saida() {
        primeiro = null;
        ultimo = null;
        aux1 = null;
    }

    public void enqueue(String letra1){
        Mensagem novo = new Mensagem(letra1);
        
        if (primeiro == null){
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.setProximo(novo);
            ultimo = novo;            
        }
    }
    
    public void printCript(){
        aux1 = primeiro;
        
        System.out.println(" ");
        System.out.println("Texto claro:");
        
        while(aux1 != null){
            System.out.print(aux1.getBloco1());
            aux1 = aux1.getProximo();
        }
        
        System.out.println(" ");
        
        aux1 = primeiro;
        
        System.out.println(" ");
        System.out.println("Criptograma:");
        
        while(aux1 != null){
            System.out.print(aux1.getBloco2());
            aux1 = aux1.getProximo();
        }
        
        System.out.println(" ");
    }
    
    public void printDecript(){
        aux1 = primeiro;
        
        System.out.println(" ");
        System.out.println("Criptograma:");
        
        while(aux1 != null){
            System.out.print(aux1.getBloco1());
            aux1 = aux1.getProximo();
        }
        
        System.out.println(" ");
        
        aux1 = primeiro;
        
        System.out.println(" ");
        System.out.println("Texto claro:");
        
        while(aux1 != null){
            System.out.print(aux1.getBloco2());
            aux1 = aux1.getProximo();
        }
        
        System.out.println(" ");
    }
}
