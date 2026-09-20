package Iniciante;

import java.util.Scanner;

public class Ex1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int L = sc.nextInt();
            int maiorNivel = 1;

            for(int i = 0; i < L; i++){
                int V = sc.nextInt();

                if(V >= 10 && V < 20 && maiorNivel < 2){
                    maiorNivel = 2;
                }else if(V >=20){
                    maiorNivel = 3;
                }
            }
            System.out.println(maiorNivel);
        }
    }
}
