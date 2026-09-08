package Iniciante;
import java.util.Scanner;

public class Ex1177 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[100];
        int T = sc.nextInt();

        int valor = 0;
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = valor;
            System.out.println("N[" + i + "] = " + vetor[i]);

            valor++;
            if(valor == T){
                valor = 0;
            }
        }

        sc.close();
    }
}
