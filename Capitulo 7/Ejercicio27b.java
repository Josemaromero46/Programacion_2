public class Ejercicio27b {

    public static void main(String[] args) {
        boolean[] numerosPrimos = generarPrimos(100);

        int contador = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (numerosPrimos[contador]) {
                    System.out.print(String.format("%-4d", contador + 1));
                } else {
                    System.out.print("     ");
                }
                contador++;
            }
            System.out.println();
        }
    }

    public static boolean[] generarPrimos(int n) {
        boolean[] numerosPrimos = new boolean[n];
        // Inicializar todos los números como primos
        for (int i = 2; i < n; i++) {
            numerosPrimos[i] = true;
        }

        // Realizar la criba de Eratóstenes
        for (int p = 2; p * p < n; p++) {
            if (numerosPrimos[p]) {
                for (int i = p * p; i < n; i += p) {
                    numerosPrimos[i] = false;
                }
            }
        }

        return numerosPrimos;
    }
}
