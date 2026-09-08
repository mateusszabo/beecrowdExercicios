package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1094 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int C = 0;
        int R = 0;
        int S = 0;

        for(int i = 0; i < N; i++){
            int quantia = sc.nextInt();
            String tipo = sc.next().toUpperCase();
            if(tipo.equals("C")){
                C+=quantia;
            }
            if(tipo.equals("R")){
                R+=quantia;
            }
            if(tipo.equals("S")){
                S+=quantia;
            }
        }
        int total = C+R+S;
        double percentualC = ((double) C/total)*100;
        double percentualR = ((double) R/total)*100;
        double percentualS = ((double) S/total)*100;
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + C);
        System.out.println("Total de ratos: " + R);
        System.out.println("Total de sapos: " + S);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentualC);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentualR);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentualS);


        sc.close();
    }

}