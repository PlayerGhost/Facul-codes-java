
package bloco2;

public class OperacoesBancoObj implements OperacoesBanco{

    @Override
    public Correntista encontraCorrentista(Correntista[] todosCorrentistas, String cpfProcurado) {
        Correntista aux = null;
                
        for(int i = 0; i < todosCorrentistas.length; i++){
            if(todosCorrentistas[i].getCPFCliente().equals(cpfProcurado)){
                aux = todosCorrentistas[i];
            }
        }
        
        return aux;
    }
}
