
package desafio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        int cases = Integer.parseInt(in.readLine());
        
        int cont = 0;
            
        for(int i = 0; i < cases; i++){
            String[] parameters = in.readLine().split(" ");
            String[] elements = in.readLine().split(" ");
            
            HashingAberto hash = new HashingAberto(Integer.parseInt(parameters[0]));
            
            for(int x = 0; x < Integer.parseInt(parameters[1]); x++){
                hash.put(Integer.parseInt(elements[x]));
            }
            
            hash.get(cases);
            cont++;
            
            if(cont < cases){
                System.out.println();
            }    
        }
    }
    
    public static class No {
        private int numb;
        private No proximo;

        public No(int numb) {
            this.numb = numb;
            this.proximo = null;
        }

        public int getNumb() {
            return numb;
        }

        public void setNumb(int numb) {
            this.numb = numb;
        }

        public No getProximo() {
            return proximo;
        }

        public void setProximo(No proximo) {
            this.proximo = proximo;
        }
    }
    
    public static class Lista {
        private No primeiro;
        private No ultimo;
        private No aux;

        public Lista() {
            primeiro = null;
            ultimo = null;
            aux = null;
        }

        public void adicionar(int numb) {
            No novo = new No(numb);

            if (primeiro == null) {
                primeiro = novo;
                ultimo = novo;
            } else {
                ultimo.setProximo(novo);
                ultimo = novo;
            }
        }


        public void get() {
            aux = primeiro;

            while (aux != null) {
                System.out.print(aux.getNumb() + " -> ");
                aux = aux.getProximo();
            }
        }
    }
    
    public static class HashingAberto {
        private int size;
        private Lista tabela[];
        private int cont = 0;

        public HashingAberto(int tam) {
            size = tam;
            tabela = new Lista[size];

            for(int i = 0; i < size; i++){
                tabela[i] = new Lista();
            }
        }

        public void put(int numb){
            int hash = (numb % size);

            tabela[hash].adicionar(numb);
        }

        public void get(int cases){
            cont++;
            
            for(int i = 0; i < size; i++){
                System.out.print(i + " -> ");
                
                tabela[i].get();
 
                System.out.println("\\");
            }    
        }
    }
}