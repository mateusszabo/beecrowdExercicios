package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1143 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i <= N; i++){
            int coluna2 = (int) Math.pow(i, 2);
            int coluna3 = (int) Math.pow(i, 3);
            System.out.println(i + " " + coluna2 + " " + coluna3);

        }

        sc.close();
    }
}