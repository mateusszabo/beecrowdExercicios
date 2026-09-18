package Iniciante;
import java.util.Scanner;

public class Ex1189 {
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
                if(j + i < M.length - 1 && i > j){
                    soma += M[i][j];
                    elementos++;
                }
            }
        }
        double media = soma/elementos;
        if(T == 'S'){
            System.out.printf("%.1f\n", soma);
        }else if(T == 'M'){
            System.out.printf("%.1f\n", media);
        }
        sc.close();
    }
}
