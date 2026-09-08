package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1099 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;

        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int soma = 0;

            int min = Math.min(X, Y);
            int max = Math.max(X, Y);

            for(int j = min + 1; j < max; j++){
                if(j % 2 != 0){
                    soma += j;
                }
            }
            System.out.println(soma);
        }
        sc.close();
    }
}