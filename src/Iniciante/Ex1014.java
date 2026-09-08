package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double distanciaKM = sc.nextDouble();
        double combustivelGasto = sc.nextDouble();

        double consumo = distanciaKM/combustivelGasto;

        System.out.printf("%.3f km/l\n", consumo);

        sc.close();
    }
}