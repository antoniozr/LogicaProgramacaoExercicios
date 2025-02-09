/*
10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
 */

import java.util.Scanner;

public class Logica10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a primeira nota;");
        double nota1 = sc.nextDouble();

        System.out.println("Insira a segunda nota;");
        double nota2 = sc.nextDouble();

        System.out.println("Insira a terceira nota;");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média das notas é: %.2f" , media);


        sc.close();
    }
}
