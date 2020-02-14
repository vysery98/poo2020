package taller_repeticion;

/**
 * Integrantes:
 * Jorge Flores
 * Luis Quizhpe
 * Brandon Vega
 */
public class Factorial {

    // Declaración de datos
    private int numero;
    private int factorial;

    /**
     * Método para llamar al valor almacenado en la variable numero
     * @return numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Método para asignar un valor a la variable numero
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Método para calcular el factorial de un número
     */
    public void calcularFactorial() {
        if (numero == 0) {
            factorial = 1;
        } else {
            int aux = 1;

            for (int i = 1; i <= numero; i++) {
                aux = aux * i;
            }
            factorial = aux;
        }
    }

    /**
     * Método para llamar al valor almacenado en la variable factorial
     * @return factorial
     */
    public int getFactorial() {
        return factorial;
    }
}
