/*
17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente
em grau Celsius. Imprima na tela as duas temperaturas.

Fórmula: C = (5 * ( F-32) / 9)
 */

import java.util.Scanner;

public class Logica17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit:");
        double tempFahrenheit = scanner.nextDouble();

        double tempCelcius = (5 * (tempFahrenheit - 32 ) / 9);

        System.out.printf("Temperatura em Fahrenheit: %.2f°F\n", tempFahrenheit);
        System.out.printf("Temperatura em Celsius: %.2f°C\n", tempCelcius);
    }
}
