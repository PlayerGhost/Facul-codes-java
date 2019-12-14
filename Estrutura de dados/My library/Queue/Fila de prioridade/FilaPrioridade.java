
package filaprioridade;

import java.util.Scanner;

public class FilaPrioridade {

    public static void main(String[] args) {
        Fila fila = new Fila();
        Scanner input = new Scanner(System.in);
        int tipo = -1;
        
        while(tipo != 0){
            System.out.println("1 - Pessoa normal, 2 - idoso, 3 - cadeirante, 0 - Sair");
            tipo = input.nextInt();
            
            if(tipo > 0){
                String pessoa = null;

                switch(tipo) {
                    case 1:
                        pessoa = "normal";
                        break;
                    case 2:
                        pessoa = "idoso";
                        break;
                    case 3:
                        pessoa = "cadeirante";
                        break;
                }

                fila.enqueue(pessoa, tipo);
            }
        }
        
        fila.print();
    }
}
