
package av1;

import java.util.Scanner;


public class Simulador {

    public static void main(String[] args) {
        Lista simulador = new Lista();
        Scanner input = new Scanner(System.in);
        int aux = 0;
        
        while(aux != 1){
            System.out.println("Informe o tipo do aparelho.");
            System.out.println("A potência em Watts.");
            System.out.println("A quantidade desse tipo de aparelho na sua residência.");
            System.out.println("O tempo médio de uso mensal de cada unidade em horas.");
            System.out.println("0 - Terminar");
            simulador.adicionar(input.nextLine(), input.nextFloat(), input.nextInt(), input.nextInt());
            
            System.out.println("DIGITE 1 PARA TERMINAR E 2 PARA CONTINUAR.");
            aux = input.nextInt();
            input.next();
        }

        simulador.print();
    }
    
}
