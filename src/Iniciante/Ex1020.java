package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex1020 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        int ano = idade / 365;
        int resto = idade % 365;
        int meses = resto / 30;
        resto = resto % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(resto + " dia(s)");

        sc.close();
    }
}