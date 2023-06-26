import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números: ");
        int cantidadNumeros = sc.nextInt();
        
        int menorValor = Integer.MAX_VALUE;
        
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            int numero = sc.nextInt();
            
            if (numero < menorValor) {
                menorValor = numero;
            }
        }
        
        System.out.println("El menor valor ingresado es: " + menorValor);

        sc.close();
    }
}
