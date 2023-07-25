import java.io.IOException;

// Definición de la superclase de excepción ExcepcionA
class ExcepcionA extends Exception {
    public ExcepcionA(String message) {
        super(message);
    }
}

// Definición de la subclase de excepción ExcepcionB que hereda de ExcepcionA
class ExcepcionB extends ExcepcionA {
    public ExcepcionB(String message) {
        super(message);
    }
}

public class IO_Exception {
    public static void main(String[] args) {
        try {
            // Bloque try que lanza una excepción de tipo ExcepcionA
            throw new ExcepcionA("ExcepcionA: Esto es una excepción de tipo ExcepcionA.");
        } catch (Exception excepcion) {
            // Bloque catch que atrapa cualquier excepción de tipo Exception
            System.out.println("Excepción capturada: " + excepcion.getMessage());
        }

        try {
            // Bloque try que lanza una excepción de tipo ExcepcionB
            throw new ExcepcionB("ExcepcionB: Esto es una excepción de tipo ExcepcionB.");
        } catch (Exception excepcion) {
            // Bloque catch que atrapa cualquier excepción de tipo Exception
            System.out.println("Excepción capturada: " + excepcion.getMessage());
        }

        try {
            // Bloque try que lanza una NullPointerException
            String str = null;
            System.out.println(str.length());
        } catch (Exception excepcion) {
            // Bloque catch que atrapa cualquier excepción de tipo Exception
            System.out.println("Excepción capturada: " + excepcion.getMessage());
        }

        try {
            // Bloque try que lanza una IOException
            throw new IOException("IOException: Esto es una excepción de tipo IOException.");
        } catch (Exception excepcion) {
            // Bloque catch que atrapa cualquier excepción de tipo Exception
            System.out.println("Excepción capturada: " + excepcion.getMessage());
        }
    }
}
