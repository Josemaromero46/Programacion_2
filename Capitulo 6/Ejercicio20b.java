import javax.swing.JOptionPane;

public class Ejercicio20b {
    public static void main(String[] args) {
        double radio = obtenerRadio();
        double area = calcularArea(radio);
        mostrarResultado(area);
    }
    
    public static double obtenerRadio() {
        String input = JOptionPane.showInputDialog("Ingrese el radio del círculo:");
        double radio = Double.parseDouble(input);
        return radio;
    }
    
    public static double calcularArea(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    
    public static void mostrarResultado(double area) {
        String mensaje = "El área del círculo es: " + area;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
