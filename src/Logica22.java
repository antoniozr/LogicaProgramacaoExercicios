/*
22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e
 o resto da divisão inteira entre eles.
 */

import java.util.Scanner;

public class Logica22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero A:");
        int a = sc.nextInt();

        System.out.println("Digite o numero B:");
        int b = sc.nextInt();

        int quociente = a / b;
        int resto = a % b;

        System.out.printf("O quociente entre %d e %d é %d\n" , a , b , quociente);
        System.out.printf("O resto entre %d e %d é %d\n" , a , b , resto);
        sc.close();
    }
}
