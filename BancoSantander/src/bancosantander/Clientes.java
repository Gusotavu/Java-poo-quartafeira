package bancosantander;

public class Clientes {
    //Atributos
    private int numeroCliente;
    private String sobreNome;
    private int RG;
    private int CPF;
    private float saldo;
    private float CS;
    private String tipoConta;
    private float juros;
    
    public void status() {
        System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
        System.out.println("Número da conta " + this.numeroCliente);
        System.out.println("SObrenome " + this.sobreNome);
        System.out.println("RG: " + this.RG);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Saldo: " + this.saldo + "R$");
        System.out.println("Conta: " + this.tipoConta);
        
        
    }
    
    //Metodos
    public void depositar(float d) {
        this.setSaldo(this.getSaldo() + d);
        System.out.println("Você depositou " + d + "R$. Seu saldo atual é: " + saldo);
    }
    
    public void dCheque(float v,  String data) {
        if(tipoConta == "Poupança") {
            System.out.println("Sua conta não pode receber cheque!");
        } else {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Em " + data + "você depositou " + v + "R$ na sua conta.");
        }
    }
    
    public void sacar(float s) {
        
        if(tipoConta == "Poupança") {
            if(s <= saldo) {
                this.setSaldo(this.getSaldo() - s);
                System.out.println("Você sacou " + s + "R$. Seu saldo atual é: " + saldo);
                } else {
                    System.out.println("Você não possui saldo suficiente para sacar " + s + "R$");
                }
        } else {
            if(s <= saldo) {
                this.setSaldo(this.getSaldo() - s);
                System.out.println("Você sacou " + s + "R$. Seu saldo atual é: " + saldo);
            } else if(s <= (saldo + CS)) {
                this.setSaldo(this.getSaldo() + CS);
                this.setSaldo(this.getSaldo() - s);
                System.out.println("Você sacou " + s + "R$. Uilizando parte de seu Cheque especial. Seu saldo atual é: " + saldo);
            }
        }
        
    }
    
    public void recolherJuros(float j) {
        if(tipoConta == "Poupança") {
            this.setJuros(this.getSaldo()*juros);
            System.out.println("Sua conta rendeu: " + juros + "R$");
        } else {
            System.out.println("Sua conta não rende!");
        }
    }
    
    public void Clientes() {
        
    }
    
    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
    
    public int getNumeroCliente() {
        return this.numeroCliente;
    }
    
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
    
    public String getSobreNome() {
        return this.sobreNome;
    }
    
    public void setRG(int RG) {
        this.RG = RG;
    }
    
    public int getRG() {
        return this.RG;
    }
    
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
    
    public int getCPF() {
        return this.CPF;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public float getSaldo() {
        return this.saldo;
    }
    
    public void setCS(float CS) {
        this.CS = CS;
    }
    
    public float getCS() {
        return this.CS;
    }
    
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    
    public String getTipoConta() {
        return this.tipoConta;
    }
    
    public void setJuros(float juros) {
        this.juros = juros;
    }
    
    public float getJuros() {
        return this.juros;
    }
}
