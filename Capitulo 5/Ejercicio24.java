public class Ejercicio24 {
    public static void main(String[] arg){
        int h=1;
        int l=4;
        for(int i=1; i<=5; i++){
            if (i<6){
                for(int j=l; j>=1; j--){
                    System.out.print(" ");;
                }  
                l--;
                for(int k=h; k>=1; k--){
                    System.out.print("*");
                }
                h+=2;
                System.out.println("");
            }    
        } 
        int h2=7;
        int l2=1;
        for(int i=4; i>=1; i--){
            for(int j=1; j<=l2; j++){
                System.out.print(" ");;
            }  
            l2++;
            for(int k=h2; k>=1; k--){
                System.out.print("*");
            }
            h2-=2;
            System.out.println("");
        } 
    }
}
