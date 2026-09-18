package Iniciante;
import java.util.Scanner;

public class Ex1183 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.next().charAt(0);

        double[][] M = new double[12][12];
        double soma = 0.0;
        int elementos = 0;

        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                 M[i][j] = sc.nextDouble();
            }
        }

        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                if(j > i){
                    soma += M[i][j];
                    elementos++;
                }
            }
        }

        if(T == 'S'){
            System.out.printf("%.1f\n", soma);
        }else if(T == 'M'){
            System.out.printf("%.1f\n", soma/elementos);
        }

    }
}
