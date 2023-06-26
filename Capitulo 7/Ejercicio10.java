import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {
        final int NUM_RANGOS = 9;
        int[] contadores = new int[NUM_RANGOS];
        double[] ventas = { 5000, 600, 800, 1200, 350, 900, 1000, 750, 480, 1100 }; // Ejemplo de ventas de vendedores

        for (double venta : ventas) {
            double salario = calcularSalario(venta);
            int indice = obtenerIndiceRango(salario);
            contadores[indice]++;
        }

        mostrarResultados(contadores);
    }

    public static double calcularSalario(double ventas) {
        double salarioBase = 200;
        double comision = ventas * 0.09;
        return salarioBase + comision;
    }

    public static int obtenerIndiceRango(double salario) {
        if (salario >= 200 && salario <= 299) {
            return 0;
        } else if (salario >= 300 && salario <= 399) {
            return 1;
        } else if (salario >= 400 && salario <= 499) {
            return 2;
        } else if (salario >= 500 && salario <= 599) {
            return 3;
        } else if (salario >= 600 && salario <= 699) {
            return 4;
        } else if (salario >= 700 && salario <= 799) {
            return 5;
        } else if (salario >= 800 && salario <= 899) {
            return 6;
        } else if (salario >= 900 && salario <= 999) {
            return 7;
        } else {
            return 8;
        }
    }

    public static void mostrarResultados(int[] contadores) {
        StringBuilder resultado = new StringBuilder("Resultados:\n");

        String[] rangos = { "$200-299", "$300-399", "$400-499", "$500-599", "$600-699", "$700-799", "$800-899",
                "$900-999", "$1,000 en adelante" };

        for (int i = 0; i < contadores.length; i++) {
            resultado.append(rangos[i]).append(": ").append(contadores[i]).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
