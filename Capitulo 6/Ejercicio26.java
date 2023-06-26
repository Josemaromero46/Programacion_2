import javax.swing.JOptionPane;

public class Ejercicio26 {
    public static void main(String[] args) {
        int numero = obtenerNumero("Ingrese un número entero:");
        
        int numeroInvertido = invertirNumeros(numero);
        
        String mensaje = "El número invertido es: " + numeroInvertido;
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public static int obtenerNumero(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        int numero = Integer.parseInt(input);
        return numero;
    }
    
    public static int invertirNumeros(int numero) {
        int numeroInvertido = 0;
        
        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }
        
        return numeroInvertido;
    }
}
