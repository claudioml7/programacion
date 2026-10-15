import java.util.Scanner;

public class Ej1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int numero = sc.nextInt();
        if (numero %2 == 0) {
            System.out.println("Tu número es par");
        }
        else{
            System.out.println("Tu número es impar");
        }
    }
}
