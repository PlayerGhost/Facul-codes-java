
package q15;

import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
        Pilha novo = new Pilha();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a expressão");
        String espressao = input.nextLine();
        
        for(int i = 0; i < espressao.length(); i++){
            if(espressao.charAt(i) == '('){
                novo.push(espressao.charAt(i));   
            }else if(espressao.charAt(i) == ')'){
                novo.pop();
            }
        }
        
        novo.print();
        System.out.println(" ");
        
        boolean check = novo.pop();
        
        if(check == true){
            System.out.println("A expressâo está correta.");
        }else{
            System.out.println("A expressâo está incorreta.");
        }
    }
    
}
