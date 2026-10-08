import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int num =  sc.nextInt();
        int i = 2;
        boolean encontrado = false;

        while (!encontrado){
            if (num%i == 0) {
                encontrado = true;
            }
            i++;
        }
        System.out.printf("El primer divisor de %d es %d", num, i-1);
    }
}