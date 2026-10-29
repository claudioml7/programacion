import java.util.Locale;
import java.util.Scanner;

public class MiEntradaSalida {
    static Scanner sc = new Scanner(System.in);

    public static String leerCadena(String mensaje) {
        System.out.printf("%s: ", mensaje);
        return sc.nextLine();
    }

    public static int leerEntero(String mensaje) {
        System.out.printf("%s: ", mensaje);
        return Integer.parseInt(sc.nextLine());
    }

    public static int leerEnteroPositivo(String mensaje) {
        System.out.println(mensaje + ": ");
        int numeroLeidoPositivo;
        do {
            numeroLeidoPositivo = Integer.parseInt(sc.nextLine());
            if (numeroLeidoPositivo <= 0) {
                System.out.println("Introduce un número positivo");
            }
        } while (numeroLeidoPositivo <= 0);
        return numeroLeidoPositivo;
    }

    public static double leerDouble(String mensaje) {
        System.out.printf("%s: ", mensaje);
        return Double.parseDouble(sc.nextLine());
    }

    public static int leerEnteroEnRango(String mensaje, int min, int max) {
        System.out.println(mensaje + ": ");
        int numeroEnteroEnRango;
        do {
            numeroEnteroEnRango = Integer.parseInt(sc.nextLine());
            if (numeroEnteroEnRango < min) {
                System.out.println("Introduce un número mayor");
            }
            if (numeroEnteroEnRango > max) {
                System.out.println("Introduce un número menor");
            }
        } while (numeroEnteroEnRango < min || numeroEnteroEnRango > max);
        return numeroEnteroEnRango;
    }

    public static char leerChar(String mensaje) {
        System.out.printf("%s: ", mensaje);
        return sc.nextLine().charAt(0);
    }

    public static char leerSiNo(String mensaje) {
        char caracterLeido;
        System.out.printf("%s: ", mensaje);
        do {
            caracterLeido = sc.nextLine().toUpperCase().charAt(0);
            if (caracterLeido != 'S' && caracterLeido != 'N') {
                System.out.printf("%s (S o N): ", mensaje);
            }
        } while (caracterLeido != 'S' && caracterLeido != 'N');
        return caracterLeido;
    }

    public static void main(String[] args) {
            /*String nombre = leerCadena("¿Cómo te llamas?");
            System.out.println("Hola " + nombre);*/

            /*int numero = leerEntero("Dime un número");
            System.out.println("Has introducido el " + numero);*/

            /*int numero = leerEnteroPositivo("Dime tu edad");
            System.out.println("Tienes " + numero + " años");*/

            /*double numero = leerDouble("Dime un número decimal");
            System.out.println("Has introducido el " + numero);*/

            /*int min = 2;
            int max = 10;
            int numero = leerEnteroEnRango("Dime un número entre el máximo y el mínimo" , min, max);
            System.out.println("Has introducido el " + numero);*/

            /*char caracter = leerChar("Introduce un carácter");
            System.out.println("Has introducido " + caracter);*/

          char caracter = leerChar("Introduce S o N");
            System.out.println("Has introducido " + caracter);

    }
}