
package bloco1;

public class ItemOrcamentoComplexo extends ItemOrcamento{
    protected ItemOrcamento subItens[];

    public ItemOrcamentoComplexo(ItemOrcamento[] subItens, String historico, float valor) {
        super(historico, valor);
        this.subItens = subItens;
    }
    
    @Override
    public float getValor() {
        float somaValor = 0; 
        
        for(int i = 0; i < subItens.length; i++){
            somaValor += subItens[i].getValor();
        }
        
        return somaValor;
    }
    
    public ItemOrcamento encontraItem(String historico) {
        ItemOrcamento aux = null;
        
        for(int i = 0; i < subItens.length; i++){
            if(subItens[i].getHistorico().equals(historico)){
                aux = subItens[i];
            }
        }
        
        return aux;
    }
}
