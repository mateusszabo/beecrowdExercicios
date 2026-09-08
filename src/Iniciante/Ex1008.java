package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1008 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int horas = sc.nextInt();
        double horaTrab = sc.nextDouble();

        double salario = horaTrab*horas;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        sc.close();
    }
}