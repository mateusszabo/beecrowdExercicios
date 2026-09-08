package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1153 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int fatorial = 1;

        for(int i = N; i > 1; i--){
            fatorial = fatorial*i;
        }
        System.out.println(fatorial);

        sc.close();
    }
}