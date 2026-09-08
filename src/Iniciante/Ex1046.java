package Iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Ex1046 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int inicio = sc.nextInt();
        int termino = sc.nextInt();

        if(termino > inicio) {
            int duracao = termino - inicio;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }else if(inicio > termino){
            int duracao = (24 - inicio) + termino;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }else{
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }


        sc.close();
    }
}


