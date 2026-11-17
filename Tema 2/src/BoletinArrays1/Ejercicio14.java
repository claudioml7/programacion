package BoletinArrays1;

//14. Crea un programa que implemente una estructura de cola de números enteros. Una
//estructura de cola es aquella que permite almacenar elementos de la manera
//“primero en entrar, primero en salir (FIFO - First in first out)”. Crea un método main,
//donde hagas llamadas a un método encolar para añadir elementos y otro método
//desencolar para eliminarlos. Muestra el array tras cada una de las operaciones. La
//cola tendrá como máximo 10 números enteros. Ejemplo de utilización:
//cola original -> []
//encolar(3)
//cola -> [3]
//encolar(12)
//cola -> [3, 12]
//desencolar() //Nota que no indicamos qué debe desencolar, pues debe ser siempre
//el primer elemento en entrar
//cola -> [12]
//desencolar()
//cola -> []
//desencolar()
//“No hay elementos en la cola”
//-----

/// / Imagina ahora el siguiente estado
//cola -> [3, 5, 8, 0, -1, 222, 9, 44, 3, 1]
//encolar(23)
//“La cola está llena, no puedo encolar el elemento”

public class Ejercicio14 {
    static int contador = 0;
    static int primerElemento = 0;

    public static void encolar(int[] array) {
        if (contador == 10) {
            System.out.println("La cola está llena, no puedo encolar el elemento");
        } else {
            int num = MiEntradaSalida.leerEntero("Encolar");

            int posicion = (primerElemento + contador) % array.length;
            array[posicion] = num;

            contador++;
        }
    }

    public static void desencolar(int[] array) {
        if (contador == 0) {
            System.out.println("No hay elementos en la cola");
        } else {
            System.out.println("Desencolar:");

            primerElemento = (primerElemento + 1) % array.length;

            contador--;
        }
    }

//    public static void encolar(int[] array) {
//        if (contador == 10) {
//            System.out.println("La cola está llena, no puedo encolar el elemento");
//        } else {
//            int num = MiEntradaSalida.leerEntero("Encolar");
//            array[contador++] = num;
//        }
//    }
//
//    public static void desencolar(int[] array) {
//        if (contador == 0) {
//            System.out.println("No hay elementos en la cola");
//        } else {
//            System.out.println("Desencolar:");
//            for (int i = 0; i < contador-1; i++) {
//                array[i] = array[i+1];
//            }
//            contador--;
//        }
//    }

    static void main(String[] args) {
        int[] cola = new int[10];
        int opcion;

        opcion = MiEntradaSalida.leerEnteroEnRango("Elige una opción (1. Encolar / 2. Desencolar / 3. Salir)", 1, 3);
        while (opcion == 1 || opcion == 2) {
            switch (opcion) {
                case 1:
                    encolar(cola);
                    break;
                case 2:
                    desencolar(cola);
                    break;
            }

            System.out.print("Cola:");
            for (int i = 0; i < contador; i++) {
                System.out.print(" " + cola[(primerElemento+i)%cola.length] + " ");
            }
            System.out.println();

            opcion = MiEntradaSalida.leerEnteroEnRango("Elige una opción (1. Encolar / 2. Desencolar / 3. Salir)", 1, 3);
        }
    }
}
