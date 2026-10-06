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





