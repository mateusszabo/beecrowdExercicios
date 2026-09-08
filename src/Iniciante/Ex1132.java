package Iniciante;
import java.io.IOException;
import java.util.Scanner;
public class Ex1132 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int nDivide = 0;

        if(X < Y) {
            for (int i = X; i <= Y; i++) {
                if (i % 13 != 0) {
                    nDivide += i;
                }
            }
        }else if(X > Y){
            for (int i = Y; i <= X; i++) {
                if (i % 13 != 0) {
                    nDivide += i;
                }
            }
        }else{
            System.out.println("0");
        }
        System.out.println(nDivide);

        sc.close();
    }
}