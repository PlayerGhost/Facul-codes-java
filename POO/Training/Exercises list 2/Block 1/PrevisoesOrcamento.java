
package bloco1;

public class PrevisoesOrcamento {
    
    public AnimalOrcamentoObj[] filtrarAnimais(AnimalOrcamentoObj[] animais){
        AnimalOrcamentoObj animaisFiltrados[] = new AnimalOrcamentoObj[animais.length];
        int cont = 0;
        
        for(int i = 0; i < animais.length; i++){
            ItemOrcamento aux = animais[i].getOrcamento().encontraItem("vacina W");
            
            if(aux != null){
                animaisFiltrados[cont] = animais[i];
                cont++;
            }
        }
        
        return animaisFiltrados;
    }
}
