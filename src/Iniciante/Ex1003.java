package Iniciante;

import java.util.Scanner;
import java.io.IOException;
public class Ex1003 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();

        int soma = valor1 + valor2;

        System.out.println("SOMA = " + soma);

        sc.close();

    }

}