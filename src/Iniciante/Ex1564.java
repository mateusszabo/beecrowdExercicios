package Iniciante;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;

public class Ex1564 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        while(sc.hasNextInt()){
            int N = sc.nextInt();

            if(N < 0){
                continue;
            }

            if(N == 0){
                pw.println("vai ter copa!");
            }else{
                pw.println("vai ter duas!");
            }
        }
        sc.close();
        pw.flush();
    }
}
