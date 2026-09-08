package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex1052 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int mes = sc.nextInt();

        switch(mes){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
        sc.close();
    }
}

//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//
//        int mes = sc.nextInt();
//
//        // Criamos um array com os meses.
//        // O índice 0 fica em branco ("") porque os meses vão de 1 a 12,
//        // mas as posições do array no Java começam em 0.
//        String[] nomesDosMeses = {
//            "", "January", "February", "March", "April", "May", "June",
//            "July", "August", "September", "October", "November", "December"
//        };
//
//        // Imprime direto a posição correspondente ao número digitado
//        System.out.println(nomesDosMeses[mes]);
//
//        sc.close();
//    }
//}