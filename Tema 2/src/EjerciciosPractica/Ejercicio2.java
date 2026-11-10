package EjerciciosPractica;

// 2. Imprime solo los pares del 1 al 50//

public class Ejercicio2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
