
package av1;

import java.util.Scanner;

public class Av1 {

    public static void main(String[] args) {
        Fila fila = new Fila();
        Pilha pilha = new Pilha();
        Scanner input = new Scanner(System.in);
        
        int escolha = -1;
        int quantidade = 0;
        
        while(escolha != 0){
            System.out.println("1 - Cadastrar um trem, 2 - Mostrar a fila, 3 - Inverter a fila, 0 - Sair.");
            escolha = input.nextInt();
            
            switch(escolha){
                case 1:
                    System.out.println("Informe o número do trem");
                    int numero = input.nextInt();

                    System.out.println("Informe a origem do trem");
                    String origem = input.next();

                    System.out.println("Informe o destino do trem");
                    String destino = input.next();

                    System.out.println("Informe a quantidade de passageiros do trem");
                    int quantidadePassageiros = input.nextInt();
                    
                    fila.enqueue(numero, origem, destino, quantidadePassageiros);
                    quantidade++;
                    break;
                case 2 :
                    fila.print();
                    break;
                case 3:
                    while(fila.primeiro != null){
                        No aux = fila.dequeue();
                        pilha.push(aux.getNumero(), aux.getOrigem(), aux.getDestino(), aux.getQuantidadePassageiros());
                    }
                    
                    while(pilha.topo != null){
                        No aux1 = pilha.pop();
                        fila.enqueue(aux1.getNumero(), aux1.getOrigem(), aux1.getDestino(), aux1.getQuantidadePassageiros());
                    }
                    break;             
            }
        }
    }   
}
