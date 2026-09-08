package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int segundos = sc.nextInt();

        int minutos = segundos/60;
        int horas = minutos/60;
        minutos = minutos % 60;
        segundos = segundos % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);


        sc.close();
    }
}