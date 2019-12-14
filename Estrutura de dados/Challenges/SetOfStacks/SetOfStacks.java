
package desafio2;

public class SetOfStacks {
    private No topo;
    private Pilha aux;
    private int sizeEachStack;

    public SetOfStacks() {
        topo = null;
        aux = null;
        sizeEachStack = 0;
    }
    
    public void sizeEachStack(int size){
        sizeEachStack = size;
    }
            
    public void push(int numero){
        if(topo == null){
            Pilha pilha = new Pilha();
            pilha.push(numero);
            
            No novo = new No(pilha);
            
            novo.setProximo(topo);
            topo = novo;
        }else{
            aux = (Pilha) topo.getElemento();
                    
            if(aux.size() < sizeEachStack){
                aux.push(numero);
                topo.setElemento(aux);
            }else{
                Pilha pilha = new Pilha();
                pilha.push(numero);

                No novo = new No(pilha);

                novo.setProximo(topo);
                topo = novo;
            }
        }
    }
    
    public void pop(){
        aux = (Pilha) topo.getElemento();
        
        if(aux.size() > 1){
            aux.pop();
        }else{
            aux.pop();
            topo = topo.getProximo();
        }
    }
}
