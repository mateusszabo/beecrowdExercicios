package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1097 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        for(double i = 0; i<=2; i+=0.2){
            for(int j=0; j <= 3; j++){
                System.out.println("I=" + i + " J=" + (j+i));
            }
        }

        sc.close();
    }
}

//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        for (int i = 0; i <= 20; i += 2) {
//            for (int j = 1; j <= 3; j++) {
//                if (i % 10 == 0) {
//                    System.out.println("I=" + (i / 10) + " J=" + (j + (i / 10)));
//                } else {
//                    System.out.println("I=" + (i / 10.0) + " J=" + (j + (i / 10.0)));
//                }
//            }
//        }
//    }
//}