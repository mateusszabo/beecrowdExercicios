package Iniciante;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class Ex1557 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        while(true){
            int N = sc.nextInt();
            if(N == 0){
                break;
            }
            int maior = (int) Math.pow(2, (N - 1) + (N - 1));
            int T = String.valueOf(maior).length();

            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    int valor = (int) Math.pow(2,i+j);

                    if (j == 0) {
                        pw.printf("%" + T + "d", valor);
                    } else {
                        pw.printf(" %" + T + "d", valor);
                    }
                }
                pw.println();
            }
            pw.println();
        }
        sc.close();
        pw.flush();
    }
}
