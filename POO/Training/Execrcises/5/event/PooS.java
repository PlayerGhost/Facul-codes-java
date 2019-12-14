
package poos;

import java.util.ArrayList;
import java.util.Scanner;

public class PooS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Evento> eventos = new ArrayList <Evento>(); 
        ArrayList <Bebida> bebidas = new ArrayList<Bebida>();
        
        int choice = 0;
        
        while(choice != 2){
            System.out.println("1 - Cadastrar evento, 2 - Sair");
            
            choice = input.nextInt();
            
            if(choice == 1){
                System.out.println("Informe o indetificador único do evento(código).");
                String codigo = input.next();
                
                System.out.println("Informe a descrição do evento.");
                input.nextLine();
                String descricao = input.nextLine();
                
                System.out.println("Informe o local do evento.");
                String local = input.nextLine();
                
                System.out.println("Informe a data de realização do evento.");
                String data = input.next();
                
                System.out.println("Informe a quantidade de convites do evento."); 
                int quantdConvites;
                        
                try {
                    quantdConvites = input.nextInt();
                }
                catch(Exception e) {
                    System.out.println("Digite somente números inteiros");
                    input.nextLine();
                    quantdConvites = input.nextInt();
                }
                
                System.out.println("Informe o custo da organização do evento.");
                double custoOrganizacao;
                
                try {
                    custoOrganizacao = input.nextDouble();
                }
                catch(Exception e) {
                    System.out.println("Digite somente números");
                    input.nextLine();
                    custoOrganizacao = input.nextDouble();
                }
                
                System.out.println("O evento é open bar? (1 - Sim, 2 - Não)");
                
                if(input.nextInt() == 1){                  
                    for(int i = 0; i < 4; i++){
                        System.out.println("Preencha as informações da bebida " + (i+1));
                        System.out.println(" ");
                        System.out.println("Informe o nome da bebida.");
                        input.nextLine();
                        String nome = input.nextLine();

                        System.out.println("Informe o teor alcoolico da bebida.");
                        double teorAlcoolico;
                        
                        try {
                            teorAlcoolico = input.nextDouble();
                        }
                        catch(Exception e) {
                            System.out.println("Digite somente números");
                            input.nextLine();
                            teorAlcoolico = input.nextDouble();
                        }
                        
                        System.out.println("Informe o valor unitario da bebida.");
                        double valorUnitario;
                        
                        try {
                            valorUnitario = input.nextDouble();
                        }
                        catch(Exception e) {
                            System.out.println("Digite somente números");
                            input.nextLine();
                            valorUnitario = input.nextDouble();
                        }

                        Bebida novo = new Bebida(nome, teorAlcoolico, valorUnitario);

                        bebidas.add(novo);
                    }
                    
                    System.out.println("1 - Informar o valor da entrada, 2 - Calcular automaticamnete.");
                    int choice1;
                        
                    try {
                        choice1 = input.nextInt();
                    }
                    catch(Exception e) {
                        System.out.println("Digite somente 1 ou 2");
                        input.nextLine();
                        choice1 = input.nextInt();
                    }
                    
                    ArrayList <Double> valorEntrada = new ArrayList <Double>();
                    
                    if(choice1 == 1){
                        System.out.println("Informe o valor de entrada.");
                        double valor;
                        
                        try {
                            valor = input.nextDouble();
                        }
                        catch(Exception e) {
                            System.out.println("Digite somente números");
                            input.nextLine();
                            valor = input.nextDouble();
                        }
                        
                        valorEntrada.add(valor);
                    }else{
                        double valorUnitarioTotal  = 0;
                    
                        for (int i = 0; i < bebidas.size(); i++) {
                            valorUnitarioTotal += (bebidas.get(i).getValorUnitario() * 0.5);
                        }

                        valorEntrada.add(30 + valorUnitarioTotal);
                    }
       
                    OpenBar evento = new OpenBar(bebidas, codigo, descricao, local, data, quantdConvites, custoOrganizacao, valorEntrada);
                    eventos.add(evento);
                }else{
                    System.out.println("1 - Informar o valor da entrada, 2 - Calcular automaticamnete.");
                    int choice1;
                        
                    try {
                        choice1 = input.nextInt();
                    }
                    catch(Exception e) {
                        System.out.println("Digite somente 1 ou 2");
                        input.nextLine();
                        choice1 = input.nextInt();
                    }
                    
                    ArrayList <Double> valorEntrada = new ArrayList <Double>();
                    
                    if(choice1 == 1){
                        System.out.println("Informe o valor de entrada.");
                        double valor;
                        
                        try {
                            valor = input.nextDouble();
                        }
                        catch(Exception e) {
                            System.out.println("Digite somente números");
                            input.nextLine();
                            valor = input.nextDouble();
                        }
                        
                        valorEntrada.add(valor);
                    }else{
                        valorEntrada.add(custoOrganizacao / quantdConvites);
                    }                 
                    
                    valorEntrada.add(valorEntrada.get(0) + (valorEntrada.get(0) * 0.1));
                    valorEntrada.add(valorEntrada.get(0) + (valorEntrada.get(0) * 0.15));
                    
                    Evento evento = new Evento(codigo, descricao, local, data, quantdConvites, custoOrganizacao, valorEntrada);
                    eventos.add(evento);
                }         
            }
        }
        
        System.out.println("LISTA DE EVENTOS");
        
        for(int i = 0; i < eventos.size(); i++){
            if(eventos.get(i) instanceof OpenBar){
                OpenBar temp = (OpenBar) eventos.get(i);
                bebidas = temp.getBebidas();
                
                System.out.println("Evento " + (i+1) + ":");
                System.out.println("Código: " + temp.getCodigo());
                System.out.println("Descrição: " + temp.getDescricao());
                System.out.println("Local: " + temp.getLocal());
                System.out.println("Data: " + temp.getData());
                System.out.println("Quantidade de convites: " + temp.getQuantdConvites());
                System.out.println("Custo de organizacao: R$ " + temp.getCustoOrganizacao());
                System.out.println("Valor de entrada: R$ " + temp.getValorEntrada().get(0));
                System.out.println(" ");
                System.out.println("Bebidas do evento " + (i+1) + ":");
                for(int x = 0; x < bebidas.size(); x++){
                    System.out.print("Nome: " + bebidas.get(x).getNome() + " / ");
                    System.out.print("Teor Alcoólico: " + bebidas.get(x).getTeorAlcoolico() + " / ");
                    System.out.println("Valor unitário: R$ " + bebidas.get(x).getValorUnitario());
                    System.out.println(" ");
                }
            }else{
                Evento temp = eventos.get(i);
                
                System.out.println("Evento " + (i+1) + ":");
                System.out.println("Código: " + temp.getCodigo());
                System.out.println("Descrição: " + temp.getDescricao());
                System.out.println("Local: " + temp.getLocal());
                System.out.println("Data: " + temp.getData());
                System.out.println("Quantidade de convites: " + temp.getQuantdConvites());
                System.out.println("Custo de organizacao: R$ " + temp.getCustoOrganizacao());
                System.out.println("Valor da entrada popular: R$ " + temp.getValorEntrada().get(0));
                System.out.println("Valor da entrada normal: R$ " + temp.getValorEntrada().get(1));
                System.out.println("Valor da entrada VIP: R$ " + temp.getValorEntrada().get(2));
                System.out.println(" ");
            }
        }
    }  
}
