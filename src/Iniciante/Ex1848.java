package Iniciante;
import java.util.Scanner;

public class Ex1848 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int contador = 0;

        while(contador < 3 && sc.hasNextLine()){
            String linha = sc.nextLine().trim();

            if(linha.equals("caw caw")){
                System.out.println(soma);
                contador++;
                soma = 0;
            }else{
                String binario = linha.replace("-","0").replace("*", "1");
                soma += Integer.parseInt(binario, 2);
            }
        }
        sc.close();
    }
}