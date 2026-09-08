package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1067 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        for(int i=1; i <= valor; i+=2){
            System.out.println(i);
        }

        sc.close();
    }
}