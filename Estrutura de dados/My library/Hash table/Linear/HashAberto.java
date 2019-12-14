
package hashinglinear;

public class HashAberto {
    private static int size;
    private static Hash tabela[];

    public HashAberto() {
        size = 8;
        tabela = new Hash[size];
        
        for(int i = 0; i < size; i++){
            tabela[i] = null;
        }
    }
    
    public void put(int key, int value){
        int hash = (key % size);
        
        while(tabela[hash] != null)
            hash = (hash + 1) % size;
        
        tabela[hash] = new Hash(key, value);
    }
    
    public void remover(int key){
        int hash = (key % size);
        
        while(tabela[hash] != null && tabela[hash].getKey() != key){
             hash = (hash + 1) % size;  
        }
        
        if(tabela[hash] != null){
            tabela[hash] = null;
        }else{
            System.out.println("Não encontrado");
        }
    }
    
    public int get(int key){
        int hash = (key % size);
        
        while(tabela[hash] != null && tabela[hash].getKey() != key){
             hash = (hash + 1) % size;       
        }
        
        if(tabela[hash] == null){
            return -1;
        }else{
            return tabela[hash].getValue();
        }
    }
    
    public void print(){
        for(int i = 0; i < size; i++){
            if(tabela[i] != null){
                System.out.println("Key:" + tabela[i].getKey() + " Value:" + tabela[i].getValue());
            }
        }
    }
}
