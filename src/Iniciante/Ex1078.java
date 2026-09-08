package Iniciante;
import java.io.IOException;
import java.util.Scanner;
public class Ex1078 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i < 11; i++){
            int resultado = i*N;
            System.out.println(i + " x " + N + " = " + resultado);
        }
        sc.close();
    }
}