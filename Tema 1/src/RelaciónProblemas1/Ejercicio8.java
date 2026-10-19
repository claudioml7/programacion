package RelaciónProblemas1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la hora");
        int hora1 = sc.nextInt();

        System.out.println("Introduzca los minutos");
        int minuto1 = sc.nextInt();

        System.out.println("Introduzca los segundos");
        int segundo1 = sc.nextInt();

        int horatotal1 = segundo1 + (minuto1 * 60) + (hora1 * 3600);

        System.out.println("Introduzca una hora");
        int hora2 = sc.nextInt();

        System.out.println("Introduzca los minutos");
        int minuto2 = sc.nextInt();

        System.out.println("Introduzca los segundos");
        int segundo2 = sc.nextInt();

        int horatotal2 = segundo2 + (minuto2 * 60) + (hora2 * 3600);

        if (horatotal1 > horatotal2)
            System.out.println("La hora 1 es mayor");

        if (horatotal2 > horatotal1)
            System.out.println("La hora 2 es mayor");
    }
}
