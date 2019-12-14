
package av1;

import java.util.Scanner;


public class Simulador {

    public static void main(String[] args) {
        Lista simulador = new Lista();
        Scanner input = new Scanner(System.in);
        int aux = 0;
        
        while(aux != 1){
            System.out.println("Informe o tipo do aparelho.");
            String tipo = input.nextLine();
            System.out.println("A potência em Watts.");
            int potencia = input.nextInt();
            System.out.println("A quantidade desse tipo de aparelho na sua residência.");
            int quantidade = input.nextInt();
            System.out.println("O tempo médio de uso mensal de cada unidade em horas.");
            float tempo = input.nextFloat();
            System.out.println("0 - Terminar");
            simulador.adicionar(tipo, potencia, quantidade, tempo);
            
            System.out.println("DIGITE 1 PARA TERMINAR E 2 PARA CONTINUAR.");
            aux = input.nextInt();
            input.nextLine();
        }

        simulador.print();
    }
    
}
