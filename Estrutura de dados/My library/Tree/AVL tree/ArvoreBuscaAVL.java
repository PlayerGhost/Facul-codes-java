
package arvorebuscaavl;

public class ArvoreBuscaAVL {


    public static void main(String[] args) {
        ArvoreAVL arvoreAVL = new ArvoreAVL();  
        
        arvoreAVL.add(32);  
        arvoreAVL.add(31);  
        arvoreAVL.add(35);  
        arvoreAVL.add(33);  
        arvoreAVL.add(36);  
        arvoreAVL.add(38);  
  
        /* 
        35  
        / \  
        32 40  
        / \ \  
        10 25 50  
      
          
        */
        
        arvoreAVL.preOrdem();
        System.out.println();
        arvoreAVL.emOrdem();  
  
        arvoreAVL.remove(25);  
  
        /*
        1  
        / \  
        0 9  
        /     / \  
        -1 5 11  
        / \  
        2 6  
        */
        
        System.out.println();  

        arvoreAVL.preOrdem(); 
        
        System.out.println();
    }
    
}
