
    public class ListaDinamica {
	private Produto primeiro;
        private Produto ultimo;
	private Produto anterior;
	private Produto aux;

	
	public ListaDinamica() {
            primeiro = null;
            anterior = null;
            ultimo = null;
	}
	
	public void adicionar (String nome, double salario) {
            Produto novo = new Produto(nome, salario);
		
            if (primeiro == null) {
                primeiro = novo;
                ultimo = novo;
            } else{
                aux = primeiro;
                
                while (aux != null && novo.getSalario() > aux.getSalario()){
                    anterior = aux;
                    aux = aux.getProximo();
                }
                
                if (anterior == null){
                    novo.setProximo(primeiro);
                    primeiro = novo;                   
                } else if (aux == null){
                    ultimo.setProximo(novo);
                    ultimo = novo;
                    ultimo.setProximo(null);                 
                } else {
                    anterior.setProximo(novo);
                    novo.setProximo(aux);       
                }         
            }
	}   
	
	public void print () {
            aux = primeiro;
		
            for (int i = 0; i < 8; i++) {
                System.out.println("Produto " + (i+1));
                System.out.println(aux.getNome());
                System.out.println(aux.getSalario());
                System.out.println(" ");
                aux = aux.getProximo();
            }
	}	
    }
