
//3. Realiza un programa que convierta números romanos a números en base decimal.
//        Las equivalencias son las siguientes:
//        M 1000
//        D 500
//        C 100
//        L 50
//        X 10
//        V 5
//        I 1
//        Los enteros romanos se escriben de acuerdo a las siguientes reglas:
//        Si una letra está seguida inmediatamente por una de igual o menor valor, su valor se
//        suma al total acumulado. Así, XX = 20, XV = 15 y VI = 6.
//        Si una letra está seguida inmediatamente por una de mayor valor, su valor se
//        sustrae del total acumulado. Así, IV = 4, XL = 40 y CM = 900.
//        Por tanto, la entrada MMXIX debe devolver 2019.


package RelaciónProblemas4;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroDecimal = 0;

        System.out.println("Introduce un numero romano");
        String numeroRomano = sc.nextLine();

        for (int i = 0; i < numeroRomano.length(); i++) {
            switch (numeroRomano.charAt(i)) {
                case 'M':
                    numeroDecimal += 1000;
                    break;
                case 'D':
                    if (i + 1 < numeroRomano.length() && numeroRomano.charAt(i + 1) == 'M') {
                        numeroDecimal -= 500;
                    } else {
                        numeroDecimal += 500;
                    }
                    break;
                case 'C':
                    if (i + 1 < numeroRomano.length() && (numeroRomano.charAt(i + 1) == 'M' || numeroRomano.charAt(i + 1) == 'D')) {
                        numeroDecimal -= 100;
                    } else {
                        numeroDecimal += 100;
                    }
                    break;
                case 'L':
                    if (i + 1 < numeroRomano.length() && (numeroRomano.charAt(i + 1) == 'M' || numeroRomano.charAt(i + 1) == 'D' || numeroRomano.charAt(i + 1) == 'C')) {
                        numeroDecimal -= 50;
                    } else {
                        numeroDecimal += 50;
                    }
                    break;
                case 'X':
                    if (i + 1 < numeroRomano.length() && (numeroRomano.charAt(i + 1) == 'M' || numeroRomano.charAt(i + 1) == 'D' || numeroRomano.charAt(i + 1) == 'C' || numeroRomano.charAt(i + 1) == 'L')) {
                        numeroDecimal -= 10;
                    } else {
                        numeroDecimal += 10;
                    }
                    break;
                case 'V':
                    if (i + 1 < numeroRomano.length() && (numeroRomano.charAt(i + 1) == 'M' || numeroRomano.charAt(i + 1) == 'D' || numeroRomano.charAt(i + 1) == 'C' || numeroRomano.charAt(i + 1) == 'L' || numeroRomano.charAt(i + 1) == 'X')) {
                        numeroDecimal -= 5;
                    } else {
                        numeroDecimal += 5;
                    }
                    break;
                case 'I':
                    if (i + 1 < numeroRomano.length() && (numeroRomano.charAt(i + 1) == 'M' || numeroRomano.charAt(i + 1) == 'D' || numeroRomano.charAt(i + 1) == 'C' || numeroRomano.charAt(i + 1) == 'L' || numeroRomano.charAt(i + 1) == 'X' || numeroRomano.charAt(i + 1) == 'V')) {
                        numeroDecimal -= 1;
                    } else {
                        numeroDecimal += 1;
                    }
                    break;
            }
        }

        System.out.println("El numero en romano es " + numeroDecimal);
    }
}
