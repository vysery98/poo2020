package taller_repeticion;

/**
 * Integrantes:
 * Jorge Flores
 * Luis Quizhpe
 * Brandon Vega
 */
import java.util.Scanner;

public class EjecutaMultiplicacion {

    public static void main(String[] args) {

        // Scanner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        int n1;
        int n2;

        // Lectura de datos solicitados
        System.out.print("Valor del \"Multiplicando\": ");
        n1 = scan.nextInt();
        System.out.print("Valor del \"Multiplicador\": ");
        n2 = scan.nextInt();

        // Creación de objeto
        Multiplicacion prod = new Multiplicacion();

        // Envío de valores a los métodos
        prod.setNumero1(n1);
        prod.setNumero2(n2);

        // Cálculo de la Multiplicación
        prod.calcularResultado();

        // Salida
        System.out.print("Producto = " + prod.getResultado());
    }
}
