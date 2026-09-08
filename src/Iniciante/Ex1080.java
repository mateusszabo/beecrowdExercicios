package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex1080 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int maiorValor = 0;
        int turno = 0;

        for (int i = 1; i < 101; i++) {
            int valor = sc.nextInt();
            if (valor > maiorValor) {
                maiorValor = valor;
                turno = i;
            }
        }
        System.out.println(maiorValor);
        System.out.println(turno);


        sc.close();
    }

}