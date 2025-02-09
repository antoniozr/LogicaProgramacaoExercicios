/*
16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se
 são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.
 */

import java.util.Scanner;

public class Logica16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado A do triangulo:");
        int ladoA = sc.nextInt();

        System.out.println("Digite o lado B do triangulo:");
        int ladoB = sc.nextInt();

        System.out.println("Digite o lado C do triangulo:");
        int ladoC = sc.nextInt();

        boolean valido;

        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA){
            if (ladoA == ladoB && ladoB == ladoC){
                System.out.println("Equilátero");
            } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        }else {
            System.out.println("Os lados não formam um triângulo valido!");
        }

    }
}
