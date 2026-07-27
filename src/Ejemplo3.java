import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;

        do {
            System.out.print("Ingresa un número para sumar (0 para terminar y sumar): ");
            numero = scanner.nextInt();
            suma = suma + numero;
        } while (numero != 0);

        System.out.println("La suma total es: " + suma);
    }
}