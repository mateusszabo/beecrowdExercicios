package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1145 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        for (int i = 1; i <= Y; i++) {
            if (i % X == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}