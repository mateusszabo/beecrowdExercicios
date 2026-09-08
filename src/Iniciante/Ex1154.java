package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1154 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int acumulador = 0;
        int contador = 0;

        while(N > 0){
            acumulador+=N;
            N = sc.nextInt();
            contador++;
        }
        double media = (double) acumulador / contador;
        System.out.printf("%.2f\n", media);

        sc.close();
    }
}