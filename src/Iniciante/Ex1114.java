package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1114 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 2002;
        int senha = sc.nextInt();

        while (senha != senhaCorreta) {
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido");

        sc.close();
    }
}