import javax.swing.JOptionPane;

public class Ejercicio16 {
    public static void main(String[] args) {
        int cantidadValores = obtenerCantidadValores();
        double suma = sumarValores(cantidadValores);

        JOptionPane.showMessageDialog(null, "La suma de los valores es: " + suma);
    }

    public static int obtenerCantidadValores() {
        String input = JOptionPane.showInputDialog("Ingrese la cantidad de valores:");
        return Integer.parseInt(input);
    }

    public static double sumarValores(int cantidadValores) {
        double suma = 0.0;
        for (int i = 0; i < cantidadValores; i++) {
            String input = JOptionPane.showInputDialog("Ingrese el valor #" + (i + 1) + ":");
            double valor = Double.parseDouble(input);
            suma += valor;
        }
        return suma;
    }
}
