import javax.swing.JOptionPane;

public class Ejercicio17b {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingrese una secuencia de enteros (separados por espacios):");
        String[] numerosStr = input.split(" ");
        
        for (String numeroStr : numerosStr) {
            int numero = Integer.parseInt(numeroStr);
            boolean esPar = esPar(numero);
            
            String resultado = esPar ? "par" : "impar";
            String mensaje = numero + " es " + resultado;
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
    
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
