package q17;

public class Pilha {
    private Fila f1;
    private Fila f2;
    private int cont = 0;
    
    public Pilha() {
        f1 = new Fila();
        f2 = new Fila();
    }
    
    //Preenche a fila 1
    public void push(int numero){    
        f1.enqueue(numero);
        cont++;
    }
    
    //Abstração de remover de uma uma pilha que na verdade são duas filas
    public void pop(){
        //MOVE os elementos da fila 1 para a fila 2, até que a fila 1 só possua o ultimo elemento
        for(int i = 0; i < cont-1; i++){ 
            f2.enqueue(f1.pick().getCaracetere());
            f1.dequeue();
        }
        
        //Remove esse último elemento que sobrou na fila 1
        f1.dequeue();
        cont--;
        
        //MOVE todos os elementos da fila 2 para a fila 1. Sendo assim, esse processo emulou uma pilha 
        for(int i = 0; i < cont; i++){ 
            f1.enqueue(f2.pick().getCaracetere());
            f2.dequeue();
        }
    }
}