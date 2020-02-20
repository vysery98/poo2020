package arreglosPoo;

import java.util.Scanner;

/**
 * Jorge Flores
 * Edgar Guamo
 * Luis Quizhpe
 */
public class EjecutaDesviacionMedia {

    public static void main(String[] args) {

        // Scanner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        int[] arrayA = new int[15];

        // Declaración e inicialización d eobjeto
        DesviacionMedia desvMedia = new DesviacionMedia();

        System.out.println("Ingrese los valores indicados par el arreglo: ");
        // Lectura de datos solicitados para almacenar en el arreglo arrayA
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print("arrayA[" + (i + 1) + "] = ");
            arrayA[i] = scan.nextInt();
        }

        // Se envían los valores a los métodos
        desvMedia.setArrayA(arrayA);
        // Cálculos de desviación y de media
        desvMedia.calcularMedia();
        desvMedia.calcularDesviacion();

        // Salida
        // Encabezado
        System.out.println("NÚMERO\t\tDESVIACIÓN");
        System.out.println("_______________________");
        // Datos
        int[] datos = desvMedia.getArrayA();
        double[] desv = desvMedia.getDesviacion();

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(datos[i] + "\t\t\t" + desv[i]);
        }
        System.out.println("MEDIA = " + desvMedia.getMedia());
    }
}
