
//4. Realizar un programa que lea un número estrictamente positivo N y
//        muestre la suma de los N primeros números. Diseña el programa de forma
//        que si N es incorrecto vuelva a solicitarse.
//        Ejemplo:
//        Introduce un número positivo: 4
//        La suma de los 4 primeros números es: 10


package RelaciónProblemas2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int suma = 0;

        do {
            System.out.println("Introduzca un numero positivo");
            num = sc.nextInt();
        } while (num < 0);

        for (int i = 0; i < num+1; i++) {
            suma = suma +i;
        }

        System.out.println("La suma de los " + num + " primeros numeros es " + suma);
    }
}
