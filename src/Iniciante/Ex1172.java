package Iniciante;
import java.util.Scanner;

public class Ex1172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
            if(vetor[i] == 0 || vetor[i] < 0){
                vetor[i] = 1;
            }
            System.out.println("X[" + i + "] = " + vetor[i]);
        }

        sc.close();
    }
}
