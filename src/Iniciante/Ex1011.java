package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1011 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double pi = 3.14159;

        double volumeEsfera = (4.0/3)*pi*(raio*raio*raio);

        System.out.printf("VOLUME = %.3f\n", volumeEsfera);

        sc.close();
    }
}