
package bloco1;

public class FerramentaObj implements Ferramentas{
  
    @Override
    public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar){
        Animal aux[] = new Animal[completo.length];
        Animal none[] = new Animal[0];
        int cont = 0;
        
        for(int i = 0; i < completo.length; i++){
            if(completo[i].getNomeEspecie().equals(especieFiltrar)){
                aux[cont] = completo[i];
                cont++;
            }
        }
        
        if(aux[0] != null){
            return aux;
        }else{
            return none;
        }
    }

    @Override
    public String[] classificaEspecies(Animal[] completo) {
        String especies[] = new String[completo.length];
        int cont = 0;
        
        for(int i = 0; i < completo.length; i++){
            boolean aux = false;
            
            for(int x = 0; x < especies.length; x++){
                if(especies[x].equals(completo[i].getNomeEspecie())){
                    aux = true;
                }
            }
            
            if(aux == false){
                especies[cont] = completo[i].getNomeEspecie();
                cont++;
            }
        }
        
        return especies;
    }    
}
