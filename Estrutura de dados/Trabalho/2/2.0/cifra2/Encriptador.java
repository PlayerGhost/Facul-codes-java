
package cifra2;

public class Encriptador extends Saida{
    ListaCircular tabela;
    ListaCircular chave;
    Saida saida;
    Alfabeto aux;
      
    public Encriptador() {
        tabela = new ListaCircular();
        chave = new ListaCircular();
        saida = new Saida();
        aux = null;
    }
    
    public void preencherAlfabeto(){
        char c = 'A';
        
        for(int i = 0; i < 26; i++){
            tabela.adicionar(c++, i);
        }
    }
    
    public Alfabeto posicao(char letra){
        aux = tabela.primeiro;
        
        do{
            if(aux.getLetra() == Character.toUpperCase(letra)){
                break;
            }
            
            aux = aux.getProximo();
        }while(aux != tabela.primeiro);
        
        return aux;
    }
    
    public void encriptar(String texto, String chave, int size){
        preencherAlfabeto();
        int index = 0;
        String key = chave;
        
        while (index < texto.length()){
            saida.enqueue(texto.substring(index, Math.min((index+size), texto.length())));
            index+= size;
        }
        
        aux1 = saida.primeiro;
        
        while(key.length() < aux1.getBloco1().length()){
            key += key;
        }
        
        while(aux1 != null){
            String bloco1 = aux1.getBloco1();
            String bloco2 = "";
            
            for (int i = 0; i < bloco1.length(); i++){
                bloco2 += ConsultarEncript(bloco1.charAt(i), key.charAt(i));
            }
 
            aux1.setBloco2(bloco2);
            aux1 = aux1.getProximo();
        }
        
        saida.printCript();
    }
    
    public void decriptar(String texto, String chave, int size){
        preencherAlfabeto();
        int index = 0;
        String key = chave;
        
        while (index < texto.length()){
            saida.enqueue(texto.substring(index, Math.min((index+size), texto.length())));
            index+= size;
        }
        
        aux1 = saida.primeiro;
        
        while(key.length() < aux1.getBloco1().length()){
            key += key;
        }
        
        while(aux1 != null){
            String bloco1 = aux1.getBloco1();
            String bloco2 = "";
            
            for (int i = 0; i < bloco1.length(); i++){
                bloco2 += ConsultarDecript(bloco1.charAt(i), key.charAt(i));
            }
 
            aux1.setBloco2(bloco2);
            aux1 = aux1.getProximo();
        }
        
        saida.printDecript();
    }
    
    public char ConsultarEncript(char letra, char chave){
        boolean noLetter = false;
        boolean upperCase = false;
        char x = 0;
        int index = 0;
        
        if(letra < 'A' || letra > 'Z'){
            if(letra < 'a' || letra > 'z'){
                noLetter = true;
            }else{
                aux = posicao(Character.toUpperCase(chave));              
            }
        }else{
            upperCase = true;
            aux = posicao(chave);      
        }
        
        if(noLetter){
            return letra;
        }else{
            index = aux.getIndex();
            aux = posicao(Character.toUpperCase(letra)); 
            
            for(int i = 0; i <= index; i++){
                x = aux.getLetra();
                aux = aux.getProximo();
            }
            
            if(upperCase){
                return x;
            }else{
                return Character.toLowerCase(x);
            }
        }    
    }
    
    public char ConsultarDecript(char letra, char chave){
        boolean noLetter = false;
        boolean upperCase = false;
        char x = letra;
        int index = 0;
        
        if(letra < 'A' || letra > 'Z'){
            if(letra < 'a' || letra > 'z'){
                noLetter = true;
            }else{
                aux = posicao(Character.toUpperCase(chave));              
            }
        }else{
            upperCase = true;
            aux = posicao(chave);      
        }
        
        if(noLetter){
            return letra;
        }else{
            index = aux.getIndex();
            aux = posicao(Character.toUpperCase(letra)); 
            
            for(int i = 0; i <= index; i++){
                x = aux.getLetra();
                aux = aux.getAnterior();
            }

            if(upperCase){
                return x;
            }else{
                return Character.toLowerCase(x);
            }
        }
    }
}
