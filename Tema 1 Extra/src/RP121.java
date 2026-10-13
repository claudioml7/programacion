import java.util.Scanner;

public class RP121 {
    public static void main(String[] args) {


        for (int numeros = 1; numeros <=100; numeros++){
            if (numeros % 7 == 0) {
                System.out.printf("El número %d es múltiplo de 7 %n", numeros);
            }
            if (numeros % 13 == 0) {
                System.out.printf("El número %d es múltiplo de 13 %n", numeros);
            }
        }
    }
}
