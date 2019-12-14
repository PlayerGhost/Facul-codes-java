
package herançaabstrata;

import java.util.Scanner;

public class HerançaAbstrata {

    public static void main(String[] args) {
        Administrativo administrativo = new Administrativo("noturno", 200, "813182", "Mad Max", 1000);
        administrativo.exibeDados();
        
        Tecnico tecnico = new Tecnico(300, "890327", "Paula W", 1100);
        tecnico.exibeDados();
    }
    
}
