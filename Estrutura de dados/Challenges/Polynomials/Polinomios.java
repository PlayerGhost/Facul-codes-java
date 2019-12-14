
package polinomios;

import java.util.Scanner;


public class Polinomios {
    public static void main(String[] args){
        Lista polinomio1 = new Lista();
        Lista polinomio2 = new Lista();
        Lista polinomio3 = new Lista();
        Scanner input = new Scanner(System.in);
        Polinomio aux;
        Polinomio aux1;
        int aux2;
        
        for (int i = 0; i < 3; i++){
            System.out.println("Infome o coeficiente e o expoente do termo do primeiro polinômio");
            polinomio1.adicionar(input.nextInt(), input.nextInt());
        }
        
        for (int i = 0; i < 3; i++){
            System.out.println("Infome o coeficiente e o expoente do termo do segundo polinômio");
            polinomio2.adicionar(input.nextInt(), input.nextInt());
        }
        
        for (int i = 0; i < 3; i++){
            aux = polinomio1.get(i);
            
            for (int x = 0; x < 3; x++){               
                aux1 = polinomio2.get(x);
                
                if (aux.getExpoente() == aux1.getExpoente()){
                    polinomio3.adicionar((aux.getCoeficiente()+aux1.getCoeficiente()),aux.getExpoente());
                }
            }
        }
        
        
                /*for (int i = 0; i < polinomio3.size(); i++){          
            aux = polinomio3.get(i);
            
            for (int x = 0; x < 3; x++){
                aux1 = polinomio1.get(x);
                aux2 = polinomio3.check(aux.getExpoente(), x);
                
                if(aux2 == 0){
                    polinomio3.adicionar(aux.getCoeficiente(),aux.getExpoente());
                }
            }
            
            for (int x = 0; x < 3; x++){
                aux1 = polinomio2.get(x);
                aux2 = polinomio3.check(aux.getExpoente(), x);
                
                if(aux2 == 0){
                    polinomio3.adicionar(aux.getCoeficiente(),aux.getExpoente());
                }
            }
        }*/
            
        polinomio1.print();
        polinomio2.print();
        polinomio3.print();
    }
}
