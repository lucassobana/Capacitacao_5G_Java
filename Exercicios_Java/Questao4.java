package Exercicios_Java;

import java.util.Random;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int x = r.nextInt(10);
        int y;
        boolean flag = false;

        do {
            System.out.println("Digite um valor entre 0 e 10");
            y = s.nextInt();
            if (y == x) {
                flag = true;
            } else {
                System.out.println("Número incorreto. Tente novamente.");
            }
            
        } while (y != x);
        System.out.println("Parabens voce acertou o numero");
    }
}
