package Iniciante;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Ex1478 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    int valor;
                    if (i == j) {
                        valor = 1;
                    } else if (i > j) {
                        valor = i - j + 1;
                    } else {
                        valor = j - i + 1;
                    }
                    if (j == 0) {
                        pw.printf("%3d", valor);
                    } else {
                        pw.printf(" %3d", valor);
                    }
                }
                pw.println();
            }
            pw.println();
        }
        pw.flush();
        sc.close();
    }
}