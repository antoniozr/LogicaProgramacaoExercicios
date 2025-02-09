/*
3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais,
 deverá somar os dois valores,
 */

import java.util.Scanner;

public class Logica03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.println("Digite o valor de A: ");
        int b = sc.nextInt();

        if (a == b){
            int c = a + b;
            System.out.println("A soma entre a e b é: " + c);
        } else {
            int c = a * b;
            System.out.println("A multiplicação entre a e b é: " + c);
        }



        System.out.println();

    }
}
