package desafio2;

public class Pilha {
    private No topo;
    private int size;

    public Pilha() {
        topo = null;
        size = 0;
    }
    
    public void push(int numero){
        No novo = new No(numero);
        
        novo.setProximo(topo);
        topo = novo;
        size++;
    }
    
    public void pop(){
        topo = topo.getProximo();
        size--;
    }
    
    public int size(){
        return size;
    }
}