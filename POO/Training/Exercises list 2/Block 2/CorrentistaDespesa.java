
package bloco2;

public class CorrentistaDespesa extends Correntista {
    private DespesasIndividuo despesasPrevistas;
    
    public CorrentistaDespesa(String cpfCliente, float saldo, DespesasIndividuo despesas) {
        super(cpfCliente, saldo);
        this.despesasPrevistas = despesas;
    }
    
    public DespesasIndividuo getDespesasPrevistas() {
        return despesasPrevistas;
    }
}
