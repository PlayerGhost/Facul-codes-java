
package arvoreniveis;

public class Arvore {
    private No root;
    private Fila fila;
    private No aux;

    public Arvore() {
        root = null;
        fila = new Fila();
        aux = null;
    }
    
    public void add(int elemento){
        if(root == null){
            root = new No(elemento);
        }else{
            root.add(elemento);
        }
    }
    
    public void printNiveis(){
        fila.enqueue(root);
        
        while(!fila.isEmpty()){
            aux = fila.dequeue();
            
            System.out.print(aux.getElemento() + " ");
            
            if(aux.getEsquerdo() != null){
                fila.enqueue(aux.getEsquerdo());
            }
            
            if(aux.getDireito() != null){
                fila.enqueue(aux.getDireito());
            }
        }
        
        System.out.println();
    }
}
