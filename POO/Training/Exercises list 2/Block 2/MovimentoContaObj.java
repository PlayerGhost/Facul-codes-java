
package bloco2;

public class MovimentoContaObj implements MovimentoConta{
    private String cpfCorrentista;
    private float valorMovimento;
    private String movimento;

    public MovimentoContaObj(String cpfCorrentista, float valorMovimento, String movimento) {
        this.cpfCorrentista = cpfCorrentista;
        this.valorMovimento = valorMovimento;
        this.movimento = movimento;
    }
    
    @Override
    public String getCPFCorrentista(){
        
        return cpfCorrentista;
    }

    @Override
    public float getValorMovimento(){
        if(movimento.equals("crédito")){
            return valorMovimento;
        }else{
            return -valorMovimento;
        }
    }
}
