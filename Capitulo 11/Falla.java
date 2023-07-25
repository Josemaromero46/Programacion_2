class UnaClase {
    public UnaClase() throws Exception {
        // Simulamos una condición de error en el constructor
        throw new Exception("Fallo en el constructor de UnaClase.");
    }
}

public class Falla {
    public static void main(String[] args) {
        try {
            // Intentamos crear un objeto de tipo UnaClase
            UnaClase objeto = new UnaClase();
        } catch (Exception excepcion) {
            // Capturamos la excepción lanzada desde el constructor y mostramos el mensaje
            System.out.println("Excepción capturada: " + excepcion.getMessage());
        }
    }
}
