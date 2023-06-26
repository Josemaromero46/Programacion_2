import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] arg){
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su peso en Kilogramos: ");
        double kg = sc.nextDouble();
        System.out.print("Ingrese su altura metros: ");
        double alt = sc.nextDouble();
        double bmi = kg/(alt*alt);
        System.out.println('\n'+"Tu BMI es: " + df.format(bmi) + '\n');

        System.out.println("VALORES DE BMI");
        System.out.println("Bajo de peso: : menos de 18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso: 30 o más");

        sc.close();
    }
}
