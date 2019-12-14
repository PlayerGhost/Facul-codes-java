
package av3;

public class Hash {
    private Arvore tabel[];
    private int size;
    int cont;
    int cont1;

    public Hash(int size) {
        this.size = size;
        tabel = new Arvore[size];
        cont = 0;
        cont1 = 0;
        
        for (int i = 0; i < size; i++) {
            tabel[i] = new Arvore();
        }
    }
    
    public void put(Pessoa pessoa, int key){
        int hash = (key % size);
        
        tabel[hash].add(pessoa, key);
    }
    
    public void print(){
        boolean status = false;
        
        for (int i = 0; i < size; i++) {
            status = tabel[i].print();
        }
        
        if(!status){
            System.out.println("Agenda vazia!");
        }
    }
    
    public void getNome(String nome){
        boolean status = false;
        
        int cont = 0;
        
        for (int i = 0; i < size; i++) {
            status = tabel[i].getNome(nome);
            
            if(status == true){
                cont++;
            }
        }
        
        if(cont > 0){
            cont = 0;
            System.out.println("Pessoa não encontrada");
        }
    }
    
    public void getInitial(char initial){
        boolean status = false;
        
        int cont = 0;
        
        for (int i = 0; i < size; i++) {
            status = tabel[i].getInitial(initial);
            
            if(status == true){
                cont++;
            }
        }
        
        if(cont > 0){
            cont = 0;
            System.out.println("Não tem ninguèm na agenda com essa inicial!");
        }
    }
}
