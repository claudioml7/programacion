package BoletinMatrices;

//3. Crea un método que reciba una matriz e imprima, en una sola línea, los elementos de la
//misma, leídos por filas:
//1 3 5 --> La salida es: 1 3 5 0 2 7
//0 2 7

public class Ejercicio3 {
    public static void matrizALinea(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }

    static void main(String[] args) {
        int[][] matriz = {{1,2,3},{4,5,6}};
        matrizALinea(matriz);
    }
}