public class Casos {
    public static void unMetodo() {
        try {
            // Generar una excepción ArithmeticException
            int result = 10 / 0;
            System.out.println(result); // Esta línea nunca se ejecutará debido a la excepción
        } catch (ArithmeticException aritmeticaExcepcion) {
            System.out.println("Excepción capturada en unMetodo: " + aritmeticaExcepcion.getMessage());
        }

        // Generar otra excepción NullPointerException
        String str = null;
        System.out.println(str.length()); // Esta línea generará una excepción
    }

    public static void main(String[] args) {
        try {
            // Llamar a unMetodo, que contiene dos excepciones, una será manejada en unMetodo y la otra será pasada al alcance superior
            unMetodo();
        } catch (NullPointerException nullExcepcion) {
            System.out.println("Excepción capturada en el método main: " + nullExcepcion.getMessage());
        }
    }
}
