/*
15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos,
 meses e dias essa pessoa ja viveu. Leve em
consideração o ano com 365 dias e o mês com 30 dias.
(Ex: 5 anos, 2 meses e 15 dias de vida)
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Logica15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua data de nascimento: ");
        String dataNascimentoStr = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);

        LocalDate hoje = LocalDate.now();

        long ano = ChronoUnit.YEARS.between(dataNascimento, hoje);
        long mes = ChronoUnit.MONTHS.between(dataNascimento.plusYears(ano), hoje);
        long dia = ChronoUnit.DAYS.between(dataNascimento.plusYears(ano).plusMonths(mes), hoje);

        System.out.println("Anos: " + ano);
        System.out.println("Meses: " + mes);
        System.out.println("Dias: " + dia);

    }
}
