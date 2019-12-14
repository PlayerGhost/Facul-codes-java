
package hashinglinear;

import java.util.Scanner;

public class HashingLinear {

    public static void main(String[] args){
        HashAberto hashing = new HashAberto();
        
        hashing.put(34, 34);
        hashing.put(44, 44);
        hashing.put(44, 44);
        
        hashing.print();
        
        hashing.remover(44);
        
        System.out.println(" ");
        
        hashing.print();
    }
}
