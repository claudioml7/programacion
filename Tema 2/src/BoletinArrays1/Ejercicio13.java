package BoletinArrays1;

//13. Crea un programa que implemente una estructura de pila de números enteros. Una
//estructura de pila es aquella que permite almacenar elementos de la manera “último
//en entrar, primero en salir (LIFO - Last in first out)”. Crea un método main, donde
//hagas llamadas a un método apilar para añadir elementos y otro método desapilar
//para eliminarlos. Muestra el array tras cada una de las operaciones. La pila tendrá
//como máximo 10 números enteros. Ejemplo de utilización:
//pila original -> []
//apilar(3)
//pila -> [3]
//apilar(12)
//pila -> [3, 12]
//desapilar() //Nota que no indicamos qué debe desapilar, pues debe ser siempre el
//último elemento en entrar
//pila -> [3]
//desapilar()
//pila -> []
//desapilar()
//“No hay elementos en la pila”
//-----

/// / Imagina ahora el siguiente estado
//pila -> [3, 5, 8, 0, -1, 222, 9, 44, 3, 1]
//apilar(23)
//“La pila está llena, no puedo apilar el elemento”


public class Ejercicio13 {
    static int contador = 0;

    public static void apilar(int[] array) {
        if (contador == 10) {
            System.out.println("La pila está llena, no puedo apilar el elemento");
        } else {
            int num = MiEntradaSalida.leerEntero("Apilar");
            array[contador++] = num;
        }
    }

    public static void desapilar(int[] array) {
        if (contador == 0) {
            System.out.println("No hay elementos en la pila");
        } else {
            System.out.println("Desapilar:");
            array[contador--] = 0;
        }
    }

    static void main(String[] args) {
        int[] pila = new int[10];
        int opcion;

        opcion = MiEntradaSalida.leerEnteroEnRango("Elige una opción (1. Apilar / 2. Desapilar / 3. Salir)", 1, 3);
        while (opcion == 1 || opcion == 2) {
            switch (opcion) {
                case 1:
                    apilar(pila);
                    System.out.printf("Pila:");
                    for (int i = 0; i < contador; i++) {
                        System.out.print(" " + pila[i] + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    desapilar(pila);
                    System.out.printf("Pila:");
                    for (int i = 0; i < contador; i++) {
                        System.out.print(" " + pila[i] + " ");
                    }
                    System.out.println();
                    break;
            }
            opcion = MiEntradaSalida.leerEnteroEnRango("Elige una opción (1. Apilar / 2. Desapilar / 3. Salir)", 1, 3);
        }
    }
}
