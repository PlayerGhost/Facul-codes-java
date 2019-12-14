
package empresa;

import java.util.ArrayList;
import java.util.Scanner;


public class Empresa {
    public static Cargo salarios[] = new Cargo[4];
    public static Funcionario funcionarios[] = new Funcionario[4];
    public static Scanner input = new Scanner(System.in);
    public static int cont = 1;
    
    public static void menu(){
        Scanner x = new Scanner(System.in);

        System.out.println("Escolha sua opção:");
        System.out.println("1. Cadastrar os cargos da empresa.");
        System.out.println("2. Cadastrar os funcionários da empresa");
        System.out.println("3. Mostrar um relatório contendo o número, o nome e o valor do salário de todos os funcionários.");
        System.out.println("4. Mostrar o valor pago aos funcionários que pertençam a um cargo informado");
        System.out.println("5. Finalizar.");

        int userChoice = x.nextInt();

        switch(userChoice){
            case 1:
                opcao1();
                 break;
            case 2:
                opcao2();
                break;
            case 3:
                opcao3();
                break;
            case 4:
                opcao4();
                break;
            case 5:
                opcao5();
                break;   
        }   
    }
        
    public static void opcao1(Cargo salarios){
        Scanner x = new Scanner(System.in);

        for (int i = 0; i < 4; i++){
            if (cont >= 5){
                System.out.println("Salários dos cargos já cadastrados");
                menu();
            } else {
                cont++;                  
                System.out.println("Informe o salário do cargo " + i);
                salarios[i] = x.nextInt();
            }        
        }
    }
        
    public static void opcao2(){
        
    }

    public static void opcao3(){

    }

    public static void opcao4(){
        System.out.println("Informe o cargo");
    }

    public static void opcao5(){
        System.out.println("Programa finalizado!");
    }

    public static void main(String[] args) {
        
        
        
           
    }
}
