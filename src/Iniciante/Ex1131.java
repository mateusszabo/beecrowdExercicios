package Iniciante;
import java.io.IOException;
import java.util.Scanner;
public class Ex1131 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int resposta = 1;
        int vitoriaInter = 0;
        int vitoriaGremio = 0;
        int empate = 0;
        int jogos = 0;

        while(resposta == 1) {
            int inter = sc.nextInt();
            int gremio = sc.nextInt();
            if(inter > gremio){
                vitoriaInter++;
            }else if(inter < gremio){
                vitoriaGremio++;
            }else{
                empate++;
            }
            jogos++;
            do{
                System.out.println("Novo grenal (1-sim 2-nao)");
                resposta = sc.nextInt();
            }while(resposta != 1 && resposta != 2);
        }

        System.out.println(jogos + " grenais");
        System.out.println("Inter:" + vitoriaInter);
        System.out.println("Gremio:" + vitoriaGremio);
        System.out.println("Empates:" + empate);
        if(vitoriaGremio>vitoriaInter){
            System.out.println("Gremio venceu mais");
        }else if(vitoriaInter>vitoriaGremio){
            System.out.println("Inter venceu mais");
        }else{
            System.out.println("Nao houve vencedor");
        }
        sc.close();
    }
}