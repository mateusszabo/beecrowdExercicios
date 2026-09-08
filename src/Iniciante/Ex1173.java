package Iniciante;
import java.util.Scanner;

public class Ex1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];
        int valor = sc.nextInt();

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = valor;
            valor = valor*2;
            System.out.println("N[" + i + "] = " + vetor[i]);
        }

        sc.close();
    }
}
