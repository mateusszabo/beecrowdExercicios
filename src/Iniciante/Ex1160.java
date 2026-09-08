package Iniciante;
import java.util.Scanner;

public class Ex1160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int popA = sc.nextInt();
            int popB = sc.nextInt();
            double cresA = sc.nextDouble();
            double cresB = sc.nextDouble();

            int contadorAnos = 0;

            while(popA <= popB && contadorAnos <= 100){
                popA += (int) (popA * (cresA/100));
                popB += (int) (popB * (cresB/100));
                contadorAnos++;
            }
            if(contadorAnos > 100){
                System.out.println("Mais de 1 seculo.");
            }else{
                System.out.println(contadorAnos + " anos.");
            }
        }

        sc.close();
    }
}
