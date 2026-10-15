import java.util.Scanner;

public class Ej2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int numero1 = sc.nextInt();

        System.out.println("Introduzca otro número");
        int numero2 = sc.nextInt();

        if (numero1 == numero2){
            System.out.println("Los números son iguales");
        }

        if (numero1 > numero2){
            System.out.println("El número 1 es mayor");
        }

        if (numero1 < numero2){
            System.out.println("El número 2 es mayor");
        }

    }
}
