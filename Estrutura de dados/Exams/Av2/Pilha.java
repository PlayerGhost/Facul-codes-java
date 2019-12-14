
package av1;

public class Pilha {
    No topo;

    public Pilha() {
        topo = null;
    }
    
    public void push(int numero, String origem, String destino, int quantidadePassageiros){
        No novo = new No(numero, origem, destino, quantidadePassageiros);
        
        novo.setProximo(topo);
        topo = novo;
    }
    
    public No pop(){
        No trem = topo;
        
        topo = topo.getProximo();
        
        return trem;
    }
}
