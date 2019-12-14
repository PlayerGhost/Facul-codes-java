
package arvoreniveis;

public class ArvoreNiveis {

    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        
        arvore.add(6);
        arvore.add(2);
        arvore.add(1);
        arvore.add(4);
        arvore.add(3);
        arvore.add(5);
        arvore.add(8);
        arvore.add(7);
        arvore.add(9);
        
        arvore.printNiveis();
    }
    
}
