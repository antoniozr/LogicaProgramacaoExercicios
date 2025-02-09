/*
 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas,
 imprima na tela o nome do aluno e  se o aluno foi aprovado ou reprovado.
 Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7. */

import java.util.Scanner;

public class Logica11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalNotas = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Insira a " + (i +1 ) + "° nota");
            double nota = sc.nextDouble();
            totalNotas += nota;
        }
        double mediaNotas = totalNotas / 4;

        if (mediaNotas >= 7) {
            System.out.printf("Você foi aprovado a média das notas é: %.2f", mediaNotas);
        }else {
            System.out.printf("Você foi reprovado a média das notas é: %.2f", mediaNotas);
        }

        sc.close();
    }
}
