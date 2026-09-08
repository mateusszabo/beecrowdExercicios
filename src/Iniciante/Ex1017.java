package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); //horas
        int v = sc.nextInt(); //km/h
        //carro precisa de 1L pra fazer 12km
        int s = v*t;

        double quantidadeNecessaria =  (s / 12.0);

        System.out.printf("%.3f\n", quantidadeNecessaria);

        sc.close();
    }
}