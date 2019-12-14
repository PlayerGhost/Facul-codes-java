
package criptopilha;

import java.util.Scanner;

public class CriptoPilha {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("1 - Encriptar, 2 - Decriptar");
        int escolha = input.nextInt();
        
        if(escolha == 1){
            System.out.println("Informe a frase a ser encriptada.");
            input.nextLine();
            String frase = input.nextLine();
            
            System.out.println("Informe a quantidade de pilhas");
            int quantidade = input.nextInt();
            
            StackCripto stack = new StackCripto(quantidade);
            
            System.out.println("Frase encriptada:");
            System.out.println(stack.cript(frase));
        }
        else if(escolha == 2){
            System.out.println("Informe a frase a ser decriptada.");
            input.nextLine();
            String frase = input.nextLine();
            
            System.out.println("Informe a quantidade de pilhas");
            int quantidade = input.nextInt();
            
            StackCripto stack = new StackCripto(quantidade);
            
            System.out.println("Frase decriptada:");
            System.out.println(stack.decript(frase));
        }
    }
}
