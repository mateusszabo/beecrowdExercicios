package Iniciante;
import java.util.Scanner;

public class Ex1182 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();
        int T = sc.next().charAt(0);

        double[][] matriz = new double[12][12];
        double soma = 0.0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = sc.nextDouble();
            }
        }

        for(int i = 0; i < matriz.length; i++){
            soma += matriz[i][C];
        }

        if(T == 'S'){
            System.out.printf("%.1f\n", soma);
        }else if(T == 'M'){
            System.out.printf("%.1f\n", soma/matriz.length);
        }

    }
}
