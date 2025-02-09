/*
13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa
e se ela é maior ou menor de idade.
 */

import java.util.Scanner;

public class Logica13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite a sua idade:");
        int idade = sc.nextInt();

        System.out.println(nome);
        if (idade < 18){
            System.out.println("Menor de idade!");
        }else {
            System.out.println("Maior de idade!");
        }
    }
}
