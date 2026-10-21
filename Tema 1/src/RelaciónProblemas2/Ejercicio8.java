
//8. Realizar un programa que solicite un conjunto de números. Después de
//        introducir cada número se realizará la pregunta: "¿Desea introducir más
//        números (S/N)". Si la respuesta es 'S' se solicitará otro número. Cuando no
//        desee introducir más números debe informar cual es el menor de los
//        números introducidos.
//        NOTA: Debe comprobarse que la respuesta es 'S' o 'N' y si no lo es, volver
//        a pedirla.


package RelaciónProblemas2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char seguir = 'S';
        int num;
        int menor = Integer.MAX_VALUE;

        while (seguir == 'S') {
            System.out.println("Introduce un numero");
            num = sc.nextInt();

            if (menor > num) {
                menor = num;
            }

            do {
                System.out.println("¿Desea introducir más números (S/N)");
                sc.nextLine();
                seguir = sc.nextLine().toUpperCase().charAt(0);
            } while (seguir != 'S' && seguir != 'N');
        }

        System.out.println("El numero menor es " + menor);
    }
}
