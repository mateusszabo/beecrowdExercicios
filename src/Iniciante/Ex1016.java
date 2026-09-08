package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int distancia = sc.nextInt();

        int tempo = distancia * 2;
        System.out.println(tempo + " minutos");
        sc.close();
    }
}