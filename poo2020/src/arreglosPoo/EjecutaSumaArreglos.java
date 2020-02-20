package arreglosPoo;

import java.util.Scanner;

/**
 * Jorge Flores
 * Edgar Guamo
 * Luis Quizhpe
 */
public class EjecutaSumaArreglos {

    public static void main(String[] args) {
        // Declaración de arrays
        int[] vA = new int[10];
        int[] vB = new int[10];
        Scanner sc = new Scanner(System.in);

        // Lectura de los elementos de los arrays
        int lector;
        System.out.println("Por favor ingrese todos loc componentes del vector A: ");
        for (int i = 0; i < vA.length; i++) {

            lector = sc.nextInt();
            vA[i] = lector;

        }
        System.out.println("Por favor ingrese todos loc componentes del vector B: ");
        for (int i = 0; i < vA.length; i++) {

            lector = sc.nextInt();
            vB[i] = lector;

        }

        SumaArreglos vector = new SumaArreglos(vA, vB);
        int[] vC = vector.suma();

        System.out.println("Arreglo 1\t+\tArreglo 2\t=\tArreglo 3");
        System.out.println("__________________________________________________");
        for (int i = 0; i < vA.length; i++) {
            System.out.println("    " + vA[i] + "\t          \t" + vB[i] + "\t          \t" + vC[i]);
        }
    }
}
