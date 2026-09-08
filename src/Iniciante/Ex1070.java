package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1070 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        if(valor % 2 == 0){
            valor++;
        }

        for(int i=0; i < 6; i++){
            System.out.println(valor);
            valor+=2;
        }

        sc.close();
    }
}