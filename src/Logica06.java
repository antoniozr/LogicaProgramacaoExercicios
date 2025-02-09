/*
6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
 */

import java.util.Scanner;

public class Logica06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = sc.nextDouble();

        double maisPercentual = valor + (valor * 0.05);
        System.out.println(maisPercentual);
    }
}
