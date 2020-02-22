package matrizpoo;

import java.util.Scanner;

/**
 * Taller Grupal
 * Jorge Flores
 * Edgar Guamo
 * Luis Quizhpe
 * Brandon Vega
 */
public class EjecutaMatrizTrans {

    public static void main(String[] args) {

        // Scanner para lectura de datos
        Scanner scanner = new Scanner(System.in);

        // Declaración de datos
        MatrizTrans matrizTrans = new MatrizTrans();


        System.out.println("Ingrese el numero de filas: ");
        int n = scanner.nextInt();
        matrizTrans.setN(n);

        System.out.println("Ingrese el numero de columnas: ");
        int m = scanner.nextInt();
        matrizTrans.setM(m);

        int[][] matriz = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Ingrese el numero en la posicion: " + (i + 1) + " " + (j + 1));
                int num = scanner.nextInt();

                matriz[i][j] = num;
            }
        }
        matrizTrans.setMatriz(matriz);
        matrizTrans.getReporte();
    }
}
