package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex1051 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double renda = sc.nextDouble();
        double imposto = 0.0;
        double impostoPobre = 1000*0.08;
        double impostoMedio = 1500*0.18;
        double impostoRico = (renda - 4500)*0.28;

        if(renda <= 2000){
            System.out.println("Isento");
        }else if(renda <= 3000){
            imposto = (renda-2000)*0.08;
            System.out.printf("R$ %.2f\n", imposto);
        }else if(renda <= 4500){
            imposto = impostoPobre + ((renda-3000)*0.18);
            System.out.printf("R$ %.2f\n", imposto);
        }else{
            imposto = impostoPobre + impostoMedio + impostoRico;
            System.out.printf("R$ %.2f\n", imposto);
        }


        sc.close();
    }
}

