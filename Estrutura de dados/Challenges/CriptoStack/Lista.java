
package criptopilha;

public class Lista {
    No primeiro;
    No ultimo;
    No anterior;
    No aux;

    public Lista(){
        primeiro = null;
        ultimo = null;
        ultimo = null;
    }

    public void adicionar(Pilha pilha){
        No novo  = new No(pilha);
        
        if (primeiro == null){
            primeiro = novo;
            ultimo = novo;
            novo.setProximo(primeiro);
            novo.setAnterior(primeiro);
        }else{
            ultimo.setProximo(novo);
            novo.setAnterior(ultimo);
            ultimo = novo;
            ultimo.setProximo(primeiro);
            primeiro.setAnterior(ultimo);
        }
    }
}
