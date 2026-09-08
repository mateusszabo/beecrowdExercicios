package Iniciante;
import java.util.Scanner;

public class Ex1179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] pares = new int[5];
        int[] impares = new int[5];

        int contPar = 0;
        int contImpar = 0;

        for(int i = 0 ; i < 15; i++){
            int valor = sc.nextInt();
            if(valor % 2 == 0){
                pares[contPar] = valor;
                contPar++;
                if(contPar == 5){
                    for(int j = 0; j < pares.length; j++){
                        System.out.println("par[" + j + "] = " + pares[j]);
                    }
                    contPar = 0;
                }
            }else{
                impares[contImpar] = valor;
                contImpar++;
                if(contImpar == 5){
                    for(int k = 0; k < pares.length; k++){
                        System.out.println("impar[" + k + "] = " + impares[k]);
                    }
                    contImpar = 0;
                }
            }
        }
        for (int i = 0; i < contImpar; i++) {
            System.out.println("impar[" + i + "] = " + impares[i]);
        }

        for (int i = 0; i < contPar; i++) {
            System.out.println("par[" + i + "] = " + pares[i]);
        }

        sc.close();
    }
}
