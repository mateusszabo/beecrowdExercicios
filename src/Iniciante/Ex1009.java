package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String nomeVendedor = sc.nextLine();
        double salarioVendedor = sc.nextDouble();
        double vendasRealizadas = sc.nextDouble();

        double comissao = vendasRealizadas*0.15;
        double salario = salarioVendedor + comissao;

        System.out.printf("TOTAL = R$ %.2f\n", salario);
        sc.close();
    }
}
