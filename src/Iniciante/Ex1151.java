package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1151 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int atual = 0;
        int anterior1 = 1;
        int anterior2 = 0;

        for(int i = 2; i < N; i++){
            if(i < 3){
                System.out.print(anterior2 + " " + anterior1 + " ");
            }
            atual = anterior1 + anterior2;
            if(i == N - 1){
                System.out.println(atual);
            }else{
                System.out.print(atual + " ");
            }
            anterior2 = anterior1;
            anterior1 = atual;
        }

        sc.close();
    }
}