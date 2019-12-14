
package q17;

import java.util.Scanner;

public class Q17 {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        Scanner input = new Scanner(System.in);

        //Preenche a pilha
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        
        //Remove o elemento que está no topo da pilha, que no caso é o 5
        pilha.pop();
    }    
}
