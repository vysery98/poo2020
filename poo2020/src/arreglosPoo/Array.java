package arreglosPoo;

public class Array {
    // Declaración de datos
    private int[] vectorA = new int[10];
    private int[] vectorB = new int[10];
    private int sumatoriaProducto;

    /**
     * Método para llamar al valor almacenado en la variable vectorA
     *
     * @return vectorA
     */
    public int[] getVectorA() {
        return vectorA;
    }

    /**
     * Método para establecer los valores a almacenar en el array vectorA
     *
     * @param vectorA
     */
    public void setVectorA(int[] vectorA) {
        this.vectorA = vectorA;
    }

    /**
     * Método para llamar al valor almacenado en la variable vectorB
     *
     * @return vectorB
     */
    public int[] getVectorB() {
        return vectorB;
    }

    /**
     * Método para establecer los valores a almacenar en el array vectorB
     *
     * @param vectorB
     */
    public void setVectorB(int[] vectorB) {
        this.vectorB = vectorB;
    }

    /**
     * Método para llamar al valor almacenado en la variable sumatoriaProducto
     *
     * @return
     */
    public int getSumatoriaProducto() {
        return sumatoriaProducto;
    }

    /**
     * Método para calcular la Sumatoria de Producto de los Arrays
     */
    public void calcularSumatoria() {
        sumatoriaProducto = 0;

        for (int i = 0; i < vectorA.length; i++) {
            sumatoriaProducto += (vectorA[i] * vectorB[i]);
        }
    }
}
