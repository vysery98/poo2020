package deber_seleccion;

public class Mayor4Numeros2 {

    // declaración de datos
    private int numA;
    private int numB;
    private int numC;
    private int numD;
    private int nuMayor;

    /**
     * Método para llamar al valor almacenado en numA
     *
     * @return numA
     */
    public int getNumA() {
        return numA;
    }

    /**
     * Método para establecer un valor en la variable numA
     *
     * @param numA
     */
    public void setNumA(int numA) {
        this.numA = numA;
    }

    /**
     * Método para llamar al valor almacenado en la variable numB
     *
     * @return numB
     */
    public int getNumB() {
        return numB;
    }

    /**
     * Método para establecer un valor en la variable numB
     *
     * @param numB
     */
    public void setNumB(int numB) {
        this.numB = numB;
    }

    /**
     * Método para llamar al valor almacenado en la variable numC
     *
     * @return numC
     */
    public int getNumC() {
        return numC;
    }

    /**
     * Método para establecer un valor en la variable numC
     *
     * @param numC
     */
    public void setNumC(int numC) {
        this.numC = numC;
    }

    /**
     * Método para llamar al valor almacenado en la variable numD
     *
     * @return numD
     */
    public int getNumD() {
        return numD;
    }

    /**
     * Método para establecer un valor en la variable numD
     *
     * @param numD
     */
    public void setNumD(int numD) {
        this.numD = numD;
    }

    /**
     * Método para llamar al valor almacenado en la variable nuMayor
     *
     * @return nuMayor
     */
    public int getNuMayor() {
        return nuMayor;
    }

    /**
     * Método para calcular el valor mayor entre los números
     * ingresados previamente
     */
    public void calcularNuMayor() {
        if (numA > numB && numA > numC && numA > numD) {
            nuMayor = numA;
        } else {
            if (numB > numC && numB > numD) {
                nuMayor = numB;
            } else {
                if (numC > numD) {
                    nuMayor = numC;
                } else {
                    nuMayor = numD;
                }
            }
        }
    }
}
