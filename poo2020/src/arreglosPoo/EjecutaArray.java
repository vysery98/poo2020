package arreglosPoo;

import java.util.Scanner;

public class EjecutaArray {

    public static void main(String[] args) {
        // Scanner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        int[] vectorA = new int[10];
        int[] vectorB = new int[10];

        // Creación de objeto
        Array array = new Array();

        // Lectura de datos solicitados
        System.out.println("Ingrese los valores correspondientes al vector A y al vector B");
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print("Valor del VectorA en la posición " + i + ": ");
            vectorA[i] = scan.nextInt();
            System.out.print("Valor del VectorB en la posición " + i + ": ");
            vectorB[i] = scan.nextInt();
        }

        // Envío de datos
        array.setVectorA(vectorA);
        array.setVectorB(vectorB);
        // Cálculo de sumatoria
        array.calcularSumatoria();

        // Salida
        for (int i = 0; i < vectorA.length; i++) {
            System.out.println("VectorA[" + i + "] = " + vectorA[i]);
            System.out.println("VectorB[" + i + "] = " + vectorB[i]);
        }
        System.out.println("Sumatoria = " + array.getSumatoriaProducto());
    }

}
