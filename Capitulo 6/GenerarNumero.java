import javax.swing.JOptionPane;
import java.security.SecureRandom;

public class GenerarNumero {
    public static void main(String[] arg){
            int cent = 0;
            int numrandom = GenerarNumeroRandom();
            int intentos = 0;
            while (cent !=1){
                String mensaje = String.format("llevas %d intentos", intentos);
                int num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje + "\n\nIngrese el numero", "Adivine el numero", JOptionPane.QUESTION_MESSAGE));
                intentos++;
                if (num>numrandom){
                    JOptionPane.showMessageDialog(null, "El numero es menor", "Adivine el numero", JOptionPane.INFORMATION_MESSAGE);
                    cent = 0;
                    continue;
                } else if (num<numrandom){
                    JOptionPane.showMessageDialog(null, "El numero es mayor", "Adivine el numero", JOptionPane.INFORMATION_MESSAGE);
                    cent = 0;
                    continue;
                } else {
                    JOptionPane.showMessageDialog(null, "Adivinaste el numero", "Felicidades", JOptionPane.INFORMATION_MESSAGE); 
                    cent = 1;
                    continue;
                }
            }
    }
    public static int GenerarNumeroRandom(){
        SecureRandom numRandom = new SecureRandom();
        return numRandom.nextInt(1001);
    }
}


