
//1. Realizar un programa que, dado un número introducido por el usuario, calcule su
//        número a la inversa. Es decir, dada la entrada: 123456, el programa debe devolver
//        654321. Para este programa, no se deben utilizar métodos de la clase String,
//        Integer, o arrays; sólo deben utilizarse operaciones matemáticas. Ten en cuenta solo
//        valores positivos.


package RelaciónProblemas4;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroInicial;
        int puente;
        int numeroFinal = 0;

        do {
            System.out.println("Introduce un numero positivo");
            numeroInicial = sc.nextInt();
        } while (numeroInicial < 0);

        while (numeroInicial != 0) {
            puente = numeroInicial % 10;
            numeroFinal = (numeroFinal * 10) + puente;
            numeroInicial = numeroInicial / 10;
        }

        System.out.println(numeroFinal);
    }
}
