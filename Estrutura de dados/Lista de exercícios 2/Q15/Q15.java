
package Q15;

import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        Scanner input = new Scanner(System.in);
        boolean check = true;
        boolean aux = false;
        
        System.out.println("Informe a expressâo");
        String expressao = input.nextLine();
       
        for(int i = 0; i < expressao.length(); i++){                    
            if(expressao.charAt(i) == '('){
                pilha.push(expressao.charAt(i));
            }
            else if(expressao.charAt(i) == ')'){
                check = pilha.pop();
                
                if(check == false){
                    System.out.println("A expressão está incorreta");
                    aux = true;
                    break;
                }
            }
        }
        
        if(aux == false){  
            if(pilha.isEmpty()){
                System.out.println("A expressão está correta");
            }else{
                System.out.println("A expressão está incorreta");
            }
        }
        
    }
    
}
