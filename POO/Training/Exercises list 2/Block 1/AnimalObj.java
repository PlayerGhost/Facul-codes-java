
package bloco1;

public class AnimalObj implements Animal{
    private String nomeEspecie;
    private String nomeAnimal;

    public AnimalObj(String nomeEspecie, String nomeAnimal) {
        this.nomeEspecie = nomeEspecie;
        this.nomeAnimal = nomeAnimal;
    }

    @Override
    public String getNomeEspecie() {
        return nomeEspecie;
    }

    public void setNomeEspecie(String nomeEspecie) {
        this.nomeEspecie = nomeEspecie;
    }

    @Override
    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }
}
