public class Ejercicio31_ {
    public static void main(String[] arg){
        System.out.println("Número\tCuadrado\tCubo");
        for (int i = 0; i <= 10; i++) {
            int cuadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%d\t%d\t%d%n", i, cuadrado, cubo);
        }
    }
}
