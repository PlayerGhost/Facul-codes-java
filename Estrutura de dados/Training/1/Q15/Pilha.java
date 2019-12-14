
package q15;

public class Pilha {
    private Elemento topo;
    private Elemento aux;
    
    public Pilha() {
        topo = null;
        aux = null;
    }
    
    public void push(char caractere){
        Elemento novo = new Elemento(caractere);
        
        novo.setProximo(topo);
        topo = novo;
    }
    
    public boolean pop(){
        boolean temp = false;
        
        if (topo == null){
            temp = true;
        }else{
            topo = topo.getProximo();
        }
        
        return temp;
    }
    
    public void print(){
        aux = topo;
        
        while(aux != null){
            System.out.print(aux.getCaractere() + "");
            
            aux = aux.getProximo();
        }
    }
}
