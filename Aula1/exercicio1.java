package Aula1;

import java.util.Scanner;

public class exercicio1{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        System.out.println("Selecione quantos alunos serao: 10, 20 ou 30");
        x = s.nextInt();

        switch(x){
            case 10:
            System.out.println("Sala 16");
            break;

            case 20:
            System.out.println("Sala 16");
            break;

            case 30:
            System.out.println("Sala 22");
            break;

            default:
            System.out.println("Numero inserido invalido");
        }

    }

}