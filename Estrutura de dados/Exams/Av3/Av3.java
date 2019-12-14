
package av3;

import java.util.Scanner;

public class Av3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hash hash = new Hash(26);
        int choice = 0;
        
        while(choice != 5){
            System.out.println("Escolha o que dejesa fazer:");
            System.out.println("1 - Cadastra pessoa");
            System.out.println("2 - Consultar todas as pessoas");
            System.out.println("3 - Consultar uma pessoa");
            System.out.println("4 - Consultar as pessoa com uma inicial digitada");
            System.out.println("5 - Sair");
            try {
                choice = input.nextInt();
            } catch (Exception e) {
                System.out.println("Informe apenas números inteiros!");
                choice = input.nextInt();
            }
            
            switch(choice){
                case 1:
                    System.out.println("Informe o nome");
                    input.nextLine();
                    String nome = input.nextLine();
                    
                    System.out.println("Informe o dia do aniversário");
                    String dia = input.next();
                    
                    System.out.println("Informe o mês do aniversário");
                    String mes = input.next();
                    
                    Pessoa pessoa = new Pessoa(nome, dia, mes);
                    hash.put(pessoa, pessoa.getNome().charAt(0));
                    
                    System.out.println("Pessoa adicionada com sucesso!");
                    break;
                case 2:
                    hash.print();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Informe o nome da pessoa");
                    input.nextLine();
                    nome = input.nextLine();
                    
                    hash.getNome(nome);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Informe a inicial");
                    String initial = input.next();
                    
                    hash.getInitial(initial.charAt(0));
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Sessão finaliza!");
                    break;
            }
        }
        
        
    }
}
