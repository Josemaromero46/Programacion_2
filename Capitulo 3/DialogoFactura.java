import javax.swing.JOptionPane;

public class DialogoFactura {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precio;

    public DialogoFactura(String numeroPieza, String descripcionPieza, int cantidad, double precio) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        setCantidad(cantidad);
        setPrecio(precio);
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            this.precio = 0.0;
        }
    }

    public double obtenerMontoFactura() {
        return cantidad * precio;
    }

    public static void main(String[] args) {

        String codigo = JOptionPane.showInputDialog(null, "Ingrese el codigo de la pieza: ","Bienvenido a nuestra tienda", JOptionPane.QUESTION_MESSAGE);
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la pieza: ","Bienvenido a nuestra tienda", JOptionPane.QUESTION_MESSAGE);
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad pieza(s): ","Bienvenido a nuestra tienda", JOptionPane.QUESTION_MESSAGE));
        double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio de la pieza: ","Bienvenido a nuestra tienda", JOptionPane.QUESTION_MESSAGE));

        DialogoFactura factura = new DialogoFactura(codigo, nombre, cantidad, precio);

        String mensaje = String.format("Codigo de pieza: %s%nDescripción de la pieza: %s%nCantidad: %d%nPrecio por artículo: %.2f%n%nMonto de la factura: %.2f Lps", factura.getNumeroPieza(), factura.getDescripcionPieza(), factura.getCantidad(), factura.getPrecio(), factura.obtenerMontoFactura());
        
        JOptionPane.showMessageDialog(null, mensaje, "Recibo", JOptionPane.INFORMATION_MESSAGE);
        

        int mensajeError = Integer.parseInt(JOptionPane.showInputDialog(null,"Hubo algun error? (1.Si / 2.No): ","Confirmacion", JOptionPane.CANCEL_OPTION));
        
        int cent=0;
        if (mensajeError == 1){
            while(cent!=2){
                int corregir = Integer.parseInt(JOptionPane.showInputDialog(null, "Que dato ingreso mal?\n1.Codigo\n2.Descripcion\n3.Cantidad\n4.Precio", "Correccion", JOptionPane.INFORMATION_MESSAGE));
                if (corregir==1){
                    String codigoCorregido = JOptionPane.showInputDialog(null, "Ingrese el codigo de la pieza: ", "Correccion de Codigo", JOptionPane.QUESTION_MESSAGE);
                    factura.setNumeroPieza(codigoCorregido);
                    cent = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea corregir algo mas? (1.Si / 2.No)", "Necesita cambiar algo mas???", JOptionPane.CANCEL_OPTION));   
                    continue;
                } else if (corregir==2){
                    String descripcionCorregido = JOptionPane.showInputDialog(null, "Ingrese la descripcion de la pieza: ", "Correccion de Descripcion", JOptionPane.QUESTION_MESSAGE);
                    factura.setDescripcionPieza(descripcionCorregido);
                    cent = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea corregir algo mas? (1.Si / 2.No)", "Necesita cambiar algo mas???", JOptionPane.CANCEL_OPTION));
                    continue;
                } else if (corregir==3){

                    int cantidadCorregido = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad pieza(s): ", "Correcion de Cantidad", JOptionPane.QUESTION_MESSAGE));
                    factura.setCantidad(cantidadCorregido);
                    cent = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea corregir algo mas? (1.Si / 2.No)", "Necesita cambiar algo mas???", JOptionPane.CANCEL_OPTION));
                    continue;
                } else if (corregir==4){
                    double precioCorregido = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio de la pieza: ", "Correccion de Precio", JOptionPane.QUESTION_MESSAGE));
                    factura.setPrecio(precioCorregido);
                    cent = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea corregir algo mas? (1.Si / 2.No)", "Necesita cambiar algo mas???", JOptionPane.CANCEL_OPTION));
                    continue;
                }
            }
        String mensajeCorregido = String.format("Codigo de pieza: %s%nDescripción de la pieza: %s%nCantidad: %d%nPrecio por artículo: %.2f%n%nMonto de la factura: %.2f", factura.getNumeroPieza(), factura.getDescripcionPieza(), factura.getCantidad(), factura.getPrecio(), factura.obtenerMontoFactura());

            JOptionPane.showMessageDialog(null, mensajeCorregido, "Recibo corregido", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Gracias por su compra", "Vuelva pronto", JOptionPane.INFORMATION_MESSAGE);  
        } else {
            JOptionPane.showMessageDialog(null, "Gracias por su compra", "Vuelva pronto", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
