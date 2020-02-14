package taller_repeticion;

/**
 * Integrantes:
 * Jorge Flores
 * Luis Quizhpe
 * Brandon Vega
 */
public class Multiplicacion {

    // Declaración de datos
    private int numero1;
    private int numero2;
    private int resultado;

    /**
     * Método para llamar al valor almacenado en la variable numero
     *
     * @return numero1
     */
    public int getNumero1() {
        return numero1;
    }

    /**
     * Método para asignar un valor a la variable numero
     *
     * @param numero
     */
    public void setNumero1(int numero) {
        this.numero1 = numero;
    }

    /**
     * Método para llamar al valor almacenado en la variable numero
     *
     * @return numero2
     */
    public int getNumero2() {
        return numero2;
    }

    /**
     * Método para asignar un valor a la variable numero
     *
     * @param numero
     */
    public void setNumero2(int numero) {
        this.numero2 = numero;
    }

    /**
     * Método para llamar al valor almacenado en la variable resultado
     *
     * @return
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * Método para calcular el resultado de la multiplicación
     */
    public void calcularResultado() {
        int aux = 0;
        for (int i = 1; i <= numero2; i++) {
            aux = aux + numero1;
        }
        resultado = aux;
    }
}
