package Iniciante;
import java.io.IOException;
import java.util.Scanner;
public class Ex1079 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double mediaPond =((a*2) + (b*3) + (c*5)) / 10;
            System.out.printf("%.1f\n", mediaPond);
        }

        sc.close();
    }
}