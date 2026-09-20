package Iniciante;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Ex1827 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Utilização do PrintWriter para garantir execução rápida (evitar Time Limit)
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        while (sc.hasNextInt()) {
            int N = sc.nextInt();

            // Cálculos dos limites definidos pelo problema
            int centro = N / 2;
            int limiteInicio = N / 3;
            int limiteFim = N - 1 - limiteInicio;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {

                    // 1ª Prioridade: O ponto central exato (4)
                    if (i == centro && j == centro) {
                        pw.print(4);
                    }
                    // 2ª Prioridade: O quadrado interior (1)
                    else if (i >= limiteInicio && i <= limiteFim && j >= limiteInicio && j <= limiteFim) {
                        pw.print(1);
                    }
                    // 3ª Prioridade: Diagonal Principal (2)
                    else if (i == j) {
                        pw.print(2);
                    }
                    // 4ª Prioridade: Diagonal Secundária (3)
                    else if (i + j == N - 1) {
                        pw.print(3);
                    }
                    // 5ª Prioridade: O resto / exterior (0)
                    else {
                        pw.print(0);
                    }
                }
                pw.println(); // Quebra de linha ao fim de cada fila da matriz
            }
            pw.println(); // Linha em branco exigida após cada matriz
        }

        sc.close();
        pw.flush();
    }
}