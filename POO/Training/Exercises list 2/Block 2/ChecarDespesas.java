
package bloco2;

public class ChecarDespesas {
    public CorrentistaDespesa[] check(CorrentistaDespesa despesas[]){
        CorrentistaDespesa aux[] = new CorrentistaDespesa[despesas.length];
        int cont = 0;
        
        for(int i = 0; i < despesas.length; i++){
            if(despesas[i].getDespesasPrevistas().totalizaMes(3).getValor() <= despesas[i].getSaldo()){
                aux[cont] = despesas[i];
            }
        }

        return aux;
    }
}
