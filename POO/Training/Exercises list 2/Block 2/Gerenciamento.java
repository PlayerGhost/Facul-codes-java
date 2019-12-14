
package bloco2;

public class Gerenciamento {
   public void atualizarSaldo(Correntista[] C, MovimentoContaObj[] M, OperacoesBanco operação){
       //Sem usar a interface OperacoesBanco
       /*for(int i = 0; i < C.length; i++){
       C[i].setSaldo(C[i].getSaldo() + M[i].getValorMovimento());
       }*/
       
       //usando a interface OperacoesBanco
        for(int i = 0; i < C.length; i++){
            Correntista aux = operação.encontraCorrentista(C, C[i].getCPFCliente());
            C[i].setSaldo(aux.getSaldo() + M[i].getValorMovimento());
        }
   } 
}
