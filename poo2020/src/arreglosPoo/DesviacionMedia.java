package arreglosPoo;

/**
 * Jorge Flores
 * Edgar Guamo
 * Luis Quizhpe
 */
public class DesviacionMedia {

    // declaración de datos
    private int[] arrayA = new int[15];
    private double media;
    private double[] desviacion = new double[15];

    /**
     * Método para llamar al valor almacenado en la variable arrayA
     *
     * @return arrayA
     */
    public int[] getArrayA() {
        return arrayA;
    }

    /**
     * Método para almacenar valores en la variable arrayA[]
     *
     * @param arrayA
     */
    public void setArrayA(int[] arrayA) {
        this.arrayA = arrayA;
    }

    /**
     * Método para llamar al valor almacenado en la variable media
     *
     * @return media
     */
    public double getMedia() {
        return media;
    }

    /**
     * Método para calcular el valor de la media
     */
    public void calcularMedia() {
        // Declaración de datos
        int suma = 0;
        // Estructura repetitiva empleando acumulador para la suma
        for (int i = 0; i < arrayA.length; i++) {
            suma += arrayA[i];
        }
        // Cálculo de la media
        media = suma / arrayA.length;
    }

    /**
     * Método para llamar al valor almacenado en la variable desviacion
     *
     * @return desviacion
     */
    public double[] getDesviacion() {
        return desviacion;
    }

    /**
     * Método para calcular la desviación por cada uno de los valores de arrayA
     */
    public void calcularDesviacion() {
        for (int i = 0; i < arrayA.length; i++) {
            desviacion[i] = arrayA[i] - media;
        }
    }
}
