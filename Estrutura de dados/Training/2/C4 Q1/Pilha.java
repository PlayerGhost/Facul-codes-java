
package exercicio.pkg1;

public class Pilha {
    private No topo;
    private No aux;
    
    public Pilha() {
        topo = null;
        aux = null;
    }
    
    public void adicionar(int numero){
        No novo = new No(numero);
        
        novo.setProximo(topo);
        topo = novo;
    }
    
    public void print(){
        aux = topo;
        
        while(aux != null){
            System.out.println(aux.getNumero() + " ");
            
            aux = aux.getProximo();
        }
    }
}
