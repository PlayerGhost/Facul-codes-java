
package empresa;

public class Funcionarios {
    
    private int[]codigo = new int[5];
    char[] myArray = new char[1];
    private String[] nome = {"João da Silva", "Pedro Santos", "Maria Oliveira", "Rita Alcântara", "Lígia Matos"};
    private int[] tipoCargo = {1, 2, 3, 5, 2};

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    public String[] getNome() {
        return nome;
    }

    public void setNome(String[] nome) {
        this.nome = nome;
    }

    public int[] getTipoCargo() {
        return tipoCargo;
    }

    public void setTipoCargo(int[] tipoCargo) {
        this.tipoCargo = tipoCargo;
    }
    
    
    
}
