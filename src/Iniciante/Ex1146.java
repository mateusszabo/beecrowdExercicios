package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1146 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        while(X != 0){
            for(int i = 1; i <= X ; i++)
                if(i== X){
                    System.out.println(i);
                }else{
                    System.out.print(i + " ");
                }
            X = sc.nextInt();
        }

        sc.close();
    }
}