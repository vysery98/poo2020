package taller_repeticion;

/**
 * Integrantes:
 * Jorge Flores
 * Luis Quizhpe
 * Brandon Vega
 */
public class Division {

    // declaración de datos
    private int numero1;
    private int numero2;
    private int resultado;

    /**
     * Método para llamar al valor almacenado en la variable numero1
     *
     * @return numero1
     */
    public int getNumero1() {
        return numero1;
    }

    /**
     * Método para establecer un valor a la variable numero1
     *
     * @param numero1
     */
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    /**
     * Método para llamar al valor almacenador en la variable numero2
     *
     * @return numero2
     */
    public int getNumero2() {
        return numero2;
    }

    /**
     * Método para asignar un valor a la variable numero2
     *
     * @param numero2
     */
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    /**
     * Método para llamar al valor almacenado en la variable resultado
     *
     * @return resultado
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * Método para calcular el cociente de la división entre dos números
     */
    public void calcularResultado() {
        int aux = numero1;
        int aux2 = 0; // Cociente de la division
        while (aux > 0) {
            aux2++;
            aux = aux - numero2;
        }
        resultado = aux2;
    }
}
