
package q4;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite 1 para novo e 2 para velho.");
        int imovel = input.nextInt();
        
        if(imovel == 1){
            System.out.println("Novo: ");
            Novo novo = new Novo(50, "Rua rua, 33", 100);
            System.out.println("Valor final: " + (novo.preco + novo.valorAdicional()));
        }
        
        else if(imovel == 2){
            System.out.println(" ");
            System.out.println("Velho: ");
            Velho velho = new Velho(20, "Rua rua, 34", 100);
            System.out.println("Valor final: " + (velho.preco - velho.valorDesconto()));
        }
    }   
}
