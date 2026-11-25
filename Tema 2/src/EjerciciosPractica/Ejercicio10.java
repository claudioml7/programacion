package EjerciciosPractica;

// 10.Cuenta cuántos números del 1 al 100 son múltiplos de 3 y muestra el resultado al final.

public class Ejercicio10 {
    public static void main(String[] args) {
        int multiplos = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                multiplos ++;
            }
        }
        System.out.println(multiplos);
    }
}