package Iniciante;

import java.util.Scanner;

public class Ex1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Leitura da linha e da operação
        int L = sc.nextInt();
        char T = sc.next().charAt(0);

        // 2. Declaração da matriz 12x12
        double[][] M = new double[12][12];
        double soma = 0.0;

        // 3. Preenchimento da matriz
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = sc.nextDouble();
            }
        }

        // 4. Cálculo da linha específica
        for (int j = 0; j < 12; j++) {
            soma += M[L][j];
        }

        // 5. Exibição do resultado
        if (T == 'S') {
            System.out.printf("%.1f\n", soma);
        } else if (T == 'M') {
            double media = soma / 12.0;
            System.out.printf("%.1f\n", media);
        }
        sc.close();
    }
}