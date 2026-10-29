package BoletinArrays1;

public class Ejercicio1 {
    //1. Crea un programa que sume todas las posiciones pares de un array de enteros.

    public static void main(String[] args) {
        int[] miArrayDeEnteros = {0, 1, 2, 3, 4, 5};
        int resultado = sumaPosicionesPares(miArrayDeEnteros);
        System.out.println("La suma es: " + resultado);
    }

    public static int sumaPosicionesPares(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                suma = suma + array[i];
            }
        }
        return suma;
    }
}
