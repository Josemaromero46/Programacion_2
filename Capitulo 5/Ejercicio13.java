public class Ejercicio13 {
    public static void main(String[] arg){        
        for (int num=1; num<=20; num++){
            long factorial = Calcular_factorial(num);
            System.out.printf("El factorial de %d es\t %d\n",num, factorial);
        }
    }
    public static long Calcular_factorial(int num){
        long factorial = 1;
        for (int i = 1; i<=num; i++ ){
            factorial *= i; 
        }
        return factorial;
    }
}
