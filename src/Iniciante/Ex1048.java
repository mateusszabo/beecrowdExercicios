package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex1048 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double novoSalario = 0.0;
        double porcentagem = 0.0;
        double reajuste = 0.0;

        if(salario <= 400){
            porcentagem = 0.15;
            reajuste = salario*porcentagem;
            novoSalario = salario + reajuste;
        }else if(salario <= 800){
            porcentagem = 0.12;
            reajuste = salario*porcentagem;
            novoSalario = salario + reajuste;
        }else if(salario <= 1200){
            porcentagem = 0.10;
            reajuste = salario*porcentagem;
            novoSalario = salario + reajuste;
        }else if(salario <= 2000){
            porcentagem = 0.07;
            reajuste = salario*porcentagem;
            novoSalario = salario + reajuste;
        }else{
            porcentagem = 0.04;
            reajuste = salario*porcentagem;
            novoSalario = salario + reajuste;
        }

        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %.0f %%\n", porcentagem*100);


        sc.close();
    }
}



