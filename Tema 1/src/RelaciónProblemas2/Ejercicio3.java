package RelaciónProblemas2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        int num;

        do {
            System.out.println("Introduzca cuantos numeros vas a introducir (mayor de 0)");
            cantidad = sc.nextInt();
        } while (cantidad <= 0);

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduzca un numero");
            num = sc.nextInt();
            if (num%2 == 0) {
                System.out.println("El numero " + num + " es par");
            } else {
                System.out.println("El numero " + num + " es impar");
            }
        }
    }
}


