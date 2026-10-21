
//6. Realizar un programa que lea dos números enteros cualesquiera numeroA
//        y numeroB, y calcule el producto los números mediante sumas, es decir,
//        sin usar el operador *.

package RelaciónProblemas2;

import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numeroA = sc.nextInt();
        System.out.println("Introduce otro numero");
        int numeroB = sc.nextInt();

        int suma = 0;

        for (int i = 0; i < numeroB; i++) {
            suma = suma + numeroA;
        }

        System.out.println(suma);
    }
}
