
//8. Realizar un programa que calcule las soluciones de una ecuación de
//segundo grado. Deben pedirse los tres coeficientes A, B, C e informar de si
//la ecuación tiene dos soluciones, una solución, o ninguna solución.
//A*x2+ B*x+C= 0


package RelaciónProblemas3;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double varA;
        double varB;
        double varC;

        System.out.println("Introduce el número A");
        varA = sc.nextDouble();

        System.out.println("Introduce el número B");
        varB = sc.nextDouble();

        System.out.println("Introduce el número C");
        varC = sc.nextDouble();

    }
}
