package Aula1;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int npa;
        System.out.println("Insira NPA do aluno");
        npa = s.nextInt(); // Entrando com valor da NPA
        
        // Casos da NPA
        if(npa >= 60){
            System.out.println("Aluno aprovado");
        }
        else{
            int np3,nfa; // Declaracao de valores da NP3 e NFA
            np3 = s.nextInt(); // Entrando com valor da NP3
            nfa = (np3 + npa) / 2; // Calculando valor da NFA
            if (nfa >= 50) {
                System.out.println("Aluno aprovado");
            } else {
                System.out.println("Aluno reprovado");
            }
        }
    }
    
}
