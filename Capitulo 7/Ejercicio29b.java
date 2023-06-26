import javax.swing.JOptionPane;

public class Ejercicio29b {

    public static void main(String[] args) {
        // Obtener el número de Fibonacci a calcular
        int numero = obtenerNumero();

        // Calcular y mostrar la serie de Fibonacci
        String resultado = calcularFibonacci(numero);
        JOptionPane.showMessageDialog(null, "Serie de Fibonacci hasta el número " + numero + ":\n" + resultado);
    }

    public static int obtenerNumero() {
        String input = JOptionPane.showInputDialog(null, "Ingrese el número hasta el cual desea calcular la serie de Fibonacci:");
        return Integer.parseInt(input);
    }

    public static String calcularFibonacci(int n) {
        if (n <= 0) {
            return "El número debe ser mayor a cero.";
        } else if (n == 1) {
            return "0";
        } else if (n == 2) {
            return "0, 1";
        } else {
            int a = 0;
            int b = 1;
            StringBuilder sb = new StringBuilder("0, 1");

            for (int i = 3; i <= n; i++) {
                int c = a + b;
                sb.append(", ").append(c);
                a = b;
                b = c;
            }

            return sb.toString();
        }
    }
}
