package Questao2;

public class Kart {

    private String nome;
    private Motor motor;

    public Kart(String nome){
        super();
        this.motor = new Motor();
    }

    public void pular(){
        System.out.println("O kart esta pulando");
    }
    
    public void soltarTurbo(){
        System.out.println("O kart esta soltando turbo");
    }

    public void fazerDrift(){
        System.out.println("O kart esta fazendo drift");
    }
}
