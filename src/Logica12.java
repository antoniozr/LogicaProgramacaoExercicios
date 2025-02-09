/*
12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago,
 conforme a escolha da forma de pagamento pelo comprador e imprima na tela o valor final do
 produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

 Tabela de Código de Condições de Pagamento

 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
 2 - À Vista no cartão de crédito, recebe 10% de desconto
 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
 */

import java.util.Scanner;

public class Logica12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double desconto = 0;
        double juros = 0;

        System.out.println("Digite o valor do produto: ");
        double valorProduto = sc.nextDouble();

        System.out.println("Selecione a forma de pagamento:");
        System.out.println("1-Dinheiro");
        System.out.println("2-Pix");
        System.out.println("3-Cartão");
        int formaPagamento = sc.nextInt();

        if (formaPagamento == 1 || formaPagamento ==2){
            desconto = 0.15;
        } else if (formaPagamento == 3){
            System.out.println("Em quantas vezes:");
            int parcelas = sc.nextInt();
            if (parcelas == 1){
                desconto = 0.10;
            }else if (parcelas == 2){
                desconto = 0;
            }else {
                desconto = 0;
                juros = 0.10;
            }
        }

        System.out.println("Valor a ser pago: ");
        if (desconto > 0){
            System.out.println(valorProduto - (valorProduto * desconto));
        }else {
            System.out.println(valorProduto + (valorProduto * juros));
        }
    }
}
