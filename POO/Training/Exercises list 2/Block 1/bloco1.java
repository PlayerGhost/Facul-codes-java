
package bloco1;

public class bloco1 {

    public static void main(String[] args) {
        PrevisoesOrcamento previsoesOrcamento = new PrevisoesOrcamento();
        AnimalOrcamentoObj animais[] = new AnimalOrcamentoObj[4];
        
        //
        
        AnimalObj animal1 = new AnimalObj("a","a");
        ItemOrcamento item1 = new ItemOrcamento("a", 1);
        ItemOrcamento item2 = new ItemOrcamento("vacina W", 1);
        ItemOrcamento subItens1[] = new ItemOrcamento[2];
        subItens1[0] = item1;
        subItens1[1] = item2;
            
        ItemOrcamentoComplexo orcamento1 = new ItemOrcamentoComplexo(subItens1, "a", 1);
        AnimalOrcamentoObj animalOrcamento1 = new AnimalOrcamentoObj(animal1, orcamento1);
        
        //
                
        AnimalObj animal2 = new AnimalObj("b","b");
        ItemOrcamento item3 = new ItemOrcamento("b", 1);
        ItemOrcamento item4 = new ItemOrcamento("vacina W", 1);
        ItemOrcamento subItens2[] = new ItemOrcamento[2];
        subItens2[0] = item3;
        subItens2[1] = item4;
            
        ItemOrcamentoComplexo orcamento2 = new ItemOrcamentoComplexo(subItens2, "a", 1);
        AnimalOrcamentoObj animalOrcamento2 = new AnimalOrcamentoObj(animal2, orcamento2);
        
        //
                
        AnimalObj animal3 = new AnimalObj("c","c");
        ItemOrcamento item5 = new ItemOrcamento("c", 1);
        ItemOrcamento item6 = new ItemOrcamento("x", 1);
        ItemOrcamento subItens3[] = new ItemOrcamento[2];
        subItens3[0] = item5;
        subItens3[1] = item6;
            
        ItemOrcamentoComplexo orcamento3 = new ItemOrcamentoComplexo(subItens3, "a", 1);
        AnimalOrcamentoObj animalOrcamento3 = new AnimalOrcamentoObj(animal3, orcamento3);
        
        //
                
        AnimalObj animal4 = new AnimalObj("d","d");
        ItemOrcamento item7 = new ItemOrcamento("d", 1);
        ItemOrcamento item8 = new ItemOrcamento("vacina W", 1);
        ItemOrcamento subItens4[] = new ItemOrcamento[2];
        subItens4[0] = item7;
        subItens4[1] = item8;
            
        ItemOrcamentoComplexo orcamento4 = new ItemOrcamentoComplexo(subItens4, "a", 1);
        AnimalOrcamentoObj animalOrcamento4 = new AnimalOrcamentoObj(animal4, orcamento4);
        
        //
                      
        animais[0] = animalOrcamento1;
        animais[1] = animalOrcamento2;
        animais[2] = animalOrcamento3;
        animais[3] = animalOrcamento4;
        
        AnimalOrcamentoObj animaisFiltrados[] = previsoesOrcamento.filtrarAnimais(animais);
    }
}
