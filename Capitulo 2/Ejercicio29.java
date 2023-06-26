import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] arg){
      Scanner sc = new Scanner(System.in);

      System.out.print("Ingrese un Caracter: ");
      char letra = sc.nextLine().charAt(0);
      /*%c imprime un caracter
      %d escribe el numero entero, sin comas*/ 
      System.out.printf("El caracter %c tiene el valor %d%n", letra, (int) letra);
        
      sc.close();
    }
    
}
