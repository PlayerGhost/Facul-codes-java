
package q3;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("1 - Ingresso normal, 2 - Ingresso VIP");
        int ingresso = input.nextInt();
        
        if(ingresso == 1){
            System.out.println("Seu ingresso é Normal.");
            Normal normal = new Normal(1);
            System.out.println("Valor: " + normal.valor);
        }

        else if(ingresso == 2){
            System.out.println("Seu ingresso é VIP.");
            System.out.println("Digite 1 para camarote superior e 2 para camarote inferior");
            int local = input.nextInt();

            if(local == 1){
                System.out.println("Camarote superior. ");
                CamaroteSuperior camaroteSuperior = new CamaroteSuperior(1, 1, 1);
                System.out.println("Valor VIP no camarote superior: " + camaroteSuperior.valorIngresso());
            }

            else if(local == 2){
                System.out.println("Camarote inferior.");
                CamaroteInferior camaroteInferior = new CamaroteInferior("A", 1, 1);
                System.out.println("Valor VIP no camarote inferior: " + camaroteInferior.valorVIP());
                camaroteInferior.local();  
            }
        }  
    }
}
