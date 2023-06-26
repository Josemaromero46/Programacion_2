import java.util.Scanner;
public class Factura {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precio;

    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precio) {
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
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el codigo de la pieza: ");
        String codigo = sc.nextLine();
        System.out.print("Ingrese el nombre de la pieza: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la cantidad pieza(s): ");
        int cantidad = sc.nextInt();
        System.out.print("Ingrese el precio de la pieza: ");
        double precio = sc.nextDouble();
        System.out.println();

        Factura factura = new Factura(codigo, nombre, cantidad, precio);

        System.out.println("Codigo de pieza: " + factura.getNumeroPieza());
        System.out.println("Descripción de la pieza: " + factura.getDescripcionPieza());
        System.out.println("Cantidad: " + factura.getCantidad());
        System.out.println("Precio por artículo: " + factura.getPrecio());
        System.out.println("Monto de la factura: " + factura.obtenerMontoFactura());

        System.out.print("Hubo algun error? (1.Si / 2.No): ");
        int error = sc.nextInt();

        if (error == 1){
            System.out.println("Que dato ingreso mal?\n1.codigo\n2.Descripcion\n3.Cantidad\n4.Precio");
            int corregir = sc.nextInt();
            if (corregir==1){
                System.out.print("Ingrese el codigo de la pieza: ");
                String codigo_corregido = sc.nextLine();
                factura.setNumeroPieza(codigo_corregido);
            } else if (corregir==2){
                System.out.print("Ingrese la descripcion de la pieza: ");
                String descripcion_corregido = sc.nextLine();
                factura.setDescripcionPieza(descripcion_corregido);
            } else if (corregir==3){
                System.out.print("Ingrese la cantidad de pieza(s): ");
                int cantidad_corregido = sc.nextInt();
                factura.setCantidad(cantidad_corregido);
            } else if (corregir==4){
                System.out.print("Ingrese el precio de la pieza: ");
                Double precio_corregido = sc.nextDouble();
                factura.setPrecio(precio_corregido);
            }

        System.out.println("\nNúmero de pieza: " + factura.getNumeroPieza());
        System.out.println("Descripción de la pieza: " + factura.getDescripcionPieza());
        System.out.println("Cantidad: " + factura.getCantidad());
        System.out.println("Precio por artículo: " + factura.getPrecio());
        System.out.println("Monto de la factura: " + factura.obtenerMontoFactura());
        }
        
        sc.close();
    }
}
