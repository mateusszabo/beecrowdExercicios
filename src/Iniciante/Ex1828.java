package Iniciante;
import java.util.Scanner;

public class Ex1828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            // Lemos as palavras fornecidas pelo Beecrowd como texto
            String sheldon = sc.next();
            String raj = sc.next();

            if (sheldon.equals(raj)) {
                System.out.println("Caso #" + i + ": De novo!");
            }
            else if (
                    (sheldon.equals("tesoura") && raj.equals("papel")) ||
                            (sheldon.equals("papel") && raj.equals("pedra")) ||
                            (sheldon.equals("pedra") && raj.equals("lagarto")) ||
                            (sheldon.equals("lagarto") && raj.equals("Spock")) ||
                            (sheldon.equals("Spock") && raj.equals("tesoura")) ||
                            (sheldon.equals("tesoura") && raj.equals("lagarto")) ||
                            (sheldon.equals("lagarto") && raj.equals("papel")) ||
                            (sheldon.equals("papel") && raj.equals("Spock")) ||
                            (sheldon.equals("Spock") && raj.equals("pedra")) ||
                            (sheldon.equals("pedra") && raj.equals("tesoura"))
            ) {
                System.out.println("Caso #" + i + ": Bazinga!");
            }
            else {
                System.out.println("Caso #" + i + ": Raj trapaceou!");
            }
        }

        sc.close();
    }
}