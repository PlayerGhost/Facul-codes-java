
package filaprioridade;

public class Fila {
    private No primeiro;
    private No ultimo;
    private No aux;

    public Fila() {
        primeiro = null;
        ultimo = null;
        aux = null;
    }

    public void enqueue(String tipoNome, int tipoNumero){
        No novo = new No(tipoNome, tipoNumero);
        
        if (primeiro == null){
            primeiro = novo;
            ultimo = novo;
        } else {
            aux = primeiro;
            
            while (aux != null && novo.getTipoNumero() < aux.getTipoNumero()){
                    aux = aux.getProximo();
            }
            
            if (aux == primeiro){
                novo.setProximo(primeiro);
                novo.setAnterior(null);
                primeiro.setAnterior(novo);
                primeiro = novo;                   
            } else if (aux == null){
                ultimo.setProximo(novo);
                novo.setAnterior(ultimo);
                ultimo = novo;
                ultimo.setProximo(null);                 
            } else {
                novo.setProximo(aux);
                aux.getAnterior().setProximo(novo);
                novo.setAnterior(aux.getAnterior());
                aux.setAnterior(novo);
            }            
        }
    }
    
    public void print(){
        aux = primeiro;

        while(aux != null){
            System.out.println(aux.getTipoNome());
            aux = aux.getProximo();
        }
    }
}
