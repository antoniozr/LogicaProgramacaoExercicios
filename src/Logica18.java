/*
18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e
 cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela em
  quantos anos serão necessários para que Francisco seja maior que Sara.
 */

import java.util.Scanner;

public class Logica18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();

        double alturaFrancisco = 1.50;
        double alturaSara = 1.10;
        int anos = 0;

        while (alturaSara <= alturaFrancisco){
            alturaFrancisco += 0.02;
            alturaSara += 0.03;
            anos++;
        }

        System.out.println("Serão necessarios " + anos + "anos");
            }
}
