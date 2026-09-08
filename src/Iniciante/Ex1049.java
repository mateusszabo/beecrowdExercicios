package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex1049 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String vert = sc.nextLine();
        String reino = sc.nextLine();
        String alimento = sc.nextLine();

        if(vert.equals("vertebrado")){
            if(reino.equals("ave")){
                if(alimento.equals("carnivoro")){
                    System.out.println("aguia");
                }else{
                    System.out.println("pomba");
                }
            }else{
                if(alimento.equals("onivoro")){
                    System.out.println("homem");
                }else{
                    System.out.println("vaca");
                }
            }
        }else{
            if(reino.equals("inseto")){
                if(alimento.equals("hematofago")){
                    System.out.println("pulga");
                }else{
                    System.out.println("lagarta");
                }
            }else{
                if(alimento.equals("hematofago")){
                    System.out.println("sanguessuga");
                }else{
                    System.out.println("minhoca");
                }
            }
        }

        sc.close();
    }
}



