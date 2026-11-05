package BoletinArrays1;

//7. Crea un método contieneElemento, que acepte un array de enteros y un entero a
//buscar, que realice la misma operación que el ejercicio anterior, y devuelva un valor
//booleano que indique si el array contiene el elemento o no

public class Ejercicio7 {
    public static boolean contieneElemento(int[] unArray, int elemento) {
        for (int i = 0; i < unArray.length; i++) {
            if (unArray[i] == elemento) {
                return true;
            }
        }
        return false;
    }
}