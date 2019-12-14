
package agenda;

import java.util.Scanner;


public class Agenda {
    static Pessoa pessoas[] = new Pessoa[15];
    static Scanner input = new Scanner(System.in);
    static int userChoice = 0;
    static int cont = 0;
    
    static void cadastrar(){
        pessoas[cont] = new Pessoa();
        
        System.out.print("Informe o nome, dia e mês do aniversário.");     
        pessoas[cont].setNome(input.nextLine());
        pessoas[cont].setDia(input.nextInt());
        pessoas[cont].setMes(input.nextInt());     
    }   

    public static void main(String[] args) {
        while (userChoice != 9){
            System.out.println("1. Cadastrar pessoa na agenda de aniversariantes (nome, dia e mês do aniversário).\n" +
                                "2. Excluir pessoa a partir do nome.\n" +
                                "3. Alterar dia ou mês a partir do nome.\n" +
                                "4. Consultar aniversariantes de uma data (dia e mês).\n" +
                                "5. Consultar aniversariantes por mês.\n" +
                                "6. Consultar aniversariantes pela letra inicial do nome.\n" +
                                "7. Mostrar toda a agenda ordenada pelo nome.\n" +
                                "8. Mostrar toda a agenda ordenada por mês.\n" +
                                "9. Sair");
            userChoice = input.nextInt();
            input.nextLine();
        
            switch (userChoice) {
                case 1:
                    if (cont <= 15){
                        cadastrar();
                        cont++;
                    } else{
                        System.out.println("O limite da agenda é de 15 pessoa");
                    }
                  break;
                case 2:
                  ;
                  break;
                case 3:
                  ;
                  break;
                case 4:
                  ;
                  break;
                case 5:
                  ;
                  break;
                case 6:
                  ;
                  break;
                case 7:
                  ;
                  break;
                case 8:
                  ;
                  break;
            }
        }     
    }
}
