
package exercicio.pkg1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fila fila = new Fila();
        Pilha pilha = new Pilha();
        
        for (int i = 0; i < 5; i++){
            System.out.println("Informe um número para a fila.");
            
            fila.adicionar(input.nextInt());
        }
        
        for (int i = 0; i < 5; i++){
            System.out.println("Informe um número pilha.");
            
            pilha.adicionar(input.nextInt());
        }
        
        System.out.println("Números das duas estruturas.");
        fila.print();
        pilha.print();
        
        System.out.println("Números da fila.");
        fila.print();
        
        System.out.println("Números da pilha.");
        pilha.print();
    }
}
