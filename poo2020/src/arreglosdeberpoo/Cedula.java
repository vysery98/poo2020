package arreglosdeberpoo;

public class Cedula {

    // Declaración de datos
    private String id;
    private char[] arrayId;
    private String presentarSalida;
    private int calcularValidez;

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
        arrayId = id.toCharArray();
    }

    /**
     * Método para llamar a la información almacenada en la variable validarId
     *
     * @return
     */
    public String getPresentarSalida() {
        return presentarSalida;
    }

    /**
     * Método para determinar la salida de la solución
     */
    public void validarPresentarSalida() {
        if (arrayId[(arrayId.length - 1)] != 10) {
            presentarSalida = "Cédula Incorrecta.";
        } else {
            presentarSalida = ("Número de cédula: " + id + "\nDígito verificador: " + id + "\nEl número de cédula es" +
                    " correcto.");
        }
    }

    public void calcularValidez() {

    }


}
