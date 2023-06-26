import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("El numero es par");
            }else{
                System.out.println("El numero es impar");
        }
        sc.close();
    }

}