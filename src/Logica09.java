import java.util.Scanner;

/*
9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa,
 leia o seu peso e sua altura e imprima na tela sua condição de acordo com a tabela abaixo:
Fórmula do IMC = peso / (altura) ²
Tabela Condições IMC
   Abaixo de 18,5   | Abaixo do peso

 Entre 18,6 e 24,9 | Peso ideal (parabéns)

 Entre 25,0 e 29,9 | Levemente acima do peso

 Entre 30,0 e 34,9 | Obesidade grau I

 Entre 35,0 e 39,9 | Obesidade grau II (severa)

 Maior ou igual a 40 | Obesidade grau III (mórbida)
 */
public class Logica09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu peso:");
        double peso = sc.nextDouble();

        System.out.println("Digite a sua altura(Ex 1,81)");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("%2.f" ,imc);

        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal (parabéns)");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade grau I ");
        } else if (imc <= 39.9){
            System.out.println("Obesidade grau II (severa)");
        } else {
            System.out.println("Obesidade grau III (mórbida)");
        }

        sc.close();
    }
}
