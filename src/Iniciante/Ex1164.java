package Iniciante;
import java.util.Scanner;

public class Ex1164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma = 0;

        for(int i = 0; i < N; i++){
            int X = sc.nextInt();
            for(int j = 1; j < X; j++){
                if(X % j == 0){
                    soma+=j;
                }
            }
            if(X == soma){
                System.out.println(X + " eh perfeito");
            }else{
                System.out.println(X + " nao eh perfeito");
            }
            soma = 0;
        }


        sc.close();
    }
}
