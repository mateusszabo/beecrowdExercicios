package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1150 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Z = sc.nextInt();
        while(X >= Z){
            Z = sc.nextInt();
        }
        int acumulador = 0;
        int contador = 0;
        for(int i = X; acumulador < Z; i++){
            acumulador += i;
            contador++;
        }
        System.out.println(contador);



        sc.close();
    }
}