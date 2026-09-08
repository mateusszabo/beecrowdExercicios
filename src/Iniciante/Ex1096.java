package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1096 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int temp = 7;

        for(int i = 1; i<=9; i+=2){
            for(int j=temp; j >= temp-2; j--){
                System.out.println("I=" + i + " J=" + j);
            }
            temp+=2;
        }

        sc.close();
    }
}
