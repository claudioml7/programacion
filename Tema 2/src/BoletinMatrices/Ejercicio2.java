package BoletinMatrices;

//2. Crea un método que sume todas las posiciones de una matriz y devuelva dicho número.

public class Ejercicio2 {
    public static int sumaElementos(int[][] matriz) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma+=matriz[i][j];
            }
        }

        return suma;
    }

    static void main(String[] args) {
        int[][] matriz = {{1,2,3},{4,5,6}};
        System.out.println(sumaElementos(matriz));
    }
}