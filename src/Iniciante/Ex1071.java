package Iniciante;
import java.io.IOException;
import java.util.Scanner;
public class Ex1071 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int valorX = sc.nextInt();
        int valorY = sc.nextInt();

        int soma = 0;

        if(valorX > valorY){
            if(valorY % 2 != 0){
                valorY = valorY + 1;
            }
            for(int i=valorY; i < valorX; i++){
                if(i % 2 != 0){
                    soma+=i;
                }
            }
        }else if(valorY > valorX){
            valorX = valorX + 1;
            for(int i=valorX; i < valorY; i++){
                if(i % 2 != 0){
                    soma+=i;
                }
            }
        }else{
            soma = 0;
        }

        System.out.println(soma);

        sc.close();
    }
}