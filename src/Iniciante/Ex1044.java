package Iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Ex1044 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if(B%A == 0 || A%B == 0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}
