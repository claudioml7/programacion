
//7. Realizar un programa que solicite una cantidad de números que van a
//        pedirse por teclado. Una vez que solicite todos ellos debe informar de cual
//        es la media de los números. Diseñar el programa de forma que si la
//        cantidad es incorrecta vuelva a solicitarse.


package RelaciónProblemas2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int contador = 0;
        int media = 0;

        do {
            System.out.println("Introduce numeros para hacer la media (negativo para terminar):");
            num = sc.nextInt();
            media += num;
            contador++;
        } while (num >= 0);

        System.out.println("La media de los numeros es " + (((double)media-num)/(contador-1)));
    }
}
