package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex1060 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int positivo = 0;

        for(int i = 0; i < 6; i++){
            double valor = sc.nextDouble();
            if(valor >= 0){
                positivo++;
            }
        }
        System.out.println(positivo + " valores positivos");
        sc.close();
    }
}