package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1142 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int temp = 1;

        for(int i = temp; i <= N; i++){
            System.out.println(temp+" "+(temp+1)+" "+(temp+2)+" PUM");
            temp+=4;
        }

        sc.close();
    }
}