/*
14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e
 imprima na tela os valores.
 */

import java.util.Scanner;

public class Logica14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor A:");
        int a = sc.nextInt();

        System.out.println("Digite o valor B:");
        int b = sc.nextInt();

        var troca = a;
        a = b;
        b = troca;

        System.out.println("Depois da troca");
        System.out.println("A:" + a);
        System.out.println("B:" + b);


    }
}
