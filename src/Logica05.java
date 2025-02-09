/*
5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
 calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado.
  (Base para o Salário mínimo R$ 1.293,20).
 */

import java.util.Scanner;

public class Logica05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo: ");
        double salarioMinimo = sc.nextDouble();

        System.out.println("Digite o valor do seu salário: ");
        double salarioUsuario = sc.nextDouble();

        double quantidadeSalarios = salarioUsuario / salarioMinimo;
        System.out.println("O usuário recebe " + quantidadeSalarios + " salários minimos");
    }

}
