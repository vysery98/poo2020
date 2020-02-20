package arreglosdeberpoo;

public class BinarioDecimal {

    // Declaración de datos
    private String binario;
    private char[] arrayBin;
    private int decimal;

    /**
     * Método para llamar al valor almacenado en la variable binario
     *
     * @return binario
     */
    public String getBinario() {
        return binario;
    }

    /**
     * Método para almacenar un valor en la variable binario
     *
     * @param binario
     */
    public void setBinario(String binario) {
        this.binario = binario;
    }

    /**
     * Método para llamar a los datos del array arrayBin
     *
     * @return arrayBin
     */
    public char[] getArrayBin() {
        return arrayBin;
    }

    /**
     * Método para convertir los datos de la variable binario en un array por cada caracter
     */
    public void setArrayBin() {
        arrayBin = binario.toCharArray();
    }

    /**
     * Método para llamar al valor almacenado en la variable decimal
     *
     * @return decimal
     */
    public int getDecimal() {
        return decimal;
    }

    /**
     * Método para calcular la transformación de un número binario a decimal
     */
    public void calcularDecimal() {
        int aux = 0;
        double suma = 0;
        for (int i = (binario.length() - 1); i >= 0; i--) {
            suma = suma + (Integer.parseInt(String.valueOf(arrayBin[i])) * Math.pow(2, aux));
            aux++;
        }
        // Parsing
        decimal = (int) suma;
    }
}
