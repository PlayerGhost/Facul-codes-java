package hallofmurders;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        Arvore arvore = new Arvore();
        
        String nomes[];
        LinkedList <String> morreram = new LinkedList <String>();

        String str = null;
        
        int cont = 0;

        while(in.ready()){
            str = in.readLine();
            
            nomes = str.split(" ");
            
            if(!arvore.search(nomes[0])){
               arvore.add(nomes[0]);
            }
            
            morreram.add(nomes[1]);
        } 

        for (String i : morreram) {
            arvore.remove(i);
        }
        
        System.out.println("HALL OF MURDERERS");
        arvore.emOrdem();
    }
    
    public static class No {
        private Pessoa pessoa;
        private No esquerdo;
        private No direito;

        public No() {
            this.pessoa = pessoa;
            this.esquerdo = null;
            this.direito = null;
        }
        
        public No(Pessoa pessoa) {
            this.pessoa = pessoa;
            this.esquerdo = null;
            this.direito = null;
        }

        public Pessoa getPessoa() {
            return pessoa;
        }

        public void setPessoa(Pessoa pessoa) {
            this.pessoa = pessoa;
        }

        public No getEsquerdo() {
            return esquerdo;
        }

        public void setEsquerdo(No esquerdo) {
            this.esquerdo = esquerdo;
        }

        public No getDireito() {
            return direito;
        }

        public void setDireito(No direito) {
            this.direito = direito;
        }
        
        public boolean add(String nome){
            if(nome.equals(this.pessoa.getNome())){
                this.pessoa.setKills(this.pessoa.getKills()+1);
                return false;
            }else if(nome.compareTo(this.pessoa.getNome()) < 0){
                if(esquerdo == null){
                    Pessoa pessoa = new Pessoa(nome);
                    pessoa.setKills(1);
                    
                    esquerdo = new No(pessoa);
                    
                    return true;
                }else
                    return esquerdo.add(nome);
            }else if(nome.compareTo(this.pessoa.getNome()) > 0){
                if(direito == null){
                    Pessoa pessoa = new Pessoa(nome);
                    pessoa.setKills(1);
                    
                    direito = new No(pessoa);
                    
                    return true;
                }else
                    return direito.add(nome);
            }
            
            return false;
        }
        
        public boolean search(String nome){
            if(nome.equals(this.pessoa.getNome())){
                this.pessoa.setKills(this.pessoa.getKills()+1);
                return true;
            }else if(nome.compareTo(this.pessoa.getNome()) < 0){
                if(esquerdo == null){
                    return false;
                }else{
                    return esquerdo.search(nome);
                }
            }else if(nome.compareTo(this.pessoa.getNome()) > 0){
                if(direito == null){
                    return false;
                }else{
                    return direito.search(nome);
                }
            }
            
            return false;
        }

        public boolean remove(String nome, No parente){
            if(nome.compareTo(this.pessoa.getNome()) < 0){
                if(esquerdo != null){
                    return esquerdo.remove(nome, this);
                }else{
                    return false;
                }    
            }else if(nome.compareTo(this.pessoa.getNome()) > 0){
                if(direito != null){
                    return direito.remove(nome, this);
                }else{
                    return false;
                }  
            }else{
                if(esquerdo != null && direito != null){
                    this.pessoa = direito.minElemento();
                    direito.remove(this.pessoa.getNome(), this);
                }else if(parente.esquerdo == this){
                    parente.esquerdo = (esquerdo != null) ? esquerdo : direito;
                }else if(parente.direito == this){
                    parente.direito = (esquerdo != null) ? esquerdo : direito;
                }
                
                return true;
            }
        }

        public Pessoa minElemento(){
            if(esquerdo == null){
                return pessoa;
            }else{
                return esquerdo.minElemento();
            }
        }

        public void emOrdem(){
            if(esquerdo != null){
                esquerdo.emOrdem();
            }
            
            System.out.println(pessoa.getNome() + " " + pessoa.getKills());
            
            if(direito != null){
                direito.emOrdem();
            }
        }
    }
    
    public static class Pessoa{
        private String nome;
        private int kills;

        public Pessoa(String nome) {
            this.nome = nome;
            this.kills = 0;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getKills() {
            return kills;
        }

        public void setKills(int kills) {
            this.kills = kills;
        }
        
    }
    
    public static class Arvore {
        private No root;

        public Arvore() {
            root = null;
        }

        public void add(String nome){
            if(root == null){
                Pessoa pessoa = new Pessoa(nome);
                pessoa.setKills(1);
                
                root = new No(pessoa);
            }else{
                root.add(nome);
            }
        }
        
        public boolean search(String nome){
            if (root == null){
                return false;
            }else{
                return root.search(nome);
            }
        }

        public boolean remove(String nome){ 
            if(root == null){
                return false;
            }else{
                if(root.getPessoa().getNome().equals(nome)){
                    No aux = new No();

                    aux.setEsquerdo(root);
                    boolean result = root.remove(nome, aux);
                    root = aux.getEsquerdo();
                    
                    return result;
                }else{
                    return root.remove(nome, null);
                }
            }
        }

        public void emOrdem(){
            if(root != null){
                root.emOrdem();
            }
        }
    }
}
