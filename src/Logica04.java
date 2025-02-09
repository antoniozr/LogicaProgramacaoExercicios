/*
4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
 */

import java.util.Scanner;

public class Logica04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();

        System.out.println("O antecesor de " + numero + " é " + (numero - 1) );
        System.out.println("O sucesor de " + numero + " é " + (numero + 1) );
    }
}
