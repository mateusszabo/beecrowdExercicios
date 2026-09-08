package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int codigoPeca1 = sc.nextInt();
        int numeroPecas1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();
        int codigoPeca2 = sc.nextInt();
        int numeroPecas2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();

        double valorTotalPeca1 = numeroPecas1*valorPeca1;
        double valorTotalPeca2 = numeroPecas2*valorPeca2;
        double total = valorTotalPeca1 + valorTotalPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        sc.close();
    }
}
