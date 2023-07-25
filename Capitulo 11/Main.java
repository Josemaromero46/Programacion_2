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

// Definición de la subclase de excepción ExcepcionC que hereda de ExcepcionB
class ExcepcionC extends ExcepcionB {
    public ExcepcionC(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            // Lanzar una excepción de tipo ExcepcionB
            throw new ExcepcionB("Esta es una excepción de tipo ExcepcionB.");
        } catch (ExcepcionA exA) {
            // Capturar la excepción de tipo ExcepcionB usando el bloque catch para ExcepcionA
            System.out.println("Excepción capturada: " + exA.getMessage());
        }

        try {
            // Lanzar una excepción de tipo ExcepcionC
            throw new ExcepcionC("Esta es una excepción de tipo ExcepcionC.");
        } catch (ExcepcionA exA) {
            // Capturar la excepción de tipo ExcepcionC usando el bloque catch para ExcepcionA
            System.out.println("Excepción capturada: " + exA.getMessage());
        }
    }
}
