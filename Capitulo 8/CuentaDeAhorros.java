import javax.swing.JOptionPane;

public class CuentaDeAhorros {
    private static double tasaInteresAnual;
    private double saldoAhorros;

    public CuentaDeAhorros(double saldoInicial) {
        saldoAhorros = saldoInicial;
    }

    public void calcularInteresMensual() {
        double interesMensual = saldoAhorros * (tasaInteresAnual / 12);
        saldoAhorros += interesMensual;
    }

    public static void modificarTasaInteres(double nuevaTasa) {
        tasaInteresAnual = nuevaTasa;
    }

    public double getSaldoAhorros() {
        return saldoAhorros;
    }

    public static void main(String[] args) {
        CuentaDeAhorros.modificarTasaInteres(0.04); // Establecer tasa de interés anual en 4%

        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000.00);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000.00);

        for (int i = 1; i <= 12; i++) {
            ahorrador1.calcularInteresMensual();
            ahorrador2.calcularInteresMensual();
        }

        JOptionPane.showMessageDialog(null, "Saldos después de 12 meses con una tasa de interés del 4%:\n" +
                "Ahorrador 1: $" + ahorrador1.getSaldoAhorros() + "\n" +
                "Ahorrador 2: $" + ahorrador2.getSaldoAhorros());

        CuentaDeAhorros.modificarTasaInteres(0.05); // Establecer tasa de interés anual en 5%

        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();

        JOptionPane.showMessageDialog(null, "Saldos después de 1 mes adicional con una tasa de interés del 5%:\n" +
                "Ahorrador 1: $" + ahorrador1.getSaldoAhorros() + "\n" +
                "Ahorrador 2: $" + ahorrador2.getSaldoAhorros());
    }
}
