
package numerosamgaveis;

import java.util.Scanner;

public class NumerosAmgaveis {
    static void check(int x, int y){
        int soma = 0;
                
        for(int i = 1; i <= y/2; i++){   
            if (y%i <= 0){        
                soma += i;
            }
        }
 
        if (soma == x){
            System.out.println("Esses números são amigaveis.");
        } else {
            System.out.println("Esses números não são amigaveis.");
        }
    }
            
    public static void main(String[] args) {
        int numero1;
        int numero2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número.");
        numero1 = input.nextInt();
         
        System.out.println("Informe o segundo número.");
        numero2 = input.nextInt();
        
        
        check(numero1, numero2);
         
    }
    
}
