package Iniciante;
import java.util.Scanner;

public class Ex1759 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N - 1; i++) {
            System.out.print("Ho ");
        }
        System.out.println("Ho!");

        sc.close();
    }
}
