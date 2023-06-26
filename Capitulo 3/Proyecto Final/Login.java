import javax.swing.JOptionPane;

public class Login {
    public static void main(String[] args) {
        String nombreC = JOptionPane.showInputDialog("Bienvenido al sistema de cuentas bancarias\n\nIngrese su nombre:");
        String apellidoC = JOptionPane.showInputDialog("Ingrese su apellido:");
        String contrasenaC = JOptionPane.showInputDialog("Ingrese su contraseña:");

        Cuenta cta = new Cuenta(nombreC, apellidoC, contrasenaC);
        
        String ConfirmacionCuenta = String.format("Nombre: %s%nApellido: %s%nContrasena: %s%n%n", gestorCuenta.getNombreC(), gestorCuenta.getApellidoC(), gestorCuenta.getContrasenaC());

        JOptionPane.showMessageDialog(null, ConfirmacionCuenta, "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
        
        int menu = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n\n1. Ver cuenta bancaria\n2. Iniciar como empleado\n\n"));

        if (menu == 1 ){
            gestorCuenta.mostrarCuentaInicial();
        } else if (menu ==2){
            gestorEmpleado.mostrarLogin();
        }
        

      
        
    }
}
