package voador;

public class Pato {    
    //Attributos
    private int pontosDeEnergia = 100;
    //Método:
    
    
    
    
    public void pato() {
        pontosDeEnergia -= 5;
        if(pontosDeEnergia >= 5) {
        System.out.println("Estou voando como um pato com " + pontosDeEnergia + "Pontos de enrgia restantes");
        } else {
            System.out.println("Não tenho energia suficiente para voar");
        }
    }   
    public void Pato() {
       
    }    
    public void setPontosDeEnergia() {
        
        this.pontosDeEnergia = pontosDeEnergia;        
    }    
    public int getPontosDeEnegia() {       
        return this.pontosDeEnergia;
    }
}

