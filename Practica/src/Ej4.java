import java.util.Scanner;

public class Ej4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();

        if (edad <= 12)
            System.out.println("Eres un niño");

        else if (edad <= 17)
            System.out.println("Eres un adolescente");

        else if (edad <=29)
            System.out.println("Eres un joven");

        else {
            System.out.println("Eres un adulto");
        }
    }
}
