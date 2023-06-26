public class Ejercicio27 {
    public static void main(String[] arg){
        char[] inician_blancas = {'█','░','█','░','█','░','█','░',};
        char[] inician_difuminadas = {'░','█','░','█','░','█','░','█',};

        for (int i=1; i<=4; i++){
            System.out.print(inician_blancas);
            System.out.println();
            System.out.print(inician_difuminadas);
            System.out.println();
        }
    }
}
