import java.util.Scanner;

public class Ej5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int num1 = sc.nextInt();

        System.out.println("Introduce otro número");
        int num2 = sc.nextInt();

        System.out.println("Introduce otro número");
        int num3 = sc.nextInt();

        System.out.println("Introduce otro número");
        int num4 = sc.nextInt();

        double media = (num1 + num2 + num3 + num4) / 4.0;
        System.out.println("La media es " + media);

        if (num1 > media) {
            System.out.println("El número " + num1 + " es mayor de la media");
        }

        if (num2 > media) {
            System.out.println("El número " + num2 + " es mayor de la media");
        }

        if (num3 > media) {
            System.out.println("El número " + num3 + " es mayor de la media");
        }

        if (num4 > media) {
            System.out.println("El número " + num4 + " es mayor de la media");
        }
    }
}
