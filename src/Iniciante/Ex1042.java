package Iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Ex1042 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[3];

        valores[0] = sc.nextInt();
        valores[1] = sc.nextInt();
        valores[2] = sc.nextInt();

        int[] valores2 = Arrays.copyOf(valores, 3);

        Arrays.sort(valores);

        System.out.println(valores[0]);
        System.out.println(valores[1]);
        System.out.println(valores[2]);

        System.out.println();

        System.out.println(valores2[0]);
        System.out.println(valores2[1]);
        System.out.println(valores2[2]);


        sc.close();
    }
}