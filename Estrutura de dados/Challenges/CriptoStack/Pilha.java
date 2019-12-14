
package criptopilha;

public class Pilha {
    private No topo;

    public Pilha() {
        topo = null;
    }
    
    public void push(char letra){
        No novo = new No(letra);
        
        novo.setProximo(topo);
        topo = novo;
    }
    
    public No pop(){
        No aux = topo;
        
        topo = topo.getProximo();
        
        return aux; 
    }
}
