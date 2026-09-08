package Iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Ex1045 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double[] lados = new double[3];

        lados[0] = sc.nextDouble();
        lados[1] = sc.nextDouble();
        lados[2] = sc.nextDouble();

        Arrays.sort(lados);

        double A = lados[2];
        double B = lados[1];
        double C = lados[0];

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        sc.close();
    }
}

