package BoletinArrays1;

//8. Crea un método que devuelva la posición que ocupa un valor dentro de un array, o
//-1 si el array no contiene ese valor

public class Ejercicio8 {
    public static int buscarElemento(int[] unArray, int elemento) {
        for (int i = 0; i < unArray.length; i++) {
            if (unArray[i] == elemento) {
                return i;
            }
        }
        return -1;
    }
}