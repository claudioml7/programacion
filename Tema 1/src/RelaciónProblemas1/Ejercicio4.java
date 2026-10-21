
//4. Realizar un programa que lea la edad de una persona menor a 100 años e
//        informe de si es un niño (0-12 años), un adolescente (13-17), un joven (18-
//        29) o un adulto.

package RelaciónProblemas1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad");

        int num1 = sc.nextInt();
        if (num1 <= 12) {
            System.out.println("Eres un niño");
        } else if (num1 <= 17) {
            System.out.println("Eres un adolescente");
        } else if (num1 <= 29) {
            System.out.println("Eres un joven");
        } else {
            System.out.println("Eres un adulto");
        }
    }
}
