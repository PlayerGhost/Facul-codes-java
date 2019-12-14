
import java.util.Scanner;


public class ListaDinamica {
	private Produto primeiro;
	private Produto ultimo;
	private Produto aux;
        private float desconto;
        private int cont;
        private Scanner input = new Scanner(System.in); 
	
	public ListaDinamica() {
		primeiro = null;
		ultimo = null;
		aux = null;
                desconto = 0;
                cont = 0;
	}
	
	public void adicionar (String codigo, double preco, int quantidade) {
		Produto novo = new Produto(codigo, preco, quantidade);
		
		if (primeiro == null) {
			primeiro = novo;
			ultimo = novo;
		} else{
			ultimo.setProximo(novo);
			ultimo = novo;
		}
	}
        
        public void desconto(){
            aux = primeiro;
            
            System.out.println("Informe a taxa de desconto (Ex: 10 para desconto de 10%)");
            desconto = input.nextInt();
            desconto /= 100;          
            
            for (int i = 0; i < 5; i++){
                aux.setPreco(aux.getPreco()-(aux.getPreco()*desconto));
                aux = aux.getProximo();               
            }
                                   
        }
	
	public void print () {
		aux = primeiro;
		
		for (int i = 0; i < 5; i++) {
			System.out.println(aux.getCodigo());
			System.out.println(aux.getPreco());
			System.out.println(aux.getQuantidade());
                        System.out.println(" ");
			aux = aux.getProximo();
		}
	}
        
        public void checkQuantidade(){
            aux = primeiro;
            
            for (int i = 0; i < 5; i++){
                if(aux.getQuantidade() > 500){
                    cont++;
                }                       
                aux = aux.getProximo();         
            }
            
            System.out.println(cont + " Produto(s) tem quantidade estocada superior a 500");
        }
	
}
