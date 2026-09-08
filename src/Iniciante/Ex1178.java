package Iniciante;
import java.util.Scanner;

public class Ex1178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] v = new double[100];
        double X = sc.nextDouble();
        v[0] = X;
        System.out.printf("N[0] = %.4f\n", v[0]);

        for(int i = 1; i < v.length; i++){
            v[i] = v[i-1]/2.0;
            System.out.printf("N[%d] = %.4f\n", i, v[i]);
        }

        sc.close();
    }
}
