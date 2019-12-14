
package q4;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashingAberto hashing = new HashingAberto();
        int choice = 0;
        
        while(choice != 6){
            System.out.println("Escolha sua opção:");
            System.out.println("1 - Inserir (Apenas Nome)");
            System.out.println("2 - Consultar todas as pessoas");
            System.out.println("3 - Consultar uma pessoa");
            System.out.println("4 - Consultar as pessoas com uma inical digitada");
            System.out.println("5 - Excluir uma pessoa");
            System.out.println("6 - Sair");
            
            try {
                choice = input.nextInt();
            }
            catch(Exception e) {
                System.out.println("Insira um número");
                input.nextLine();
                choice = input.nextInt();
            }
            
            input.nextLine();
            
            switch(choice){
                case 1:
                    System.out.println("Infome o nome");
                    String nome = input.nextLine();
                    
                    hashing.put(nome.charAt(0), nome);
                    break;
                case 2:
                    hashing.consultarTodas();
                    break;
                case 3:
                    System.out.println("Informe o nome da pessoa");
                    hashing.consultarUma(input.nextLine());
                    break;
                case 4:
                    System.out.println("Informe a inicial");
                    hashing.consultarInicial(input.next().charAt(0));
                    break;
                case 5:
                    System.out.println("Informe o nome da pessoa");
                    hashing.remove(input.nextLine());
                    break;
            }
        }
    } 
}
