package Iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Ex1043 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        if(A+B > C && B+C > A && A+C > B){
            double perimetro = A+B+C;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        }else{
            double areaTrapezio = ((A+B)*C) / 2;
            System.out.printf("Area = %.1f\n", areaTrapezio);
        }
        sc.close();
    }
}