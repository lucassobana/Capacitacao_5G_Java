package Questao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Zumbi zumbi = new Zumbi("Zumbi");


        while (!zumbi.estaAlimentado()) {
            int x;

            System.out.println("Quantos pontos o zumbi vai perder ?");
            zumbi.perderVida(s.nextInt());
            System.out.println("Pontos de saúde do zumbi: " + zumbi.getPontosDeSaude());

            System.out.println("\nQuantos pontos o zumbi vai ganhar ?");
            zumbi.alimentar(s.nextInt());
            System.out.println("Pontos de saúde do zumbi: " + zumbi.getPontosDeSaude() + "\n");
        }

        System.out.println("O zumbi está alimentado!");
    }
}