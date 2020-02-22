package matrizpoo;

import java.util.Scanner;

public class EjecutaMatriz {

    public static void main(String[] args) {

        // Scanner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        int matrizA[][] = new int[3][3];
        int matrizB[][] = new int[3][3];
        int matrizC[][] = new int[3][3];

        // Lectura de datos solicitados para matrizA[][]
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print("Ingrese los datos para la matriz A [" + i + "] [" + j + "]: ");
                matrizA[i][j] = scan.nextInt();
            }
        }

        // Lectura de datos solicitados para matrizB[][]
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print("Ingrese los datos para la matriz B [" + i + "] [" + j + "]: ");
                matrizB[i][j] = scan.nextInt();
            }
        }

        // Creación e inicialización de objeto
        Matriz matriz = new Matriz();
        matriz.setMatrizA(matrizA);
        matriz.setMatrizB(matrizB);
        matriz.sumaMatriz();

        // Salida
        System.out.println("MatrizA: \n");
        matriz.presentarMatriz(matrizA);
        System.out.println("\n\nMatrizB: ");
        matriz.presentarMatriz(matrizB);
        System.out.println("\n\nMatrizC: \n");
        matriz.presentarMatriz(matriz.obtenerSuma());

    }
}
