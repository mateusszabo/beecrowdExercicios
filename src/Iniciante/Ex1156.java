package Iniciante;
import java.io.IOException;

public class Ex1156 {

    public static void main(String[] args) throws IOException {
        double S = 1;
        int multiplicador = 2;

        for(int i = 3; i <= 39; i+=2){
            S += (double) i / multiplicador;
            multiplicador *= 2;
        }
        System.out.printf("%.2f\n", S);
    }
}