/*
21 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e
percentual de desconto do INSS. Imprima na tela o salário líquido final.
 */

import java.util.Scanner;

public class Logica23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor da hora aula: ");
        double valorHoraAula = sc.nextDouble();

        System.out.println("Insira número de hora aulas:");
        int numeroHoraAulas = sc.nextInt();

        System.out.println("Insira o percentual de desconto do INSS:");
        double percentualDesconto = sc.nextDouble();



        double salarioBruto = valorHoraAula * numeroHoraAulas;
        double salarioLiquido = salarioBruto - (salarioBruto * (percentualDesconto / 100));

        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("Salário liquido: " + salarioLiquido);
    }
}
