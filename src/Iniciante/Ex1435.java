package Iniciante;
import java.util.Scanner;

public class Ex1435 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int N = sc.nextInt();
            if(N == 0){
                break;
            }
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    int distTopo = i;
                    int distBase = (N - 1) - i;
                    int distEsq = j;
                    int distDir = (N - 1) - j;

                    int valor = Math.min(Math.min(distTopo, distBase), Math.min(distDir,distEsq));

                    if(j == 0){
                        System.out.printf("%3d", valor);
                    }else{
                        System.out.printf(" %3d", valor);

                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
//import java.io.BufferedWriter;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
//
//        while(true){
//            int N = sc.nextInt();
//            if(N == 0){
//                break;
//            }
//            for(int i = 0; i < N; i++){
//                for(int j = 0; j < N; j++){
//                    int distTopo = i;
//                    int distBase = (N - 1) - i;
//                    int distEsq = j;
//                    int distDir = (N - 1) - j;
//
//                    int valor = 1 + Math.min(Math.min(distTopo, distBase), Math.min(distDir,distEsq));
//
//                    if(j == 0){
//                        pw.printf("%3d", valor);
//                    }else{
//                        pw.printf(" %3d", valor);
//
//                    }
//                }
//                pw.println();
//            }
//            pw.println();
//        }
//
//        pw.flush();
//    }
//}