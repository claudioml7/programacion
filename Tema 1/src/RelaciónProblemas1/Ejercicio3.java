
//3. Realizar un programa que lea un número por teclado. El programa debe
//        imprimir en pantalla un mensaje con “El número xx es múltiplo de 2” o un
//        mensaje con “El número xx es múltiplo de 3”. Si es múltiplo de 2 y de 3
//        deben aparecer los dos mensajes. Si no es múltiplo de ninguno de los dos
//        el programa finaliza sin mostrar ningún mensaje.

package RelaciónProblemas1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");

        int num1 = sc.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("Es múltiplo de 2");
        }
        if (num1 % 3 == 0) {
            System.out.println("Es múltiplo de 3");
        }
    }
}





