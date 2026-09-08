package Iniciante;
import java.util.Scanner;

public class Ex1176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        long[] fib = new long[61];
        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i <= 60; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        for(int i = 0; i < T; i++){
            int procurarIndice = sc.nextInt();
            System.out.println("Fib" + "(" + procurarIndice + ") = " + fib[procurarIndice]);
        }

        sc.close();
    }
}
