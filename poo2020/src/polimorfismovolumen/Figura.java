package polimorfismovolumen;

public abstract class Figura {

    // Atributos comunes para todas las clases
    protected String nombre;
    protected double volumen;

    /**
     * Método para llamar al valor almacenado en la variable nombre
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

    /**
     * Método abstracto, que será empleado
     * dentro de las clases hijas
     */
    public abstract void calcularVolumen();

    /**
     * Método para devolver el valor del cálculo del volumen
     *
     * @return volumen
     */
    public double getVolumen() {
        return volumen;
    }
}
