import javax.swing.JOptionPane;

public class Ejercicio23 {
    public static void main(String[] args) {
        double numero1 = obtenerNumero("Ingrese el primer número:");
        double numero2 = obtenerNumero("Ingrese el segundo número:");
        double numero3 = obtenerNumero("Ingrese el tercer número:");
        
        double minimo = minimo3(numero1, numero2, numero3);
        
        String mensaje = "El número mínimo es: " + minimo;
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public static double obtenerNumero(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        double numero = Double.parseDouble(input);
        return numero;
    }
    
    public static double minimo3(double numero1, double numero2, double numero3) {
        double minimo = Math.min(numero1, Math.min(numero2, numero3));
        return minimo;
    }
}
