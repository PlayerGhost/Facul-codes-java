
package q4;

public class HashingAberto {
    private static int size;
    private static Lista tabela[];
    
    public HashingAberto() {
        size = 26;
        tabela = new Lista[size];
        
        for(int i = 0; i < size; i++){
            tabela[i] = new Lista();
        }
    }
    
    public void put(int inicial, String nome){
        int hash = (inicial % size);

        tabela[hash].adicionar(hash, nome);
    }
    
    public void remove(String pessoa){
        int hash = (pessoa.charAt(0) % size);
        
        if(!tabela[hash].remover(pessoa)){
            System.out.println("Essa pessoa não foi inserida.");
        }
    }
    
    public void consultarTodas(){
        for(int i = 0; i < size; i++){
            tabela[i].consultarTodas();
        }
        
        System.out.println(" ");
    }
    
    public void consultarUma(String nome) {
        int hash = (nome.charAt(0) % size);
        
        if(!tabela[hash].consultarUma(nome)){
            System.out.println("Essa pessoa não foi inserida.");
        }
        
        System.out.println(" ");
    }
    
    public void consultarInicial(char inicial){
        int hash = (inicial % size);

        tabela[hash].consultarInicial(inicial);
        
        System.out.println(" ");
    }
}
