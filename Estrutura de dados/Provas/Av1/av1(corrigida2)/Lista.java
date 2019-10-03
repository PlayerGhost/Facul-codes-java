
package av1;

public class Lista {
    private Eletro primeiro;
    private Eletro ultimo;
    private Eletro aux;

    public Lista() {
        primeiro = null;
        ultimo = null;
        aux = null;
    }
    
    public void adicionar(String tipo, int potencia, int quantidade, float tempo){
        Eletro novo = new Eletro(tipo, potencia, quantidade, tempo);
        
        if (primeiro == null){
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.setProximo(novo);
            ultimo = novo;
        }
    }
    
    public void sizeLista(){
        aux = primeiro;
        int cont = 1;
        
        
       
    }
    
    public void print(){
        aux = primeiro;
        int aux1 = 0;
        float aux2 = 0;
        
        while(aux != null){
            aux.setConsumo((aux.getPotencia() * aux.getQuantidade()) / 1000);
            
            System.out.println("Tipo: " + aux.getTipo());
            System.out.println("Consumo mensal: " + aux.getConsumo() + " kWh");  
            
            aux.setCustoMensal((aux.getConsumo() * 0.77259));
            System.out.println("Custo mensal: R$ " + aux.getCustoMensal());
            
            aux1 += aux.getConsumo();
            aux2 += aux.getConsumo() * 0.77259;
            
            aux = aux.getProximo();
        }
        System.out.println("Consumo total mensal: " + aux1 + " kWh");
        System.out.println("Custo total mensa: R$ " + aux2);
    }
}
