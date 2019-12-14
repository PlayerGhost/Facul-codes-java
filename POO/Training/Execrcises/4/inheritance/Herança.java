
package herança;

public class Herança {

    public static void main(String[] args) {
        System.out.println("Humano: ");
        Humano humano = new Humano(2, 30, 40, "branco", 1.82);
        humano.print();
        humano.comer();
        humano.mamar();
        humano.falar();
        System.out.println(" ");
        
        System.out.println("Labrador: ");
        Labrador labrador = new Labrador("Max", 4, 15, 13, "cinza", 0.60);  
        labrador.print();
        labrador.comer();
        labrador.mamar();
        labrador.latir();
        System.out.println(" ");
        
        System.out.println("Gato");
        Gato gato = new Gato(4, 16, 10, "branco", 0.30);
        gato.print();
        gato.comer();
        gato.mamar();
        gato.miar();
        System.out.println(" ");
    } 
}
