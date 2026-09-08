package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1134 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int decisao = 0;

        while (decisao != 4) {
            decisao = sc.nextInt();

            switch (decisao) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}