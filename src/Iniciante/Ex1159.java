package Iniciante;
import java.util.Scanner;

public class Ex1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int soma = 0;

        while(X != 0){
            for(int i = 0; i < 5; i++){
                if(X % 2 != 0){
                    X++;
                }
                soma+=X;
                X+=2;
            }
            System.out.println(soma);
            X = sc.nextInt();
            soma = 0;
        }

        sc.close();
    }
}
