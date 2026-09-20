package Iniciante;
import java.util.Scanner;

public class Ex1837 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b != 0) {
            int resto = a % b;

            if (resto < 0) {
                resto = resto + Math.abs(b);
            }
            int quociente = (a - resto) / b;
            System.out.println(quociente + " " + resto);
        }

        sc.close();
    }
}