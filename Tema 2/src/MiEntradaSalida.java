import java.util.Scanner;

public class MiEntradaSalida {
        public static String leerCadena (String mensaje){
            Scanner sc = new Scanner(System.in);
            System.out.printf("%s: ", mensaje);
            return sc.nextLine();
        }

        public static int leerEntero (String mensaje){
            Scanner sc = new Scanner(System.in);
            System.out.printf("%s: ", mensaje);
            return Integer.parseInt(sc.nextLine());
        }

        public static int leerEnteroPositivo (String mensaje){
            Scanner sc = new Scanner(System.in);
            System.out.println(mensaje + ": ");
            int numeroLeidoPositivo;
            do {
                numeroLeidoPositivo = Integer.parseInt(sc.nextLine());
                if (numeroLeidoPositivo <= 0){
                    System.out.println("Introduce un número positivo");
                }
            }while (numeroLeidoPositivo <=0);
            return numeroLeidoPositivo;
        }

        static void main(String[] args) {
            /*String nombre = leerCadena("¿Cómo te llamas?");
            System.out.println("Hola " + nombre);*/

            /*int numero = leerEntero("Dime un número");
            System.out.println("Has introducido el " + numero);*/

            /*int numero = leerEnteroPositivo("Dime tu edad");
            System.out.println("Tienes " + numero + " años");*/
        }
}