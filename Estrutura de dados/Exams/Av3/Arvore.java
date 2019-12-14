
package av3;

public class Arvore {
    private No root;
    int cont;
    int cont1;

    public Arvore() {
        root = null;
        cont = 0;
        cont1 = 0;
    }
    
    public void add(Pessoa pessoa, int key){
        if(root == null){
            root = new No(pessoa);
        }else{
            root.add(pessoa, key);
        }
    }
    
    public boolean print(){
        if(root != null){
            print(root);
            return true;
        }else{
            return false;
        }
    }
    
    public void print(No elemento){
        if(elemento.getEsquerdo() != null){
            print(elemento.getEsquerdo());
        }
        
        System.out.println("Nome: " + elemento.getElemento().getNome());
        System.out.println("Dia do aniversário: " + elemento.getElemento().getDia());
        System.out.println("Mês do aniversário: " + elemento.getElemento().getMes());
        
        if(elemento.getDireito() != null){
            print(elemento.getDireito());
        }
        
        System.out.println();
    }
    
    public boolean getNome(String nome){
        if(root != null){
            getNome(nome, root);
        }
        
        if(cont > 0){
            cont = 0;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean getNome(String nome, No elemento){
        if(elemento.getEsquerdo() != null){
            getNome(nome, elemento.getEsquerdo());
        }
        
        if(elemento.getElemento().getNome().equals(nome)){
            System.out.println("Nome: " + elemento.getElemento().getNome());
            System.out.println("Dia do aniversário: " + elemento.getElemento().getDia());
            System.out.println("Mês do aniversário: " + elemento.getElemento().getMes());
            cont++;
        }

        if(elemento.getDireito() != null){
            getNome(nome, elemento.getDireito());
        }
        
        System.out.println();
        
        if(cont > 0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean getInitial(char initial){
        if(root != null){
            getInitial(initial, root);
        }
        
        if(cont1 > 0){
            cont1 = 0;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean getInitial(char initial, No elemento){
        if(elemento.getEsquerdo() != null){
            getInitial(initial, elemento.getEsquerdo());
        }
        
        if(elemento.getElemento().getNome().charAt(0) == initial){
            System.out.println("Nome: " + elemento.getElemento().getNome());
            System.out.println("Dia do aniversário: " + elemento.getElemento().getDia());
            System.out.println("Mês do aniversário: " + elemento.getElemento().getMes());
            cont1++;
        }

        if(elemento.getDireito() != null){
            getInitial(initial, elemento.getDireito());
        }
        
        System.out.println();
        
        if(cont1 > 0){
            return true;
        }else{
            return false;
        }
    }
}
