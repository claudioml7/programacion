import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        int vueltas;
        double tiempoObjetivo;
        double tiempoVuelta;

        System.out.println("Introduce el nombre del piloto");
        nombre = sc.nextLine();

        do {
            System.out.println("Introduce un número de vueltas entre 3 y 10");
            vueltas = sc.nextInt();
        } while (vueltas <= 2 || vueltas >= 11);

        do {
            System.out.println("Introduzca el tiempo objetivo por vuelta en segundos)");
            tiempoObjetivo = sc.nextDouble();
        } while (tiempoObjetivo <= 0);

        do {
            System.out.println("Indica el tiempo por vuelta");
            tiempoVuelta = sc.nextDouble();
        } while (tiempoVuelta <= 0);

        if (tiempoVuelta<tiempoObjetivo);
        System.out.println("Objetivo mejorado");

        if (tiempoVuelta>tiempoObjetivo)
        System.out.println("Por encima del objetivo");

        else {
            System.out.println("Objetivo igualado");
        }
    }
}
