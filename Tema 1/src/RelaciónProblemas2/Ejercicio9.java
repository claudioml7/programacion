
//9. Realizar un programa que lea un número entero positivo y averigüe si es
//        perfecto. Un número es perfecto cuando es igual a la suma de sus divisores
//        excepto él mismo. Diseñar el programa de forma que si algún dato es
//        incorrecto vuelva a solicitarse.
//        Ejemplos:
//        El número 6 es perfecto porque es igual que 1+2+3=6
//        El número 8 no es perfecto porque 1+2+4=7


package RelaciónProblemas2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int resto;
        int sumatorio = 0;
        String cadenaDivisores = "";

        do {
            System.out.println("Introduzca un numero entero positivo");
            num = sc.nextInt();
        } while (num < 0);

        for (int i = 1; i < num; i++) {
            resto = num % i;

            if (resto == 0) {
                if (cadenaDivisores.isEmpty()) {
                    cadenaDivisores = cadenaDivisores.concat(i + "");

                } else {
                    cadenaDivisores = cadenaDivisores.concat(" + " + i);
                }
                sumatorio += i;
            }
        }
        cadenaDivisores = cadenaDivisores.concat(" = " + sumatorio);

        if (sumatorio == num) {
            System.out.println("El numero " + num + " es perfecto porque es igual que " + cadenaDivisores);
        } else {
            System.out.println("El numero " + num + " no es perfecto porque " + cadenaDivisores);
        }

    }
}
