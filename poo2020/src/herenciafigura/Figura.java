package herenciafigura;

public class Figura {

    // Atributos comunes para todas las clases
    protected String nombre;

    /**
     * Método para llamar al dato almacenado en la variable nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para almacenar un valor en la variable nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
