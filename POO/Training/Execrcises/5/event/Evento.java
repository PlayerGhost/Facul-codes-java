
package poos;

import java.util.ArrayList;

public class Evento {
    private String codigo;
    private String descricao;
    private String local;
    private String data;
    private int quantdConvites;
    private double custoOrganizacao;
    private ArrayList <Double> valorEntrada;

    public Evento(String codigo, String descricao, String local, String data, int quantdConvites, double custoOrganizacao, ArrayList<Double> valorEntrada) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.local = local;
        this.data = data;
        this.quantdConvites = quantdConvites;
        this.custoOrganizacao = custoOrganizacao;
        this.valorEntrada = valorEntrada;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getQuantdConvites() {
        return quantdConvites;
    }

    public void setQuantdConvites(int quantdConvites) {
        this.quantdConvites = quantdConvites;
    }

    public double getCustoOrganizacao() {
        return custoOrganizacao;
    }

    public void setCustoOrganizacao(double custoOrganizacao) {
        this.custoOrganizacao = custoOrganizacao;
    }

    public ArrayList<Double> getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(ArrayList<Double> valorEntrada) {
        this.valorEntrada = valorEntrada;
    }
}
