
package q3;

public class CamaroteInferior extends VIP{
    protected String local;

    public CamaroteInferior(String local, double adicional, double valor) {
        super(adicional, valor);
        this.local = local;
    }
    
    public void local(){
        System.out.println("Local: " + local);
    }
}
