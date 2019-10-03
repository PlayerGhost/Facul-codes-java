
package Q15;

public class Pilha {
    private Caractere topo;

    public Pilha() {
        topo = null;
    }
    
    public void push(char letra){
        Caractere novo = new Caractere(letra);
        
        novo.setProximo(topo);
        topo = novo;
    }
    
    public boolean pop(){
        if (topo == null){
            return false;
        }else{
            topo = topo.getProximo();
            return true;
        }
    }
    
    public boolean isEmpty(){
        if (topo == null){
            return true;
        }else{
            return false;
        }
    }
}
