import java.util.Scanner;

public class Simpletron {

    private static final int TAMANO_MEMORIA = 100;
    private static final int OPERACION_LEER = 10;
    private static final int OPERACION_ESCRIBIR = 11;
    private static final int OPERACION_CARGAR = 20;
    private static final int OPERACION_ALMACENAR = 21;
    private static final int OPERACION_SUMAR = 30;
    private static final int OPERACION_RESTAR = 31;
    private static final int OPERACION_MULTIPLICAR = 32;
    private static final int OPERACION_DIVIDIR = 33;
    private static final int OPERACION_SALTO = 40;
    private static final int OPERACION_SALTO_NEGATIVO = 41;
    private static final int OPERACION_SALTO_CERO = 42;
    private static final int OPERACION_DETENER = 43;

    private static int[] memoria = new int[TAMANO_MEMORIA];
    private static int acumulador = 0;
    private static int contadorInstrucciones = 0;
    private static boolean ejecutando = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Bienvenido a Simpletron ***");
        System.out.println("*** Por favor, ingrese su programa instrucción por instrucción ***");
        System.out.println("*** (o palabra de datos) a la vez. Mostraré ***");
        System.out.println("*** el número de ubicación y un signo de interrogación (?). ***");
        System.out.println("*** Luego, debe ingresar la palabra para esa ubicación. ***");
        System.out.println("*** Ingrese -99999 para detener la entrada de su programa. ***");

        int entrada;
        int indiceMemoria = 0;

        do {
            System.out.printf("%02d ? ", indiceMemoria);
            entrada = scanner.nextInt();
            memoria[indiceMemoria] = entrada;
            indiceMemoria++;
        } while (entrada != -99999 && indiceMemoria < TAMANO_MEMORIA);

        System.out.println("*** Carga del programa completada ***");
        System.out.println("*** Comienza la ejecución del programa ***");

        contadorInstrucciones = 0;
        ejecutando = true;

        while (ejecutando) {
            int instruccion = memoria[contadorInstrucciones];
            int codigoOperacion = instruccion / 100;
            int operando = instruccion % 100;

            switch (codigoOperacion) {
                case OPERACION_LEER:
                    System.out.print("Ingrese un número: ");
                    memoria[operando] = scanner.nextInt();
                    contadorInstrucciones++;
                    break;
                case OPERACION_ESCRIBIR:
                    System.out.println("Salida: " + memoria[operando]);
                    contadorInstrucciones++;
                    break;
                case OPERACION_CARGAR:
                    acumulador = memoria[operando];
                    contadorInstrucciones++;
                    break;
                case OPERACION_ALMACENAR:
                    memoria[operando] = acumulador;
                    contadorInstrucciones++;
                    break;
                case OPERACION_SUMAR:
                    acumulador += memoria[operando];
                    contadorInstrucciones++;
                    break;
                case OPERACION_RESTAR:
                    acumulador -= memoria[operando];
                    contadorInstrucciones++;
                    break;
                case OPERACION_MULTIPLICAR:
                    acumulador *= memoria[operando];
                    contadorInstrucciones++;
                    break;
                case OPERACION_DIVIDIR:
                    if (memoria[operando] != 0) {
                        acumulador /= memoria[operando];
                    } else {
                        System.out.println("*** Error: Intento de división por cero ***");
                        ejecutando = false;
                    }
                    contadorInstrucciones++;
                    break;
                case OPERACION_SALTO:
                    contadorInstrucciones = operando;
                    break;
                case OPERACION_SALTO_NEGATIVO:
                    if (acumulador < 0) {
                        contadorInstrucciones = operando;
                    } else {
                        contadorInstrucciones++;
                    }
                    break;
                case OPERACION_SALTO_CERO:
                    if (acumulador == 0) {
                        contadorInstrucciones = operando;
                    } else {
                        contadorInstrucciones++;
                    }
                    break;
                case OPERACION_DETENER:
                    System.out.println("*** Ejecución de Simpletron finalizada ***");
                    ejecutando = false;
                    break;
                default:
                    System.out.println("*** Error: Código de operación inválido ***");
                    ejecutando = false;
                    break;
            }
        }

        scanner.close();
    }
}
