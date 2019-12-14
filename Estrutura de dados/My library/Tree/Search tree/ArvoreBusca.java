
package arvorebusca;

public class ArvoreBusca {

    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        
        arvore.add(7);
        arvore.add(5);
        arvore.add(2);
        arvore.add(6);
        arvore.add(12);
        arvore.add(21);
        arvore.add(19);
        arvore.add(25);
        
        arvore.preOrdem();
        
        System.out.println();
        
        arvore.emOrdem();
        
        System.out.println();
        
        arvore.posOrdem();
        
        System.out.println();
        
        arvore.remove(12);
        
        arvore.preOrdem();
        
        System.out.println();

        arvore.emOrdem();

        System.out.println();

        arvore.posOrdem();

        System.out.println(); 
    }
    
}
