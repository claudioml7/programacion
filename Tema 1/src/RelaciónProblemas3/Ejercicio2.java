
//2. Realizar un programa que solicite dos números, base y exponente, enteros
//        positivos (incluido el 0), y que calcule la potencia (base elevado a
//        exponente) a través de productos. Si los datos son incorrectos deberán
//        volverse a solicitar.


package RelaciónProblemas3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base;
        int exponente;
        int potencia = 1;

        do {
            System.out.println("Introduce una base");
            base = sc.nextInt();
        } while (base < 0);

        do {
            System.out.println("Introduce un exponente");
            exponente = sc.nextInt();
        } while (exponente < 0);

        for (int i = 0; i < exponente; i++) {
            potencia *= base;
        }

        System.out.println(potencia);
    }
}
