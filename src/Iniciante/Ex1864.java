package Iniciante;
import java.util.Scanner;
public class Ex1864 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "LIFE IS NOT A PROBLEM TO BE SOLVED";

        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            System.out.print(frase.charAt(i));
        }
        System.out.println();
        sc.close();
    }
}
