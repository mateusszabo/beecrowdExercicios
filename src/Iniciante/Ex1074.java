package Iniciante;
import java.io.IOException;
import java.util.Scanner;
public class Ex1074 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            int valor = sc.nextInt();
            if(valor == 0){
                System.out.println("NULL");
            }else if(valor % 2 == 0 && valor > 0){
                System.out.println("EVEN POSITIVE");
            }else if(valor % 2 == 0 && valor < 0){
                System.out.println("EVEN NEGATIVE");
            }else if(valor % 2 != 0 && valor > 0){
                System.out.println("ODD POSITIVE");
            }else if(valor % 2 != 0 && valor < 0){
                System.out.println("ODD NEGATIVE");
            }
        }

        sc.close();
    }
}