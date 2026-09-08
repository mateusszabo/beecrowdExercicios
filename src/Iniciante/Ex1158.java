package Iniciante;
import java.util.Scanner;

public class Ex1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma = 0;
        for(int i = 0; i < N; i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            soma = 0;
            for(int j = 0; j < Y; j++){
                if(X % 2 == 0){
                    X++;
                }
                soma+=X;
                X+=2;
            }
            System.out.println(soma);
        }

        sc.close();
    }
}
