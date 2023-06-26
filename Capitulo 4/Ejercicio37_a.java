import java.util.Scanner;
public class Ejercicio37_a {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero no negativo: ");
        int num = sc.nextInt();

        if (verificar(num)==1){
            int factorial = Calcular_factorial(num);
            System.out.println("El factorial de " + num + " es: " + factorial);
        } else {
            System.out.print("El factorial de " + num + " es: 1");
        }

        sc.close();
    }

    public static int verificar(Integer num){
        if (num == 0){
            return 0;
        }
        return 1;
    }
        
    public static int Calcular_factorial(Integer num){
        int factorial = 1;
        for (int i = 1; i<=num; i++ ){
            factorial *= i; 
        }
        return factorial;
    }
}
