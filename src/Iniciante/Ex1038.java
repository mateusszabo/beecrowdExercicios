package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex1038 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double valor = 0.0;

        switch(codigo){
            case 1:
                valor = 4.0*quantidade;
                break;
            case 2:
                valor = 4.5*quantidade;
                break;
            case 3:
                valor = 5.0*quantidade;
                break;
            case 4:
                valor = 2.0*quantidade;
                break;
            case 5:
                valor = 1.5*quantidade;
                break;
        }

        System.out.printf("Total: R$ %.2f\n", valor);

        sc.close();
    }
}