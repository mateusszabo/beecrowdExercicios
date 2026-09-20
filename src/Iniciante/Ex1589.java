package Iniciante;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class Ex1589 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int R1 = sc.nextInt();
            int R2 = sc.nextInt();
            int menorRaio = R1 + R2;
            pw.println(menorRaio);
            pw.flush();
        }
    }
}
