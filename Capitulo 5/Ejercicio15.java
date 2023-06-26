public class Ejercicio15 {
    public static void main(String[] arg){
        System.out.println("A:");
        for(int i = 1; i<=10; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("B:");
        for(int i = 10; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("C:");
        int cont = 0;
        for(int i = 10; i>=1; i--){
            for(int k=0; k<=cont; k++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
            cont++;
            System.out.println();
        }

        System.out.println();
        System.out.println("D:");
        int contd = 9;
        for(int i = 1; i<=10; i++){
            for(int k=contd; k>=1; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            contd--;
            System.out.println();
        }

    }
}
