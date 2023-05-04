package Questao2;

public class Motor {

    private int cilindradas;
    private int vel_maxima;

    public Motor() {
        this.cilindradas = 0;
        this.vel_maxima = 0;
    }

    public Motor(int cilindradas, int vel_maxima){
        this.cilindradas = cilindradas;
        this.vel_maxima = vel_maxima;
    }

    public void mostraInfo(){
        System.out.println("Cilindradas = " + cilindradas);
        System.out.println("Velocidade maxima = " + vel_maxima);
    }
    
    
}
