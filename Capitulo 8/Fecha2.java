import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha2 {
    private LocalDate fecha;

    public Fecha2(int dia, int mes, int anio) {
        this.fecha = LocalDate.of(anio, mes, dia);
    }

    public void imprimirFechaFormato1() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String fechaFormateada = fecha.format(formato);
        JOptionPane.showMessageDialog(null, fechaFormateada);
    }

    public void imprimirFechaFormato2() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        String fechaFormateada = fecha.format(formato);
        JOptionPane.showMessageDialog(null, fechaFormateada);
    }

    public void imprimirFechaFormato3() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("DDD yyyy");
        String fechaFormateada = fecha.format(formato);
        JOptionPane.showMessageDialog(null, fechaFormateada);
    }

    public static void main(String[] args) {
        String diaStr = JOptionPane.showInputDialog("Ingrese el día:");
        int dia = Integer.parseInt(diaStr);

        String mesStr = JOptionPane.showInputDialog("Ingrese el mes:");
        int mes = Integer.parseInt(mesStr);

        String anioStr = JOptionPane.showInputDialog("Ingrese el año:");
        int anio = Integer.parseInt(anioStr);

        Fecha2 miFecha = new Fecha2(dia, mes, anio);

        JOptionPane.showMessageDialog(null, "Formato 1: MM/dd/yyyy");
        miFecha.imprimirFechaFormato1();

        JOptionPane.showMessageDialog(null, "Formato 2: MMMM dd, yyyy");
        miFecha.imprimirFechaFormato2();

        JOptionPane.showMessageDialog(null, "Formato 3: DDD yyyy");
        miFecha.imprimirFechaFormato3();
    }
}
