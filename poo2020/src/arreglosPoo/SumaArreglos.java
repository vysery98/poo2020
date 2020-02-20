package arreglosPoo;

/**
 * Jorge Flores
 * Edgar Guamo
 * Luis Quizhpe
 */
public class SumaArreglos {

    private int[] vA = new int[10];
    private int[] vB = new int[10];

    /**
     * MEtodo constructor
     *
     * @param vA
     * @param vB
     */
    public SumaArreglos(int[] vA, int[] vB) {
        this.vA = vA;
        this.vB = vB;
    }

    /**
     * metodo para obtener el vector a
     *
     * @return
     */
    public int[] getVA() {
        return vA;
    }

    /**
     * metodo para conseguir el vector a
     *
     * @param vA
     */
    public void setVA(int[] vA) {
        this.vA = vA;
    }

    /**
     * metodo para obtener el vector b
     *
     * @return
     */
    public int[] getVB() {
        return vB;
    }

    /**
     * metodo para get el vector b
     *
     * @param vB
     */
    public void setVectorB(int[] vB) {
        this.vB = vB;
    }

    /**
     * metodo para calcular el vector c
     *
     * @return vectorc
     */
    public int[] suma() {
        int[] vectorC = new int[10];

        for (int i = 0; i < vA.length; i++) {

            vectorC[i] = vA[i] + vB[i];

        }
        return vectorC;
    }

}
