package Iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Ex1021 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double valorLido = sc.nextDouble();

        int centavos = (int) Math.round(valorLido * 100);

        int nota100 = centavos / 10000;
        int resto = centavos % 10000;

        int nota50 = resto / 5000;
        resto = resto % 5000;

        int nota20 = resto / 2000;
        resto = resto % 2000;

        int nota10 = resto / 1000;
        resto = resto % 1000;

        int nota5 = resto / 500;
        resto = resto % 500;

        int nota2 = resto / 200;
        resto = resto % 200;

        int moeda1 = resto / 100;
        resto = resto % 100;

        int moeda50 = resto / 50;
        resto = resto % 50;

        int moeda25 = resto / 25;
        resto = resto % 25;

        int moeda10 = resto / 10;
        resto = resto % 10;

        int moeda5 = resto / 5;
        resto = resto % 5;

        int moeda1_centavo = resto / 1;

        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(moeda1_centavo + " moeda(s) de R$ 0.01");

        sc.close();
    }
}