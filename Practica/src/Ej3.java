import java.util.Scanner;

public class Ej3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es múltiplo de 2");
        }

        if (numero % 3 == 0) {
            System.out.println("El número es múltiplo de 3");
        }
    }
}
