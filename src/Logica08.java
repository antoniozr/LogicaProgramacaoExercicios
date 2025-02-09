/*
8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima
na tela os valores em ordem decrescente.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Logica08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int valor1 = sc.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = sc.nextInt();

        System.out.println("Digite o terceiro valor:");
        int valor3 = sc.nextInt();

        Integer[] valores = {valor1, valor2, valor3};

        Arrays.sort(valores, Comparator.reverseOrder());

        System.out.println(Arrays.toString(valores));
    }
}
