package Iniciante;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;

public class Ex1534 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        while(sc.hasNextInt()){
            int N = sc.nextInt();
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++) {
                    int valor;
                    if(i == j && i + j == N - 1){
                        valor = 2;
                    }else if(i == j){
                        valor = 1;
                    }else if(i + j == N - 1){
                        valor = 2;
                    }else{
                        valor = 3;
                    }
                    pw.print(valor);
                }
                pw.println();
            }
        }
        sc.close();
        pw.flush();
    }
}
