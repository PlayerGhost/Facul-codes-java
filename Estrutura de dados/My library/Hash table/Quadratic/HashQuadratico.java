
package hashquadratico;


public class HashQuadratico {


    public static void main(String[] args) {
        HashQuad hashing = new HashQuad();
        
        hashing.put(12, 12);
        hashing.put(20, 20);
        hashing.put(28, 28);
        hashing.put(36, 36);
        
        hashing.put(44, 44);
        
        hashing.print();
        
        System.out.println(" ");
        
        hashing.remover(44);
        hashing.print();
    }
    
}
