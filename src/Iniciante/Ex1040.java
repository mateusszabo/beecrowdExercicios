package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex1040 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double nota4 = sc.nextDouble();

        double media = ((nota1*2) + (nota2*3) + (nota3*4) + (nota4*1)) / 10;

        System.out.printf("Media: %.1f\n", media);

        boolean exame = false;

        if(media >= 7){
            System.out.println("Aluno aprovado.");
        }else if(media < 5){
            System.out.println("Aluno reprovado.");
        }else{
            System.out.println("Aluno em exame.");
            exame = true;
        }

        if(exame){
            double notaExame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", notaExame);
            media = (media + notaExame) / 2;
            if(media >= 5){
                System.out.println("Aluno aprovado.");
            }else{
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", media);
        }


        sc.close();
    }
}