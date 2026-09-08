package Iniciante;
import java.util.Scanner;

public class Ex1165 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            boolean primo = false;
            int X = sc.nextInt();
            for(int j = 2; j < X; j++){
                if(X % j == 0){
                    primo = true;
                }
            }
            if(primo){
                System.out.println(X + " nao eh primo");
            }else{
                System.out.println(X + " eh primo");
            }
        }


        sc.close();
    }
}
