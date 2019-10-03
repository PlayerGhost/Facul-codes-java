
package polinomios;

public class Lista {
    private Polinomio primeiro;
    private Polinomio ultimo;
    private Polinomio anterior;
    private Polinomio aux;
    private Polinomio aux1;

    public Lista() {
        primeiro = null;
        ultimo = null;
    }
    
    public void adicionar(int coeficiente, int expoente){
       Polinomio novo = new Polinomio(coeficiente, expoente);
       
       if (primeiro == null){
            primeiro = novo;
            ultimo = novo;
        } else{
            aux = primeiro;
            
            while (aux != null && novo.getExpoente() < aux.getExpoente()){
                anterior = aux;
                aux = aux.getProximo();
            }
            
            if (anterior == null){
                novo.setProximo(primeiro);
                primeiro = novo; 
            } else if(aux == null){
                ultimo.setProximo(novo);
                ultimo = novo;
                ultimo.setProximo(null);
            }else{
                anterior.setProximo(novo);
                novo.setProximo(aux);
            }
       }  
    }
    
    	public void print(int x) {
            aux = primeiro;
            System.out.println(" ");
		
            for (int i = 0; i <= x; i++) {
                if(i <= (x-1)){
                    System.out.print(aux.getCoeficiente() + "x" + aux.getExpoente() + " + "); 
                }else{
                    System.out.println(aux.getCoeficiente() + "x" + aux.getExpoente());
                }
                
                aux = aux.getProximo();
            }
	}
        
        public Polinomio get(int x) {
            aux = primeiro;
		
            for (int i = 0; i <= x; i++) {
                aux1 = aux;              
                aux = aux.getProximo();
            }
            return aux1;
	}
        
        /*public int check(int x, int cont) {
            aux = primeiro;
            int y = 0;
		
            for (int i = 0; i <= cont; i++){
                if(aux.getExpoente() == x){
                    y++;
                }
                
                aux = aux.getProximo();
            }
            
            return y;
        }*/
        
        public int size() {
            aux = primeiro;
            int y = 0;
		
            while(aux.getProximo() != null){
                y++;
                aux = aux.getProximo();
            }
            
            return y;
        }
}
