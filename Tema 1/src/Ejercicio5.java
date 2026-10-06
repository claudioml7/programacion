import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 4 números");


        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int media = (num1 + num2 + num3 + num4) / 4;
        System.out.println("La media es " + media);
    }
}
