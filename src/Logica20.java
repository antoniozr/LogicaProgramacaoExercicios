/*
20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.


 */

import java.util.Scanner;

public class Logica20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um valor inteiro:");
        int valor = sc.nextInt();

        System.out.println("Tabuado do " + valor);
        for (int i = valor; i <=10 ; i++) {
            System.out.println(valor + " * " + i + " = " + valor * i);
        }
    }
}
