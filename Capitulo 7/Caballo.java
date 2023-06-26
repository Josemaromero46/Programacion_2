import java.util.Scanner;
import java.util.Random;

public class Caballo
{ 
    private int x = 1;
    private int y = 1;
    private int tamano = 8;
    private int contador = 1;

    int ciclos = 0;

                            
    int intentos_fallidos = 0;

    Scanner entrada = new Scanner(System.in);
    
    public void Recibe() 
    {
        Random aleatorio = new Random();

        int Arreglo[][] = new int[tamano + 1][tamano +1];
        
        Arreglo[1][1] = 1;
        int dado1;
        int dado2;
        int casillas_requeridas = 0;
        
        System.out.println("\nCuantas casillas quiere que recorra por lo menos?");
        System.out.printf("\nAdvertencia: Si pide mas de %d el programa no terminara nunca:\n", tamano*tamano);
        casillas_requeridas = entrada.nextInt();

        while ( contador < casillas_requeridas )
        {
            intentos_fallidos++;
            contador = 1;
            int ciclos = 0;
            for ( int s = 0; s <= tamano; s++ )
            {       // Abre for
                for ( int t = 0; t <= tamano; t++ )
                Arreglo[s][t] = 0; 
            }
            x = 1;
            y = 1;
            
            Arreglo[1][1] = 1;

            while ( 1000 != ciclos)
            {
                ciclos++;
                dado1 = 1 + aleatorio.nextInt(8);
                dado2 = 1 + aleatorio.nextInt(8);

                if ( Math.abs(Math.abs(x) - Math.abs(dado1)) == 2) 
                {
                    if ( Math.abs(Math.abs(y) - Math.abs(dado2)) == 1  )
                    
                    if ( 0 == Arreglo[dado1][dado2])
                    {
                        Arreglo[dado1][dado2] = ++contador;   
                        x = dado1;
                        y = dado2;
                        ciclos = 0;
                    }
                }

                
                if ( Math.abs(Math.abs(x) - Math.abs(dado1)) == 1) 
                {
                    if ( Math.abs(Math.abs(y) - Math.abs(dado2)) == 2  )
                    if ( 0 == Arreglo[dado1][dado2] )
                    {    // Abre if 
                        Arreglo[dado1][dado2] = ++contador; 
                        x = dado1;
                        y = dado2;
                        ciclos = 0;
                    }
                }
            }
        }

        System.out.println("\nLISTO!");
        System.out.printf("\nSe recorrieron %d casillas.\n", contador);
        System.out.printf("\nSe intentaron %d circuitos antes de obtener el requerido.\n", intentos_fallidos); 
        Imprime( Arreglo );
    }
    public void Imprime(int B[][])
    {
        for ( int k = 1; k <= 8; k++ )
        {
            for ( int j = 1; j <= 8; j++)
            {
                System.out.printf("%5d", B[k][j]);
            }  
            System.out.println("\n");
        }
    }

}