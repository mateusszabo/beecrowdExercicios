package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1113 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        while(X != Y){
            if(X>Y){
                System.out.println("Decrescente");
            }else{
                System.out.println("Crescente");
            }
            X = sc.nextInt();
            Y = sc.nextInt();
        }

        sc.close();
    }
}