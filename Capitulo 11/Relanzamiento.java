public class Relanzamiento {
    public static void unMetodo2() throws Exception {
        // Lanzar una excepción al principio del método
        throw new Exception("Excepción lanzada desde unMetodo2.");
    }

    public static void unMetodo() throws Exception {
        try {
            // Llamar al método unMetodo2, que lanza una excepción
            unMetodo2();
        } catch (Exception excepcion) {
            // Atrapar la excepción y volver a lanzarla
            throw excepcion;
        }
    }

    public static void main(String[] args) {
        try {
            // Llamar a unMetodo, que atrapará y volverá a lanzar la excepción
            unMetodo();
        } catch (Exception excepcion) {
            // Imprimir el rastreo de la pila de la excepción
            excepcion.printStackTrace();
        }
    }
}
