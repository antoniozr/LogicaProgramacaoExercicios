/*
2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar,
positivo ou negativo.
 */

import java.util.Scanner;

public class Logica02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " é um número par");
        }else {
            System.out.println(num + " é um número impar");
        }

        if (num > 0){
            System.out.println(num + " é um número positivo");
        } else {
            System.out.println(num + " é um número negativo");
        }

        sc.close();
    }
}
