import javax.swing.JOptionPane;
import java.util.Arrays;

public class EnteroEnorme {
    private int[] digitos;

    public EnteroEnorme() {
        digitos = new int[40];
    }

    public void parse(String numero) {
        Arrays.fill(digitos, 0); // Reiniciar el arreglo de dígitos

        int longitud = numero.length();
        int inicio = 40 - longitud;

        for (int i = 0; i < longitud; i++) {
            char digitoChar = numero.charAt(i);
            int digito = Character.getNumericValue(digitoChar);
            digitos[inicio + i] = digito;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        int indiceInicio = buscarPrimerDigitoNoCero();

        if (indiceInicio == -1) {
            sb.append("0");
        } else {
            for (int i = indiceInicio; i < 40; i++) {
                sb.append(digitos[i]);
            }
        }

        return sb.toString();
    }

    public void sumar(EnteroEnorme otroNumero) {
        int acarreo = 0;

        for (int i = 39; i >= 0; i--) {
            int suma = digitos[i] + otroNumero.digitos[i] + acarreo;
            digitos[i] = suma % 10;
            acarreo = suma / 10;
        }
    }

    public void restar(EnteroEnorme otroNumero) {
        int prestamo = 0;

        for (int i = 39; i >= 0; i--) {
            int diferencia = digitos[i] - otroNumero.digitos[i] - prestamo;

            if (diferencia < 0) {
                diferencia += 10;
                prestamo = 1;
            } else {
                prestamo = 0;
            }

            digitos[i] = diferencia;
        }
    }

    public boolean esIgualA(EnteroEnorme otroNumero) {
        for (int i = 0; i < 40; i++) {
            if (digitos[i] != otroNumero.digitos[i]) {
                return false;
            }
        }

        return true;
    }

    public boolean noEsIgualA(EnteroEnorme otroNumero) {
        return !esIgualA(otroNumero);
    }

    public boolean esMayorQue(EnteroEnorme otroNumero) {
        for (int i = 0; i < 40; i++) {
            if (digitos[i] > otroNumero.digitos[i]) {
                return true;
            } else if (digitos[i] < otroNumero.digitos[i]) {
                return false;
            }
        }

        return false;
    }

    public boolean esMenorQue(EnteroEnorme otroNumero) {
        for (int i = 0; i < 40; i++) {
            if (digitos[i] < otroNumero.digitos[i]) {
                return true;
            } else if (digitos[i] > otroNumero.digitos[i]) {
                return false;
            }
        }

        return false;
    }

    public boolean esMayorOIgualA(EnteroEnorme otroNumero) {
        return esMayorQue(otroNumero) || esIgualA(otroNumero);
    }

    public boolean esMenorOIgualA(EnteroEnorme otroNumero) {
        return esMenorQue(otroNumero) || esIgualA(otroNumero);
    }

    public boolean esCero() {
        return buscarPrimerDigitoNoCero() == -1;
    }

    private int buscarPrimerDigitoNoCero() {
        for (int i = 0; i < 40; i++) {
            if (digitos[i] != 0) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        EnteroEnorme numero1 = new EnteroEnorme();
        String input1 = JOptionPane.showInputDialog("Ingrese el número 1:");
        numero1.parse(input1);

        EnteroEnorme numero2 = new EnteroEnorme();
        String input2 = JOptionPane.showInputDialog("Ingrese el número 2:");
        numero2.parse(input2);

        JOptionPane.showMessageDialog(null, "Número 1: " + numero1.toString());
        JOptionPane.showMessageDialog(null, "Número 2: " + numero2.toString());

        EnteroEnorme resultadoSuma = new EnteroEnorme();
        resultadoSuma.sumar(numero1);
        resultadoSuma.sumar(numero2);

        JOptionPane.showMessageDialog(null, "Suma: " + resultadoSuma.toString());

        EnteroEnorme resultadoResta = new EnteroEnorme();
        resultadoResta.restar(numero1);
        resultadoResta.restar(numero2);

        JOptionPane.showMessageDialog(null, "Resta: " + resultadoResta.toString());

        JOptionPane.showMessageDialog(null, "¿Número 1 es igual a número 2? " + numero1.esIgualA(numero2));
        JOptionPane.showMessageDialog(null, "¿Número 1 es distinto de número 2? " + numero1.noEsIgualA(numero2));
        JOptionPane.showMessageDialog(null, "¿Número 1 es mayor que número 2? " + numero1.esMayorQue(numero2));
        JOptionPane.showMessageDialog(null, "¿Número 1 es menor que número 2? " + numero1.esMenorQue(numero2));
        JOptionPane.showMessageDialog(null, "¿Número 1 es mayor o igual que número 2? " + numero1.esMayorOIgualA(numero2));
        JOptionPane.showMessageDialog(null, "¿Número 1 es menor o igual que número 2? " + numero1.esMenorOIgualA(numero2));

        JOptionPane.showMessageDialog(null, "¿Número 1 es igual a número 1? " + numero1.esIgualA(numero1));
        JOptionPane.showMessageDialog(null, "¿Número 1 es distinto de número 1? " + numero1.noEsIgualA(numero1));
        JOptionPane.showMessageDialog(null, "¿Número 1 es mayor que número 1? " + numero1.esMayorQue(numero1));
        JOptionPane.showMessageDialog(null, "¿Número 1 es menor que número 1? " + numero1.esMenorQue(numero1));
        JOptionPane.showMessageDialog(null, "¿Número 1 es mayor o igual que número 1? " + numero1.esMayorOIgualA(numero1));
        JOptionPane.showMessageDialog(null, "¿Número 1 es menor o igual que número 1? " + numero1.esMenorOIgualA(numero1));

        JOptionPane.showMessageDialog(null, "¿Número 1 es cero? " + numero1.esCero());
    }
}
