
//2. Realizar un programa que lea un número entero entre 0 y 10 y visualice su
//        tabla de multiplicar.
//        Por ejemplo si el numero es 7 debe aparecer
//        Tabla del 7
//        7*0=0
//        7*1=7
//        …..
//        7*10=70


package RelaciónProblemas2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;

        do {
            System.out.println("Introduzca un número del 1 al 10");
            num = sc.nextInt();
        } while(num<0 || num>10);


        for (int i = 0; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + num*i);

        }
    }
}

