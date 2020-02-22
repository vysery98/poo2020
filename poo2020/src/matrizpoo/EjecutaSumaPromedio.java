package matrizpoo;

import java.util.Scanner;

/**
 * Taller Grupal:
 * Jorge Flores
 * Edgar Guamo
 * Luis Quizhpe
 * Brandon Vega
 */
public class EjecutaSumaPromedio {

    public static void main(String[] args) {

        // Scanner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        int[][] matriz;
        int filas;
        int columnas;

        // Lectura de datos solicitados
        System.out.print("Número de filas del arreglo: ");
        filas = scan.nextInt();
        System.out.print("Número de columnas del arreglo: ");
        columnas = scan.nextInt();

        // Definición del tamaño del arreglo
        matriz = new int[filas][columnas];

        // Ingreso de valores al array
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Valor para matriz[" + i + "][" + j + "]:\t");
                matriz[i][j] = scan.nextInt();
            }
        }

        // Creación e inicialización de objeto
        SumaPromedio array = new SumaPromedio();
        array.setMatriz(matriz);
        array.calcularSuma();
        array.calcularPromedio();

        // Salida
        System.out.println("Matriz: \n");
        array.presentarMatriz(matriz);
        System.out.println("\nSuma de los elementos = " + array.getCalcularSuma());
        System.out.println("\nPromedio de los elementos = " + array.getCalcularPromedio());
    }
}
