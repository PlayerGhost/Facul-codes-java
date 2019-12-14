
package arvorebusca;

public class Arvore {
    private No root;

    public Arvore() {
        root = null;
    }
    
    public void add(int elemento){
        if(root == null){
            root = new No(elemento);
        }else{
            root.add(elemento);
        }
    }
    
    public void remove(int value){ 
        if(root.getElemento() == value){
            No aux = new No(0);
            
            aux.setEsquerdo(root);
            root.remove(value, aux);
            root = aux.getEsquerdo();
        }else{
            root.remove(value, null);
        }
    }
    
    public void preOrdem(){
        root.preOrdem();
    }
    
    public void emOrdem(){
        root.emOrdem();
    }
    
    public void posOrdem(){
        root.posOrdem();
    }
}
