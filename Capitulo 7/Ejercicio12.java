import javax.swing.JOptionPane;

public class Ejercicio12 {
    public static void main(String[] args) {
        final int CANTIDAD_NUMEROS = 5;
        int[] numerosUnicos = new int[CANTIDAD_NUMEROS];
        int contador = 0;

        while (contador < CANTIDAD_NUMEROS) {
            int numero = obtenerNumero("Ingrese un número entre 10 y 100:");

            if (validarNumero(numero, numerosUnicos, contador)) {
                numerosUnicos[contador] = numero;
                contador++;
            }
        }

        mostrarNumerosUnicos(numerosUnicos);
    }

    public static int obtenerNumero(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

    public static boolean validarNumero(int numero, int[] numerosUnicos, int contador) {
        if (numero < 10 || numero > 100) {
            JOptionPane.showMessageDialog(null, "El número debe estar entre 10 y 100.");
            return false;
        }

        for (int i = 0; i < contador; i++) {
            if (numerosUnicos[i] == numero) {
                JOptionPane.showMessageDialog(null, "El número ya ha sido ingresado.");
                return false;
            }
        }

        return true;
    }

    public static void mostrarNumerosUnicos(int[] numerosUnicos) {
        StringBuilder mensaje = new StringBuilder("Números únicos ingresados: ");

        for (int i = 0; i < numerosUnicos.length; i++) {
            if (numerosUnicos[i] != 0) {
                mensaje.append(numerosUnicos[i]).append(" ");
            }
        }

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}

