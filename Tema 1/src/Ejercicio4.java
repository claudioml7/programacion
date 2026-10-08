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
