/*
22 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem,
 sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na
 viagem a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer
 a viagem.

Fórmula: distância = tempo x velocidade.

            litros usados = distância / 12.
 */

import java.util.Scanner;

public class Logica24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tempo de duração da viagem em horas:");
        int duracaoViagem = sc.nextInt();

        System.out.println("Velocidade media da viagem:");
        double velocidadeMedia = sc.nextDouble();

        double distanciaPercorida = duracaoViagem * velocidadeMedia;
        double litrosUsados = distanciaPercorida / 12;

        System.out.printf("Distância percorida: %.2f km\n", distanciaPercorida);
        System.out.printf("Quantidade de litros usados: %.2f litros ", litrosUsados);

        sc.close();
    }
}
