import javax.swing.JOptionPane;

public class Ejercicio14 {
    public static void main(String[] args) {
        int cantidadNumeros = obtenerCantidadNumeros();
        int[] numeros = obtenerNumeros(cantidadNumeros);

        int producto = producto(numeros);

        JOptionPane.showMessageDialog(null, "Producto: " + producto);
    }

    public static int obtenerCantidadNumeros() {
        String input = JOptionPane.showInputDialog("Ingrese la cantidad de números:");
        return Integer.parseInt(input);
    }

    public static int[] obtenerNumeros(int cantidadNumeros) {
        int[] numeros = new int[cantidadNumeros];
        for (int i = 0; i < cantidadNumeros; i++) {
            String input = JOptionPane.showInputDialog("Ingrese el número #" + (i + 1) + ":");
            numeros[i] = Integer.parseInt(input);
        }
        return numeros;
    }

    public static int producto(int... numeros) {
        int resultado = 1;
        for (int numero : numeros) {    //recorre cada elemento de "numeros" y guarda el valor de la iteracion que sea en "numero"
            resultado *= numero;
        }
        return resultado;
    }
}
