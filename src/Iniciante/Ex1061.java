package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Ex1061 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        sc.next();
        int diaInicio = sc.nextInt();
        sc.nextLine();
        String[] horarioInicio = sc.nextLine().split(" : ");
        sc.next();
        int diaTermino = sc.nextInt();
        sc.nextLine();
        String[] horarioTermino = sc.nextLine().split(" : ");

        int horaInicio = Integer.parseInt(horarioInicio[0]);
        int minutoInicio = Integer.parseInt(horarioInicio[1]);
        int segundoInicio = Integer.parseInt(horarioInicio[2]);
        int horaTermino = Integer.parseInt(horarioTermino[0]);
        int minutoTermino = Integer.parseInt(horarioTermino[1]);
        int segundoTermino = Integer.parseInt(horarioTermino[2]);

        int duracaoDias = diaTermino - diaInicio;
        int duracaoMinuto = 0;
        int duracaoHora = 0;
        int duracaoSegundo = 0;

        if(segundoTermino < segundoInicio){
            duracaoSegundo = 60 - (segundoInicio - segundoTermino);
            minutoTermino = minutoTermino - 1;
        }else{
            duracaoSegundo = segundoTermino - segundoInicio;
        }
        if(minutoTermino < minutoInicio){
            duracaoMinuto = 60 - (minutoInicio - minutoTermino);
            horaTermino = horaTermino - 1;
        }else{
            duracaoMinuto = minutoTermino - minutoInicio;
        }

        if(horaTermino < horaInicio){
            duracaoHora = 24 - (horaInicio - horaTermino);
            duracaoDias = duracaoDias - 1;
        }else{
            duracaoHora = horaTermino - horaInicio;
        }

        System.out.println(duracaoDias + " dia(s)");
        System.out.println(duracaoHora + " hora(s)");
        System.out.println(duracaoMinuto + " minuto(s)");
        System.out.println(duracaoSegundo + " segundo(s)");

        sc.close();
    }
}