package bancosantander;

public class BancoSantander {

    public static void main(String[] args) {
        
        Clientes p1 = new Clientes();
        p1.setNumeroCliente(1);
        p1.setSobreNome("o cara");
        p1.setTipoConta("Poupança");
        p1.depositar(100);
        p1.status();
    }
    
}
