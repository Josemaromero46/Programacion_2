import java.util.Scanner;
public class Ejercicio37_b {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero no negativo: ");
        int num = sc.nextInt();

        if (verificar(num)==1){
            double e = Calcular_e(num);
            System.out.println("El valor de e con " + num + " terminos calculados es: " + e);
        } else {
            System.out.print("El valor de e con " + num + " terminos calculados es: 1");
        }

        sc.close();
    }

    public static int verificar(Integer num){
        if (num == 0){
            return 0;
        }
        return 1;
    }
        
    public static double Calcular_e(Integer num){
        double e = 1.0;
        double factorial = 1.0;
        for (int i = 1; i<=num; i++ ){
            factorial *= i;
            e += 1.0/factorial; 
        }
        return e;
    }
}
