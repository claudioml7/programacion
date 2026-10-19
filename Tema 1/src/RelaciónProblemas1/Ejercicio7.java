package RelaciónProblemas1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su estado civil");
        char estado = sc.nextLine().charAt(0);

        System.out.println("Introduzca su edad");
        int edad = sc.nextInt();

        if (edad >= 50) {
            System.out.println("Tienes un 8,5 %");

        } else if (estado == 'S' && edad < 35 || estado == 'D' && edad < 35){
            System.out.println("Tienes un 12 %");

        } else if (estado == 'V' && edad < 35 || estado =='C' && edad < 35){
            System.out.println("Tienes un 11.3 %");

        } else {
            System.out.println("Tienes un 10.5 %");
        }
    }
}

