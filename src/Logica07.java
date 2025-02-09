import java.util.Scanner;

/*
7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
 */
public class Logica07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite true ou false");
        boolean valor1 = sc.nextBoolean();

        System.out.println("Digite true ou false");
        boolean valor2 = sc.nextBoolean();

        if (valor1 && valor2){
            System.out.println("Ambos os valores são verdadeiros");
        }else if (!valor1 && !valor2 ){
            System.out.println("Ambos os valores são falsos");
        }else {
            System.out.println("Um é verdadeiro e o outro é falso");
        }

        sc.close();
    }
}
