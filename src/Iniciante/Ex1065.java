package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1065 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int contagemPares = 0;
        int contagemImpares = 0;
        int contagemPositivos = 0;
        int contagemNegativos = 0;

        for(int i = 0; i < 5; i++){
            int valor = sc.nextInt();

            if(valor % 2 == 0){
                contagemPares++;
            }else{
                contagemImpares++;
            }
            if(valor > 0){
                contagemPositivos++;
            }else if(valor < 0){
                contagemNegativos++;
            }
        }
        System.out.println(contagemPares + " valor(es) par(es)");
        System.out.println(contagemImpares + " valor(es) impar(es)");
        System.out.println(contagemPositivos + " valor(es) positivo(s)");
        System.out.println(contagemNegativos + " valor(es) negativo(s)");

        sc.close();
    }
}