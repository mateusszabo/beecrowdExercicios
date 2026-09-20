package Iniciante;
import java.util.Scanner;

public class Ex1847 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && b <= c) {
            System.out.println(":)");
        } else if (a < b && b >= c) {
            System.out.println(":(");
        } else if (a < b && b < c) {
            if ((c - b) < (b - a)) {
                System.out.println(":(");
            } else {
                System.out.println(":)");
            }
        } else if (a > b && b > c) {
            if ((b - c) < (a - b)) {
                System.out.println(":)");
            } else {
                System.out.println(":(");
            }
        } else if (a == b) {
            if (c > b) {
                System.out.println(":)");
            } else {
                System.out.println(":(");
            }
        }

        scanner.close();
    }
}