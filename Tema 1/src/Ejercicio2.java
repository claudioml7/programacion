import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num1 = sc.nextInt();

        System.out.println("Introduce otro número");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Son iguales");
        } else if (num1 > num2) {
            System.out.println("El número 1 es mayor que el número 2");
        } else
            System.out.println("El número 2 es mayor que el número 1");
    }
}

