
package bloco2;

public class DespesasIndividuo {
    String CPF;
    DespesaDia despesas[];

    public DespesasIndividuo(String CPF, DespesaDia despesas[]) {
        this.CPF = CPF;
        this.despesas = despesas;
    }
    
    public String getCPF(){
        return CPF;
    }
    
    public DespesaMes totalizaMes(int mes){
        DespesaMes aux = null;
        float valor = 0;
        
        for(int i = 0; i < despesas.length; i++){
            if(despesas[i].getMes() == mes){
                valor += despesas[i].getValor();
            }
        }
        
        aux = new DespesaMes(mes, valor);
        
        return aux;
    }
}
