
package av3;

public class Arvore {
    private No root;

    public Arvore() {
        root = null;
    }
    
    public boolean isEmpty(){
        if(root == null){
            return true;
        }else{
            return false;
        } 
    }
    
    public void add(Pessoa pessoa){
        if(root == null){
            root = new No(pessoa);
        }else{
            root.add(pessoa);
        }
    }
    
    public void print(){
        if(root != null){
            print(root);
        }
    }
    
    public void print(No elemento){
        if(elemento.getEsquerdo() != null){
            print(elemento.getEsquerdo());
        }
        
        System.out.println("Nome: " + elemento.getElemento().getNome());
        System.out.println("Dia do aniversário: " + elemento.getElemento().getDia());
        System.out.println("Mês do aniversário: " + elemento.getElemento().getMes());
        System.out.println();
        
        if(elemento.getDireito() != null){
            print(elemento.getDireito());
        }
    }
    
    public void getNome(String nome){
        if(root != null){
            getNome(nome, root);
        }
    }
    
    public void getNome(String nome, No elemento){
        if(elemento.getEsquerdo() != null){
            getNome(nome, elemento.getEsquerdo());
        }
        
        if(elemento.getElemento().getNome().equals(nome)){
            System.out.println("Nome: " + elemento.getElemento().getNome());
            System.out.println("Dia do aniversário: " + elemento.getElemento().getDia());
            System.out.println("Mês do aniversário: " + elemento.getElemento().getMes());
        }

        if(elemento.getDireito() != null){
            getNome(nome, elemento.getDireito());
        }
        
        System.out.println();
    }
    
    public void getInitial(char initial){
        if(root != null){
            getInitial(initial, root);
        }
    }
    
    public void getInitial(char initial, No elemento){
        if(elemento.getEsquerdo() != null){
            getInitial(initial, elemento.getEsquerdo());
        }
        
        if(elemento.getElemento().getNome().charAt(0) == initial){
            System.out.println("Nome: " + elemento.getElemento().getNome());
            System.out.println("Dia do aniversário: " + elemento.getElemento().getDia());
            System.out.println("Mês do aniversário: " + elemento.getElemento().getMes());
        }

        if(elemento.getDireito() != null){
            getInitial(initial, elemento.getDireito());
        }
        
        System.out.println();
    }
}
