package Iniciante;
import java.util.Scanner;

public class Ex1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int soma = A + B;

        System.out.println("X = " + soma);

        sc.close();
    }
}
