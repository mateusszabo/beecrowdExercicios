package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1149 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int N = sc.nextInt();
        while(N < 1){
            N = sc.nextInt();
        }
        int acumulador = 0;

        for(int i = 0;  i <= N-1; i++){
            acumulador+=A+i;

        }
        System.out.println(acumulador);

        sc.close();
    }
}