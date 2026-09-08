package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex1047 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int inicio = sc.nextInt();
        int inicioMinuto = sc.nextInt();
        int termino = sc.nextInt();
        int terminoMinuto = sc.nextInt();

        if(termino > inicio) {
            int duracao = termino - inicio;
            if(terminoMinuto >= inicioMinuto){
                int duracaoMinuto = terminoMinuto - inicioMinuto;
                System.out.println("O JOGO DUROU " + duracao + " HORA(S) E " + duracaoMinuto + " MINUTO(S)");
            }else if(inicioMinuto > terminoMinuto){
                int duracaoMinuto = 60 -(inicioMinuto - terminoMinuto);
                duracao = duracao - 1;
                System.out.println("O JOGO DUROU " + duracao + " HORA(S) E " + duracaoMinuto + " MINUTO(S)");
            }
        }else if(inicio > termino){
            int duracao = (24 - inicio) + termino;
            if(terminoMinuto >= inicioMinuto){
                int duracaoMinuto = terminoMinuto - inicioMinuto;
                System.out.println("O JOGO DUROU " + duracao + " HORA(S) E " + duracaoMinuto + " MINUTO(S)");
            }else {
                int duracaoMinuto = 60 -(inicioMinuto - terminoMinuto);
                duracao = duracao - 1;
                System.out.println("O JOGO DUROU " + duracao + " HORA(S) E " + duracaoMinuto + " MINUTO(S)");
            }
        }else{
            if(terminoMinuto > inicioMinuto){
                int duracaoMinuto = terminoMinuto - inicioMinuto;
                System.out.println("O JOGO DUROU 0 HORA(S) E " + duracaoMinuto + " MINUTO(S)");
            }else if(inicioMinuto > terminoMinuto){
                int duracaoMinuto = 60 -(inicioMinuto - terminoMinuto);
                System.out.println("O JOGO DUROU 23 HORA(S) E " + duracaoMinuto + " MINUTO(S)");
            }else{
                System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
            }
        }
        sc.close();
    }
}



