import java.util.Random;
import javax.swing.JOptionPane;

public class Ejercicio17_ {
    public static void main(String[] args) {
        final int NUM_LANZAMIENTOS = 36000000;
        int[] frecuenciaSumas = new int[11];

        Random random = new Random();

        for (int i = 0; i < NUM_LANZAMIENTOS; i++) {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            int suma = dado1 + dado2;
            frecuenciaSumas[suma - 2]++;
        }

        mostrarResultados(frecuenciaSumas);
    }

    public static void mostrarResultados(int[] frecuenciaSumas) {
        StringBuilder resultado = new StringBuilder();
        resultado.append("Resultados del tiro de dados:\n");
        resultado.append("Suma\tFrecuencia\n");

        for (int i = 0; i < frecuenciaSumas.length; i++) {
            int suma = i + 2;
            int frecuencia = frecuenciaSumas[i];
            resultado.append(suma).append(" \t").append(frecuencia).append("\n");
        }

        JOptionPane.showMessageDialog(null, "<html>" + resultado.toString().replace("\n", "<br>") + "</html>");
    }
}
