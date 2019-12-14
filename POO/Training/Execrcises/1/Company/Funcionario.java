
package empresa;

public class Funcionario {
    private int codigo;
    private String nome;  
    private int tipoCargo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipoCargo() {
        return tipoCargo;
    }

    public void setTipoCargo(int tipoCargo) {
        this.tipoCargo = tipoCargo;
    }
}
