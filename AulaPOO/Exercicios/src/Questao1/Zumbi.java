package Questao1;

public class Zumbi {
    private String nome;
    private int pontos_de_saude;

    public Zumbi(String nome) {
        this.nome = nome;
        this.pontos_de_saude = 50;
    }

    public void alimentar(int x) {
        pontos_de_saude += x;
        System.out.println("Zumbi alimentando");
    }

    public void perderVida(int x) {
        pontos_de_saude -= x;
        System.out.println("Zumbi perdendo vida");
    }

    public boolean estaAlimentado() {
        return pontos_de_saude >= 100;
    }

    public int getPontosDeSaude() {
        return pontos_de_saude;
    }
}
