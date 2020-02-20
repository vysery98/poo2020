package arreglosdeberpoo;

public class Estudiantes {

    // Declaración de datos
    private String[] nombre = new String[5];
    private int[] edad = new int[5];
    private String[] universidad = new String[5];
    private String[] celular = new String[5];
    private String salida;

    /**
     * Método para llamar a los valores almacenados en el arreglo nombre
     *
     * @return nombre
     */
    public String[] getNombre() {
        return nombre;
    }

    /**
     * Método para almacenar valores en el arreglo nombre
     *
     * @param nombre
     */
    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para llamar a los valores almacenados en el arreglo edad
     *
     * @return edad
     */
    public int[] getEdad() {
        return edad;
    }

    /**
     * Método para almacenar valores en el arreglo edad
     *
     * @param edad
     */
    public void setEdad(int[] edad) {
        this.edad = edad;
    }

    /**
     * Método para llamar a los valores almacenados en el arreglo universidad
     *
     * @return universidad
     */
    public String[] getUniversidad() {
        return universidad;
    }

    /**
     * Método para almacenar valores en el arreglo universidad
     *
     * @param universidad
     */
    public void setUniversidad(String[] universidad) {
        this.universidad = universidad;
    }

    /**
     * Método para llamar a los valores almacenados en el arreglo celular
     *
     * @return celular
     */
    public String[] getCelular() {
        return celular;
    }

    /**
     * Método para almacenar valores en el arreglo celular
     *
     * @param celular
     */
    public void setCelular(String[] celular) {
        this.celular = celular;
    }

    /**
     * Método para llamar a los datos almacenados en la variable salida
     *
     * @return salida
     */
    public String getSalida() {
        return salida;
    }

    /**
     * Método para concatenar datos
     */
    public void presentar() {
        salida = "";
        for (int i = 0; i < nombre.length; i++) {
            salida = String.format("%sNombre: %s\nEdad: %d\nUniversidad: %s\nCelular: %s\n\n", salida, nombre[i],
                    edad[i], universidad[i], celular[i]);
        }
    }
}
