
package poos;

import java.util.ArrayList;

public class OpenBar extends Evento{
    private ArrayList <Bebida> bebidas;

    public OpenBar(ArrayList<Bebida> bebidas, String codigo, String descricao, String local, String data, int quantdConvites, double custoOrganizacao, ArrayList<Double> valorEntrada) {
        super(codigo, descricao, local, data, quantdConvites, custoOrganizacao, valorEntrada);
        this.bebidas = bebidas;
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }
}
