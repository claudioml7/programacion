
//9. En un establecimiento en rebajas, hay 3 tipos de productos (A, B y C). El
//        porcentaje de rebaja que se aplicará sobre el precio original del producto se
//        calcula de la siguiente forma:
//         Si el producto es de tipo A, independientemente de su precio se
//        aplica un 7% de descuento.
//         Si el producto es de tipo C o bien el precio es inferior a 500€ se
//        aplicará un porcentaje del 12% de descuento.
//         En el resto de casos se aplica un 9% de descuento.
//        Realizar un programa que solicite los datos necesarios (tipo de producto y
//        precio original) y calcule el precio rebajado. Debe comprobarse que los
//        datos de entrada son correctos, y si no lo son mostrar un mensaje de error.


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

