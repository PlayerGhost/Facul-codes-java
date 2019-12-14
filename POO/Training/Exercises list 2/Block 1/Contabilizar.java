
package bloco1;

public class Contabilizar{
    
    public Resultado[] contabiliazar(AnimalObj[] A, FerramentaObj F){
        String especies[] = F.classificaEspecies(A);
        Resultado resultado[] = new Resultado[A.length];
        Animal aux[] = null;
        int cont = 0;
        
        for(int i = 0; i < especies.length; i++){
            aux = F.filtraEspecie(A, especies[i]);
            int cont1 = 0;
            
            for(int x = 0; x < aux.length; x++){           
                if(aux[x] != null){
                    cont1++;
                }
            }
            
            Resultado novo = new Resultado(especies[i], cont1);
            
            resultado[cont] = novo;
            cont++;
        }
        
        return resultado;
    }
}
