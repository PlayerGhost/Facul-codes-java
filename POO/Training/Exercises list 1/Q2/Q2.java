
package q2;

public class Q2 {

    public static void main(String[] args) {
        System.out.println("Cachorro: ");
        Cachorro cachorro = new Cachorro("Max", "PitBull");
        cachorro.Animal();
        System.out.println(cachorro.late());
        System.out.println(cachorro.caminha());
        System.out.println(" ");
        
        System.out.println("Gato: ");
        Gato gato = new Gato("Logan", "Persa");
        gato.Animal();
        System.out.println(gato.mia());
        System.out.println(gato.caminha());
        System.out.println(" ");
        
        System.out.println("Rica: ");
        Rica rica = new Rica(99999999, "Elon Musk", 48);
        rica.Pessoa();
        rica.fazCompras();
        System.out.println(" ");
        
        System.out.println("Pobre: ");
        Pobre pobre = new Pobre("Sei la", 30);
        pobre.Pessoa();
        pobre.trabala();
        System.out.println(" ");
        
        System.out.println("Miseravel: ");
        Miseravel miseravel = new Miseravel("La sei", 40);
        miseravel.Pessoa();
        miseravel.mendiga();
    }   
}
