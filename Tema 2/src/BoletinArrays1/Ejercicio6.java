package BoletinArrays1;

//6. Crea un programa que compruebe si un array contiene un determinado valor. Para
//ello, puedes pedir por parámetros el tamaño del array, los elementos y luego el
//elemento a buscar, o puedes generar el array aleatorio y pedir únicamente el
//elemento a buscar.

public class Ejercicio6 {
    public static int buscarElemento(int[] unArray, int elemento) {
        for (int i = 0; i < unArray.length; i++) {
            if (unArray[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    //NOSOTROS METEMOS EL ARRAY
    static void main(String[] args) {
        int tamano = MiEntradaSalida.leerEntero("Introduce el tamaño del array");
        int[] miArray = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            miArray[i] = MiEntradaSalida.leerEntero("Introduce el elemento " + (i+1));
        }

        int elementoBuscar = MiEntradaSalida.leerEntero("Introduce el elemento que desea buscar en el array");

        if ((buscarElemento(miArray, elementoBuscar)) == -1) {
            System.out.println("Ese elemento no se encuentra en el array");
        } else {
            System.out.printf("El elemento %d se encuentra en la posicion %d del array", elementoBuscar, buscarElemento(miArray, elementoBuscar));
        }
    }

    /*
    //CREAMOS EL ARRAY RANDOM
    static void main(String[] args) {
        int tamano = MiEntradaSalida.leerEntero("Introduce el tamaño del array");
        int[] miArray = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            miArray[i] = (int) (Math.random() * tamano);
        }

        int elementoBuscar = MiEntradaSalida.leerEntero("Introduce el elemento que desea buscar en el array");

        if ((buscarElemento(miArray, elementoBuscar)) == -1) {
            System.out.println("Ese elemento no se encuentra en el array");
        } else {
            System.out.printf("El elemento %d se encuentra en la posicion %d del array", elementoBuscar, buscarElemento(miArray, elementoBuscar));
        }

    }*/
}