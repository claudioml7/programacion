package BoletinArrays1;

//5. Crea un método, que acepte un parámetro “tamaño” de tipo entero, que genere un
//array de “tamaño” posiciones de números aleatorios de 0 a 1000 y lo muestre por
//pantalla

public class Ejercicio5 {
    public static int[] numerosAleatorios (int tamano) {
        int[] array = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            array[i] = (int)(Math.random() * 1000);
        }
        return array;
    }

    static void main(String[] args) {
        int tamano = MiEntradaSalida.leerEntero("Introduce el tamaño del array");
        int[] miArray = numerosAleatorios(tamano);
        for (int i = 0; i < tamano; i++) {
            System.out.println(miArray[i]);
        }
    }
}