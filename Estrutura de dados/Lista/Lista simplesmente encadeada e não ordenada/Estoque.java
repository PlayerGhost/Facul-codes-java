
public class Estoque {

	public static void main(String[] args) {
		ListaDinamica estoque = new ListaDinamica();
		
		estoque.adicionar("CKP1010", 100, 10);
		estoque.adicionar("CKP2020", 174.95, 20);
                estoque.adicionar("CKP3030", 219.95, 30);
                estoque.adicionar("CKP4040", 249.95, 40);
                estoque.adicionar("CKP5050", 399.95, 600);
                
                estoque.desconto();		
		estoque.print();
                estoque.checkQuantidade();
	}

}
