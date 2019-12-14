
package criptopilha;

public class StackCripto {
    Lista lista;
    No aux; 
            
    public StackCripto(int quantidade) {
        lista = new Lista();
        aux = null;
        
        for(int i = 0; i < quantidade; i++){
            Pilha novo = new Pilha();
            lista.adicionar(novo);
        }
    }
    
    public String cript(String frase){
        aux = lista.primeiro;
        Pilha aux1;
        String cript = "";
        
        for(int i = 0; i < frase.length(); i++){
            aux1 = (Pilha) aux.getElemento();
            
            aux1.push(frase.charAt(i));
            
            aux.setElemento(aux1);
            
            aux = aux.getProximo();
        }
        
        aux = lista.primeiro;
        
        for(int i = 0; i < frase.length(); i++){
            aux1 = (Pilha) aux.getElemento();
            
            cript += aux1.pop().getElemento();
            
            aux = aux.getProximo();
        }
        
        return cript;
    }
    
    public String decript(String frase){
        aux = lista.primeiro;
        Pilha aux1;
        String decript = "";
        
        for(int i = 0; i < frase.length(); i++){
            aux1 = (Pilha) aux.getElemento();
            
            aux1.push(frase.charAt(i));
            
            aux.setElemento(aux1);
            
            aux = aux.getProximo();
        }
        
        aux = lista.primeiro;
        
        for(int i = 0; i < frase.length(); i++){
            aux1 = (Pilha) aux.getElemento();
            
            decript += aux1.pop().getElemento();
            
            aux = aux.getProximo();
        }
        
        return decript;
    }
}
