package RelaciónProblemas1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el producto");
        char producto = sc.nextLine().charAt(0);

        System.out.println("Introduzca el precio");
        double precio = sc.nextDouble();

        if (producto == 'A' || producto == 'a') {
            System.out.println("Se aplicará un 7% de descuento y el precio de " + precio + " pasará a costar " + (precio - (precio * 7) / 100));

        } else if (producto == 'C' || producto == 'c' || precio < 500) {
                System.out.println("Se aplicará un 12% de descuento y el precio de " + precio + " pasará a costar " + (precio - (precio * 12) / 100));

            } else {
                    System.out.println("Se aplicará un 9% de descuento y el precio de " + precio + " pasará a costar " + (precio - (precio * 9) / 100));
                }
            }
        }

