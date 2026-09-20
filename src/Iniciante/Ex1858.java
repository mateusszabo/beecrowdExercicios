package Iniciante;
import java.util.Scanner;

public class Ex1858 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int maior = 100;
        int posicao = 1;

        for(int i = 1; i <= N; i++){
            int T = sc.nextInt();
            if(T < maior){
                maior = T;
                posicao = i;
            }
        }
        System.out.println(posicao);
    }
}
