
//9. Realizar un programa que muestre todas las tablas de multiplicar (del 1 al
//        10).
//Tabla del 0
//        0 x 0=0
//        ….
//        0x10=10
//Tabla del 1
//        1 x 0=0
//        ….
//        1x10=10

package RelaciónProblemas3;

public class Ejercicio9 {
    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 0; j < 11; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }
    }
}
