
package hashquadratico;

public class HashQuad {
    private static int size;
    private static No tabela[];

    public HashQuad() {
        size = 8;
        tabela = new No[size];
        
        for(int i = 0; i < size; i++){
            tabela[i] = null;
        }
    }
    
    public void put(int key, int value){
        int hash = hash(key);
        int cont = 0;
        
        while(cont <= size && tabela[hash] != null && tabela[hash].getKey() != key){
            hash = (hash + cont) % size;
            cont++;
        }
        
        if(cont <= size){
            tabela[hash] = new No(key, value);
        }else{
            System.out.println("Tabela cheia!");
        }
    }
    
    public void remover(int key){
        int hash = hash(key);
        int cont = 0;
        
        while(cont <= size && tabela[hash] != null && tabela[hash].getKey() != key){
            hash = (hash + cont) % size;
            cont++;
        }
        
        if(hash < size){
             tabela[hash] = null;
        }else{
            System.out.println("Elemento não encontrado");
        }
    }
    
    public int get(int key){
        int hash = hash(key);
        int cont = 0;
        
        while(tabela[hash] != null && tabela[hash].getKey() != key){
            hash = (hash + cont) % size;
            cont++;       
        }
        
        if(tabela[hash] == null){
            return hash;
        }else{
            return size;
        }
    }
    
    public int hash(int value){
        return value % size;
    }
    
    public void print(){
        for(int i = 0; i < size; i++){
            if(tabela[i] != null){
                System.out.println("Key:" + tabela[i].getKey() + " Value:" + tabela[i].getValue());
            }
        }
    }
}
