import javax.swing.JOptionPane;

public class Ejercicio19_ {

    // Arreglo para representar los asientos del avión
    private static boolean[] asientos = new boolean[10];

    public static void main(String[] args) {
        asignarAsientos();
    }

    public static void asignarAsientos() {
        while (true) {
            int opcion = obtenerOpcion();
            boolean asientoAsignado = false;

            if (opcion == 1) {
                asientoAsignado = asignarAsientoPrimeraClase();
            } else if (opcion == 2) {
                asientoAsignado = asignarAsientoEconomico();
            } else {
                JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, ingrese 1 o 2.");
                continue;
            }

            if (asientoAsignado) {
                imprimirPaseAbordar(opcion);
                break;
            } else {
                int opcionAsignacion = solicitarAsignacion(opcion);
                if (opcionAsignacion == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "El próximo vuelo sale en 3 horas.");
                    break;
                }
            }
        }
    }

    public static int obtenerOpcion() {
        String input = JOptionPane.showInputDialog(
                "Por favor escriba 1 para Primera Clase\nPor favor escriba 2 para Económico");
        return Integer.parseInt(input);
    }

    public static boolean asignarAsientoPrimeraClase() {
        for (int i = 0; i < 5; i++) {
            if (!asientos[i]) {
                asientos[i] = true;
                return true;
            }
        }
        return false;
    }

    public static boolean asignarAsientoEconomico() {
        for (int i = 5; i < 10; i++) {
            if (!asientos[i]) {
                asientos[i] = true;
                return true;
            }
        }
        return false;
    }

    public static int solicitarAsignacion(int opcion) {
        String mensaje = "No hay asientos disponibles en la sección " + (opcion == 1 ? "Primera Clase" : "Económico")
                + ".\n¿Aceptar asiento en la sección " + (opcion == 1 ? "Económico" : "Primera Clase") + "?";
        return JOptionPane.showOptionDialog(null, mensaje, "Asignación de Asientos",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
    }

    public static void imprimirPaseAbordar(int opcion) {
        String seccion = (opcion == 1) ? "Primera Clase" : "Económico";
        int numeroAsiento = obtenerNumeroAsiento(opcion);
        JOptionPane.showMessageDialog(null, "¡Gracias por utilizar nuestro servicio!\n\nPase de Abordar:\nSección: "
                + seccion + "\nAsiento: " + numeroAsiento);
    }

    public static int obtenerNumeroAsiento(int opcion) {
        if (opcion == 1) {
            for (int i = 0; i < 5; i++) {
                if (asientos[i]) {
                    return i + 1;
                }
            }
        } else {
            for (int i = 5; i < 10; i++) {
                if (asientos[i]) {
                    return i + 1;
                }
            }
        }
        return -1;
    }
}
