
package av3;

public class Hash {
    private Arvore tabel[];
    private int size;
    
    public Hash(int size) {
        this.size = size;
        tabel = new Arvore[size];
        
        for (int i = 0; i < size; i++) {
            tabel[i] = new Arvore();
        }
    }
    
    public int hashFunction(int key){
        return key % size;
    }
    
    public void put(Pessoa pessoa, int key){
        int hash = hashFunction(key);
        
        tabel[hash].add(pessoa);
    }
    
    public void print(){
        int cont = 0;
        
        for (int i = 0; i < size; i++) {
            if(!tabel[i].isEmpty()){
                tabel[i].print();
                cont++;
            } 
        }
        
        if(cont == 0){
            System.out.println("Agenda vazia!");
        }
    }
    
    public void getNome(String nome){
        int hash = hashFunction(nome.charAt(0));
        
        if(tabel[hash].isEmpty()){
            System.out.println("Essa pessoa não está na agenda!");
        }else{
            tabel[hash].getNome(nome);
        }
    }
    
    public void getInitial(char initial){
        int hash = hashFunction(initial);
        
        if(tabel[hash].isEmpty()){
            System.out.println("Essa pessoa não está na agenda!");
        }else{
            tabel[hash].getInitial(initial);
        }
    }
}
