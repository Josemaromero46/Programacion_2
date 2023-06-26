import javax.swing.JOptionPane;

public class Rectangulo {
    private double longitud;
    private double anchura;

    public Rectangulo() {
        this.longitud = 1.0;
        this.anchura = 1.0;
    }

    public double calcularPerimetro() {
        return 2 * (longitud + anchura);
    }

    public double calcularArea() {
        return longitud * anchura;
    }

    public void establecerLongitud(double longitud) {
        if (esNumeroValido(longitud)) {
            this.longitud = longitud;
        } else {
            JOptionPane.showMessageDialog(null, "Longitud inválida. Debe ser un número de punto flotante mayor que 0.0 y menor que 20.0.");
        }
    }

    public void establecerAnchura(double anchura) {
        if (esNumeroValido(anchura)) {
            this.anchura = anchura;
        } else {
            JOptionPane.showMessageDialog(null, "Anchura inválida. Debe ser un número de punto flotante mayor que 0.0 y menor que 20.0.");
        }
    }

    public double obtenerLongitud() {
        return longitud;
    }

    public double obtenerAnchura() {
        return anchura;
    }

    private boolean esNumeroValido(double numero) {
        return numero > 0.0 && numero < 20.0;
    }

    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo();

        JOptionPane.showMessageDialog(null, "Valores predeterminados:\nLongitud: " + miRectangulo.obtenerLongitud() +
                "\nAnchura: " + miRectangulo.obtenerAnchura() +
                "\nPerímetro: " + miRectangulo.calcularPerimetro() +
                "\nÁrea: " + miRectangulo.calcularArea());

        String longitudStr = JOptionPane.showInputDialog("Ingrese la longitud del rectángulo:");
        double longitud = Double.parseDouble(longitudStr);
        miRectangulo.establecerLongitud(longitud);

        String anchuraStr = JOptionPane.showInputDialog("Ingrese la anchura del rectángulo:");
        double anchura = Double.parseDouble(anchuraStr);
        miRectangulo.establecerAnchura(anchura);

        JOptionPane.showMessageDialog(null, "Valores modificados:\nLongitud: " + miRectangulo.obtenerLongitud() +
                "\nAnchura: " + miRectangulo.obtenerAnchura() +
                "\nPerímetro: " + miRectangulo.calcularPerimetro() +
                "\nÁrea: " + miRectangulo.calcularArea());
    }
}
