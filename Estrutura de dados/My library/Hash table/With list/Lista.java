
package q4;

public class Lista {
    private No primeiro;
    private No ultimo;
    private No aux;
    private No aux1;

    public Lista() {
        primeiro = null;
        ultimo = null;
        aux = null;
        aux1 = null;
    }

    public void adicionar(int key, String nome) {
        No novo = new No(key, nome);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.setProximo(novo);
            novo.setAnterior(ultimo);
            ultimo = novo;
        }
    }

    public boolean remover(String pessoa) {
        aux = primeiro;
        boolean exist = false;
        
        while(aux != null){
            if(aux.getNome().equals(pessoa)){
                if(aux == ultimo){
                    ultimo = aux.getAnterior();
                    aux.getAnterior().setProximo(null);
                    aux = null;
                }else{
                    aux.getAnterior().setProximo(aux.getProximo());
                    aux.getProximo().setAnterior(aux.getAnterior());
                    aux.setAnterior(null);
                    aux.setProximo(null);
                }
                
                exist = true;
                
                break;
            }
            
            aux = aux.getProximo();
        }
        
        return exist;
    }

    public void consultarTodas() {
        aux = primeiro;

        while (aux != null) {
            System.out.println("Nome: " + aux.getNome() + " Key: " + aux.getKey());
            aux = aux.getProximo();
        }
    }
    
    public boolean consultarUma(String nome) {
        aux = primeiro;
        boolean exist = false;
        
        while (aux != null) {
            if(aux.getNome().equals(nome)){
                System.out.println("Nome: " + aux.getNome() + " Key: " + aux.getKey());
                exist = true;
            }
         
            aux = aux.getProximo();
        }
        
        return exist;
    }
    
    public void consultarInicial(char inicial) {
        aux = primeiro;
        
        
        while (aux != null) {
            if(aux.getNome().charAt(0) == inicial){
                System.out.println("Nome: " + aux.getNome() + " Key: " + aux.getKey());
            }
         
            aux = aux.getProximo();
        }
    }
}
