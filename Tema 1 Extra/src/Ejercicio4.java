import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String PASSWORD = "contraseña";

        String pass = "";

        do {
            System.out.println("Introduce una contraseña");
            pass = sc.nextLine();
            if (!pass.equals(PASSWORD)){
                System.out.println("Contraseña incorrecta");
            }
        } while (!pass.equals(PASSWORD));
    }
}