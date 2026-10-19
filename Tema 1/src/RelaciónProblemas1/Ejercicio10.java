package RelaciónProblemas1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un carácter");
        char caracter = sc.nextLine().charAt(0);

        System.out.println("Introduce un número");
        int num1 = sc.nextInt();

        System.out.println("Introduce otro número");
        int num2 = sc.nextInt();

        switch (caracter){
            case '+':
                System.out.println("La suma es " + (num1+num2));
                break;
            case '-':
                System.out.println("La resta es " + (num1-num2));
                break;
            case '*':
                System.out.println("La multiplicación es " + num1*num2);
                break;
            case '/':
                System.out.println("La división es " + num1/num2);
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
