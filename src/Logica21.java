/*
21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
 */

import java.util.Random;

public class Logica21 {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println(random.nextInt(101));
    }
}
