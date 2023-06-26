import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.printf("Articulo\tValor\n1\t\t239.99\n2\t\t129.75\n3\t\t99.95\n4\t\t350.89\n");

        System.out.print("Ingrese el los prodctos que ha vendido: ");
        String articulos = sc.nextLine();
        double venta = 0;
        for (int i=0; i<articulos.length(); i++ ){
            char objeto = articulos.charAt(i);
            
            if (objeto == '1'){
                venta += 239.99;
            } else if (objeto == '2'){
                venta += 129.75;
            } else if (objeto == '3'){
                venta += 99.95;
            } else if (objeto == '4'){
                venta += 350.89;
            }
        }
        System.out.println("\nEl total de venta es: "+ df.format(venta));
        System.out.println("Su comision es de: "+ df.format(venta*0.09));
        System.out.println("Su Sueldo total es de: "+ df.format(venta*0.09 + 200));



        sc.close();
    }
}
