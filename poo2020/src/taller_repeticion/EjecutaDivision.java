package taller_repeticion;

/**
 * Integrantes:
 * Jorge Flores
 * Luis Quizhpe
 * Brandon Vega
 */
import java.util.Scanner;

public class EjecutaDivision {

    public static void main(String[] args) {

        // Scanner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        int dividendo;
        int divisor;

        // Lectura de datos solicitados
        System.out.print("Valor del \"Dividendo | Numerador\": ");
        dividendo = scan.nextInt();
        System.out.print("Valor del \"Divisor | Denominador\": ");
        divisor = scan.nextInt();

        // Creación de objeto
        Division div = new Division();

        // Envío de valores a los métodos
        div.setNumero1(dividendo);
        div.setNumero2(divisor);

        // Cálculo de la Multiplicación
        div.calcularResultado();

        // Salida
        System.out.print("Cociente = " + div.getResultado());
    }
}
