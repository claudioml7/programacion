
//7. Realizar un programa que solicite dos números enteros mayores que 0, que
//calcule el máximo común divisor entre ellos mediante el algoritmo de
//Euclides y que muestre por pantalla el resultado.
//El algoritmo de Euclides se explica a continuación con un ejemplo:
//Supongamos que queremos calcular el m.c.d de 120 y 54
//        120 : 54 = 2 y resto 12
//        54 : 12 = 4 y resto 6
//        12: 6 = 2 y resto 0
//El m.c.d. de 120 y 54 es 6

package RelaciónProblemas3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int resto;

        System.out.println("Escribe un número mayor que 0");
        num1 = sc.nextInt();

        System.out.println("Escribe otro número");
        num2 = sc.nextInt();


        do {
            resto = num1 % num2;
            resto = num2 % resto;
        } while (resto == 0);

        System.out.println("El MCD de " + num1 + " y de " + num2 + " es igual a " + resto);

    }
}
