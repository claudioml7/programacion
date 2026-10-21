
//10.Realizar un programa que solicite un número entero positivo o cero y
//        calcule su factorial. Diseñar el programa de forma que si algún dato es
//        incorrecto vuelva a solicitarse.
//        Factorial (0)=1
//        Factorial (1)=1
//        Factorial (N)=N* (N-1)* (N-2)* …......1

package RelaciónProblemas2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int factorial = 1;

        do {
            System.out.println("Introduce un numero positivo");
            num = sc.nextInt();
        } while (num < 0);

        for (int i = num; i > 1; i--) {
            factorial = factorial * i;
        }

        System.out.printf("Factorial (%d) = %d", num, factorial);
    }
}
