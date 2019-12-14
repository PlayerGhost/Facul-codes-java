
package desafio2;

import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        SetOfStacks setOfStacks = new SetOfStacks();
        Scanner input = new Scanner(System.in);
       
        int size = 10;
        setOfStacks.sizeEachStack(size);
        
        for (int i = 0; i < 30; i++){
            setOfStacks.push(i);
        }

        for (int i = 0; i < 15; i++){
            setOfStacks.pop();
        }
    }
}
