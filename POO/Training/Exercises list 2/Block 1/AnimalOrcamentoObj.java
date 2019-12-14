
package bloco1;

public class AnimalOrcamentoObj implements AnimalOrcamento{
    AnimalObj animal;
    ItemOrcamentoComplexo orcamento;

    public AnimalOrcamentoObj(AnimalObj animal, ItemOrcamentoComplexo orcamento) {
        this.animal = animal;
        this.orcamento = orcamento;
    }

    public AnimalObj getAnimal() {
        return animal;
    }

    public void setAnimal(AnimalObj animal) {
        this.animal = animal;
    }

    public ItemOrcamentoComplexo getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(ItemOrcamentoComplexo orcamento) {
        this.orcamento = orcamento;
    }
    
    @Override
    public ItemOrcamentoComplexo orcamentoGastosAnimal(){
        return orcamento;
    }

    @Override
    public String getNomeEspecie() {
        return animal.getNomeEspecie();
    }

    @Override
    public String getNomeAnimal() {
        return animal.getNomeAnimal();
    }
}
