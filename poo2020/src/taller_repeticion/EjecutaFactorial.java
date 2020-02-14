package taller_repeticion;

/**
 * Integrantes:
 * Jorge Flores
 * Luis Quizhpe
 * Brandon Vega
 */
import java.util.Scanner;

public class EjecutaFactorial {

    public static void main(String[] args) {

        // Scanner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        int numero;

        // Lectura de los datos solicitados
        System.out.print("Número a calcular su factorial: ");
        numero = scan.nextInt();

        // Creación de objeto
        Factorial fact = new Factorial();

        // Envío del número al método que lo almacene
        fact.setNumero(numero);

        // Cálculo del Factorial
        fact.calcularFactorial();

        // Salida
        System.out.print("Factorial = " + fact.getFactorial());

    }
}
