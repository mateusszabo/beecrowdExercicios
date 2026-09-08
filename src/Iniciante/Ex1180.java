package Iniciante;
import java.util.Scanner;

public class Ex1180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] vetor = new int[N];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
        }
        int menor = vetor[0];
        int indiceMenor = 0;
        for(int i = 1; i < vetor.length; i++){
            if(vetor[i] < menor){
                menor = vetor[i];
                indiceMenor = i;
            }

        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + indiceMenor);


        sc.close();
    }
}
