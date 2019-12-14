
package av3;

public class Pessoa {
    private String nome;
    private String dia;
    private String mes;

    public Pessoa(String nome, String dia, String mes) {
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
}
