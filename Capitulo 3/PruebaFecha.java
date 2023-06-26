import javax.swing.JOptionPane;

public class PruebaFecha {
    public static void main(String[] args) {
        int mes = obtenerEntero("Ingrese el mes:");
        int dia = obtenerEntero("Ingrese el día:");
        int año = obtenerEntero("Ingrese el año:");

        Fecha fecha = new Fecha(mes, dia, año);

        // Obtener valores individuales
        int mesFecha = fecha.getMes();
        int diaFecha = fecha.getDia();
        int añoFecha = fecha.getAño();

        JOptionPane.showMessageDialog(null, "Fecha: " + mesFecha + "/" + diaFecha + "/" + añoFecha);

        // Cambiar el valor del mes
        int nuevoMes = obtenerEntero("Ingrese el nuevo mes:");
        fecha.setMes(nuevoMes);

        // Mostrar la fecha actualizada
        fecha.mostrarFecha();
    }

    public static int obtenerEntero(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }
}
