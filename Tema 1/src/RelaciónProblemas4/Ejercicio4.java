
//4. Realiza un programa que pregunte al usuario la hora actual (hora, minutos y
//        segundos), y luego pregunte otra hora que deberá sumar a la primera, teniendo en
//        cuenta el cambio de día.
//        Los siguientes son salidas esperadas para las entradas:
//        Introduce la hora base: 13
//        Introduce los minutos base: 27
//        Introduce los segundos base: 10
//        ¿Cuántas horas quieres sumar?: 1
//        ¿Cuántos minutos quieres sumar?: 0
//        ¿Cuántos segundos quieres sumar?: 55
//        La hora resultante es: 14:28:05
//        Introduce la hora base: 19
//        Introduce los minutos base: 0
//        Introduce los segundos base: 0
//        ¿Cuántas horas quieres sumar?: 5
//        ¿Cuántos minutos quieres sumar?: 0
//        ¿Cuántos segundos quieres sumar?: 0
//        La hora resultante es: 00:00:00 (del día siguiente)

package RelaciónProblemas4;

import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una hora base");
        int hora = sc.nextInt();
        System.out.println("Introduzca los minutos base");
        int minuto = sc.nextInt();
        System.out.println("Introduzca los segundos base");
        int segundo = sc.nextInt();

        System.out.println("Introduzca las horas que quiera sumar");
        int hora2 = sc.nextInt();
        System.out.println("Introduzca los minutos que quiera añadir");
        int minuto2 = sc.nextInt();
        System.out.println("Introduzca los segundos que quiera añadir");
        int segundo2 = sc.nextInt();


    }
}
