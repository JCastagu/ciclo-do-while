import java.util.Scanner;

public class Ejemplo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPagar = 0;
        int continuar;

        do {
            System.out.print("Ingresa el precio del producto: $");
            double precio = scanner.nextDouble();

            totalPagar = totalPagar + precio;

            System.out.print("¿Deseas agregar otro producto? (1 = Sí / 0 = No): ");
            continuar = scanner.nextInt();

        } while (continuar == 1);

        System.out.println("\nTotal a pagar por la compra: $" + totalPagar);
    }
}