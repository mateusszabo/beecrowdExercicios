package Iniciante;
import java.util.Scanner;

public class Ex1175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[20];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
        }
        int temp = vetor.length - 1;

        for(int i = 0; i < (vetor.length/2); i++){
            int temp2 = vetor[i];
            vetor[i] = vetor[temp];
            vetor[temp] = temp2;
            temp = temp - 1;
        }
        for(int i = 0; i < vetor.length; i++) {
            System.out.println("N[" + i + "] = " + vetor[i]);
        }

        sc.close();
    }
}
