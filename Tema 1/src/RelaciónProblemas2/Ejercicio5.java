
//5. Realizar un programa que solicite números hasta que se introduzca un
//        número negativo. Cuando termine informará de cuantos números positivos
//        se han introducido. En este programa el número 0 se considera positivo.
//        Ejemplo:
//        Introduce un número (negativo para terminar): 4
//        Introduce un número (negativo para terminar): 8
//        Introduce un número (negativo para terminar): -2
//        Has introducido 2 números positivos


package RelaciónProblemas2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int contador = 0;

        do {
            System.out.println("Introduce un numero (negativo para terminar):");
            num = sc.nextInt();
            contador++;
        } while (num >= 0);

        System.out.println("Has introducido " + (contador-1) + " numeros positivos");
    }
}
