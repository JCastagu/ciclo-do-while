import javax.swing.*;

public class Ejemplo5 {
    public static void main(String[] args){
        int respuesta;

        do {
            JOptionPane.showMessageDialog(null, "¡Hola! Espero estés aprendiendo mucho.");

            String entrada = JOptionPane.showInputDialog("¿Quieres que te salude otra vez?\n(1 = Sí / 0 = No)");
            respuesta = Integer.parseInt(entrada);

        } while (respuesta == 1);

        JOptionPane.showMessageDialog(null, "Programa terminado.");
    }
}
