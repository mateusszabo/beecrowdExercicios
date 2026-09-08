package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1064 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int contagem = 0;

        for(int i = 0; i < 6; i++){
            double valor = sc.nextDouble();
            if(valor > 0){
                soma += valor;
                contagem++;
            }
        }
        double media = soma / contagem;
        System.out.println(contagem + " valores positivos");
        System.out.printf("%.1f\n", media);

        sc.close();
    }
}