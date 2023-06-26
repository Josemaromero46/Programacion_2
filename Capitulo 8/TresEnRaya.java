import javax.swing.JOptionPane;

public class TresEnRaya {
    private enum Valor {
        X, O, VACIO
    }

    private Valor[][] tablero;
    private boolean turnoJugador1;

    public TresEnRaya() {
        tablero = new Valor[3][3];
        reiniciarTablero();
        turnoJugador1 = true;
    }

    public void reiniciarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = Valor.VACIO;
            }
        }
    }

    public void jugar() {
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            mostrarTablero();

            int fila = obtenerEntrada("Ingrese la fila (0-2):");
            int columna = obtenerEntrada("Ingrese la columna (0-2):");

            if (validarMovimiento(fila, columna)) {
                if (turnoJugador1) {
                    tablero[fila][columna] = Valor.X;
                } else {
                    tablero[fila][columna] = Valor.O;
                }

                if (verificarGanador() || verificarEmpate()) {
                    juegoTerminado = true;
                } else {
                    turnoJugador1 = !turnoJugador1;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Movimiento inválido. Intente nuevamente.");
            }
        }
    }

    private void mostrarTablero() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tablero:\n");

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                sb.append(tablero[i][j]).append(" ");
            }
            sb.append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }

    private int obtenerEntrada(String mensaje) {
        String entradaStr = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(entradaStr);
    }

    private boolean validarMovimiento(int fila, int columna) {
        if (fila >= 0 && fila < tablero.length && columna >= 0 && columna < tablero[fila].length) {
            return tablero[fila][columna] == Valor.VACIO;
        }
        return false;
    }

    private boolean verificarGanador() {
        // Verificar filas
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i][0] != Valor.VACIO && tablero[i][0] == tablero[i][1] && tablero[i][0] == tablero[i][2]) {
                JOptionPane.showMessageDialog(null, "¡Ha ganado el jugador " + tablero[i][0] + "!");
                return true;
            }
        }

        // Verificar columnas
        for (int j = 0; j < tablero[0].length; j++) {
            if (tablero[0][j] != Valor.VACIO && tablero[0][j] == tablero[1][j] && tablero[0][j] == tablero[2][j]) {
                JOptionPane.showMessageDialog(null, "¡Ha ganado el jugador " + tablero[0][j] + "!");
                return true;
            }
        }

        // Verificar diagonales
        if (tablero[0][0] != Valor.VACIO && tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2]) {
            JOptionPane.showMessageDialog(null, "¡Ha ganado el jugador " + tablero[0][0] + "!");
            return true;
        }

        if (tablero[0][2] != Valor.VACIO && tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0]) {
            JOptionPane.showMessageDialog(null, "¡Ha ganado el jugador " + tablero[0][2] + "!");
            return true;
        }

        return false;
    }

    private boolean verificarEmpate() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == Valor.VACIO) {
                    return false;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "¡Empate!");
        return true;
    }

    public static void main(String[] args) {
        TresEnRaya juego = new TresEnRaya();
        juego.jugar();
    }
}
