package BoletinArrays1;

//15. Criba de Eratóstenes: este método sirve para encontrar los números primos
//existentes sin tener que calcular sus divisores. El método es el siguiente:
//a. Comenzamos con el número 2. Tacharemos todos los múltiplos de 2 hasta
//llegar a n (siendo n el número máximo que queremos comprobar).
//b. Seguiremos con el siguiente número que no esté tachado, y repetiremos el
//punto a hasta que lleguemos a n.
//Crea un método que encuentre todos los números primos existentes hasta el
//número n, que introducirá el usuario por teclado. Para ello, usa un array y “tacha” las
//posiciones que no sean primas.

public class Ejercicio15 {
    public static boolean[] cribaEratostenes(int num) {
        boolean[] array = new boolean[num];

        for (int i = 2; i < num/2; i++) {
            if (!array[i]) {
                for (int j = i*2; j < num; j+=i) {
                    array[j] = true;
                }
            }
        }

        return array;
    }

    static void main(String[] args) {
        int num = MiEntradaSalida.leerEnteroPositivo("Introduce un numero");
        boolean[] array = cribaEratostenes(num);

        for (int i = 2; i < array.length; i++) {
            if (!array[i]) {
                System.out.print(i + " ");
            }
        }
    }
}