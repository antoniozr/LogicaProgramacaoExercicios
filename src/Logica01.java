import java.util.Scanner;

/*
1 - Faça um algoritmo que leia os valores de A, B, C
 e em seguida imprima na tela a soma entre A e B
  e mostre se a soma é menor que C.
 */

public class Logica01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = sc.nextInt();

        System.out.println("Digite o valor de C: ");
        int c = sc.nextInt();

        int somaab = a + b;
        System.out.println("A soma entre A e B é " + somaab);
        if (somaab < c){
            System.out.println("A soma entre A e B é menor que C");
        } else {

        }

        sc.close();
    }
}
