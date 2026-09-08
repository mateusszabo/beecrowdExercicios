package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1095 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int J = 60;
        int I = 1;

        while(J!=0){
            System.out.println("I=" + I + " J=" + J);
            I+=3;
            J-=5;
        }
        System.out.println("I=" + I + " J=" + J);

        sc.close();
    }

}