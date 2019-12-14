
public class Estoque {

	public static void main(String[] args) {
		ListaDinamica estoque = new ListaDinamica();
		
		estoque.adicionar("CKP1010", 100.8);
		estoque.adicionar("CKP2020", 197.85);
                estoque.adicionar("CKP3030", 960.06);
                estoque.adicionar("CKP4040", 542.22);
                estoque.adicionar("CKP5050", 771.36);
                estoque.adicionar("CKP4060", 397.76);
                estoque.adicionar("CKP5070", 958.05);
                estoque.adicionar("CKP5080", 479.74);
   		
		estoque.print();  
	}

}
