
package av1;

public class Fila {
    No primeiro;
    No ultimo;
    No aux;

    public Fila() {
        primeiro = null;
        ultimo = null;
        aux = null;
    }
    
    public void enqueue(int numero, String origem, String destino, int quantidadePassageiros){
        No novo = new No(numero, origem, destino, quantidadePassageiros);
        
        if(primeiro == null){
            primeiro = novo;
            ultimo = novo;
        }else {
            ultimo.setProximo(novo);
            ultimo = novo;
        }
    }
    
    public No dequeue(){
        No trem = primeiro;
        
        primeiro = primeiro.getProximo();

        return trem;
    }
    
    public void print(){
        aux = primeiro;
        
        while(aux != null){
            System.out.println("Informações do trem: ");
            System.out.println("Número: " + aux.getNumero());          
            System.out.println("Origem: " + aux.getOrigem());      
            System.out.println("Destino: " + aux.getDestino());          
            System.out.println("Quantida de passageiros: " + aux.getQuantidadePassageiros());          
            System.out.println(" ");
            aux = aux.getProximo();
        }
    }
}
