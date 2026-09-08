package Iniciante;
import java.io.IOException;
import java.util.Scanner;
public class Ex1072 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        int contadorIN = 0;
        int contadorOUT= 0;

        for(int i = 0; i < X ; i++){
            int valor = sc.nextInt();
            if(valor >= 10 && valor <=20){
                contadorIN++;
            }else{
                contadorOUT++;
            }
        }

        System.out.println(contadorIN + " in");
        System.out.println(contadorOUT + " out");

        sc.close();
    }
}