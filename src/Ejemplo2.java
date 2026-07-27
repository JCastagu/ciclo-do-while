import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clave;

        do {
            System.out.print("Escribe la clave secreta (es 1234): ");
            clave = scanner.nextInt();
        } while (clave != 1234);

        System.out.println("¡Clave correcta! Bienvenido.");
    }
}
