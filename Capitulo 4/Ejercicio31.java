import java.util.Scanner;


public class Ejercicio31 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero binario: ");
        String num = sc.nextLine();
        
       if (verificar(num)){
            int valor_decimal = convertir(num);
            System.out.print("El valor decimalde "+ num + " es : "+ valor_decimal);
       } else {
        System.out.print("El numero ingresado no es binario");
       }

        sc.close();
    }

    public static Boolean verificar(String num){
        for (int i=0; i<=num.length()-1; i++){
            char digito = num.charAt(i);
        if (digito != '0' && digito != '1'){
            return false;
        }
        }
        return true;
    }
        
    public static int convertir(String num){
        int valor_decimal = 0;
        for (int i = 0; i < num.length() ; i++){
            char digito = num.charAt(i);
            int valor_digito = Character.getNumericValue(digito);
            valor_decimal += valor_digito*(Math.pow(2,i));
            /*
            0 = 1*2^0 + 0 = 1*1 + 0 = 1
            1 = 0*2^1 + 1 = 0*2 + 1 = 1
            1 = 1*2^2 + 1 = 1*4 + 1 = 5
            5 = 1*2^3 + 5 = 1*8 + 5 = 13
            */  
        }
        return valor_decimal;
    }
}
