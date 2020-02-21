package arreglosdeberpoo;

public class Cedula {

    // Declaración de datos
    private String id;
    private char[] arrayId;
    private int calcularResta;
    private int numVerificador;
    private String presentarSalida;

    /**
     * Método para llamar al valor almacenado en la variable id
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Método para almacenar un valor en la variable id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Método para llamar a los datos del array arrayId
     *
     * @return arrayId
     */
    public char[] getArrayId() {
        return arrayId;
    }

    /**
     * Método para convertir los datos de la variable id en un array por cada caracter
     */
    public void setArrayId() {
        arrayId = getId().toCharArray();
    }

    /**
     * Método para hacer las operaciones respectivas, asignando en la operación final el número verificador
     */
    public void calcularValidez() {
        int suma = 0;
        for (int i = 0; i < id.length(); i++) {
            if (i != (id.length() - 1)) {
                if (i % 2 == 0) {
                    int aux = 2 * (Integer.parseInt(String.valueOf(arrayId[i])));
                    if (aux >= 10) {
                        suma += (aux - 9);
                    } else {
                        suma += aux;
                    }

                } else {
                    suma += (Integer.parseInt(String.valueOf(arrayId[i])));
                }
            } else {
                // Asignación del último dígito a una variable
                numVerificador = (Integer.parseInt(String.valueOf(arrayId[i])));
                // Cálculo de la última resta
                calcularResta = (suma - (suma % 10) + 10) - suma;
            }
        }
    }

    /**
     * Método para llamar al valor almacenado en la variable numVerificador
     *
     * @return numVerificador
     */
    public int getNumVerificador() {
        return numVerificador;
    }

    /**
     * Método para llamar a la información almacenada en la variable presentarSalida
     *
     * @return presentarSalida
     */
    public String getPresentarSalida() {
        return presentarSalida;
    }

    /**
     * Método para determinar la salida de la solución
     */
    public void validarPresentarSalida() {
        // Si el resultado de la resta es igual al último dígito la cédula es correcta.
        if (calcularResta != numVerificador) {
            presentarSalida = "Cédula Incorrecta.";
        } else {
            presentarSalida = ("Número de cédula: " + getId() + "\nDígito verificador: " +
                    getNumVerificador() + "\nEl número de cédula es correcto.");
        }
    }
}
