
//1. Realizar un programa que lea un número entero por teclado e informe de si
//        el número es par o impar (el cero se considera par).


package RelaciónProblemas1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");

        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
