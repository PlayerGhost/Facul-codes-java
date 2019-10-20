
package cifra2;

public class Encriptador {
    ListaCircular tabela;
    ListaCircular chave;
    Saida temp;
    Alfabeto aux;
      
    public Encriptador() {
        tabela = new ListaCircular();
        chave = new ListaCircular();
        temp = new Saida();
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
        
        while (index < texto.length()){
            String blocoEnc = texto.substring(index, Math.min((index+size), texto.length()));
            String blocoDec = "";
            
            for (int i = 0; i < blocoEnc.length(); i++){
                blocoDec += ConsultarEncript(blocoEnc.charAt(i), chave.charAt(i));
            }
            
            temp.enqueue(blocoEnc, blocoDec);
            index+= size;
        }
        
        temp.print();
    }
    
    public void decriptar(String texto, String chave, int size){
        preencherAlfabeto();
        int index = 0;
        
        while (index < texto.length()){
            String blocoDec = texto.substring(index, Math.min((index+size), texto.length()));
            String blocoEnc = "";
            
            for (int i = 0; i < blocoDec.length(); i++){
                blocoEnc += ConsultarDecript(blocoDec.charAt(i), chave.charAt(i));
            }
            
            temp.enqueue(blocoEnc, blocoDec);
            index+= size;
        }

        temp.print();
    }
    
    public char ConsultarEncript(char letra, char chave){
        boolean noLetter = false;
        boolean upperCase = false;
        char x = letra;
        
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
            for(int i = 0; i < aux.getIndex(); i++){
                x++;
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
            for(int i = 0; i < aux.getIndex(); i++){
                x--;
            }

            if(upperCase){
                return x;
            }else{
                return Character.toLowerCase(x);
            }
        }
    }
}
