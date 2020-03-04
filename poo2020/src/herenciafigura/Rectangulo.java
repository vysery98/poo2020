package herenciafigura;

public class Rectangulo extends Figura {

    /**
     * Constructor para la clase Rectangulo
     *
     * @param nombre
     * @param baseRecta
     * @param alturaRecta
     */
    public Rectangulo(String nombre, double baseRecta, double alturaRecta) {
        this.nombre = nombre;
        this.baseRecta = baseRecta;
        this.alturaRecta = alturaRecta;
    }

    // Atributos propios de la clase Cuadrado
    private double baseRecta;
    private double alturaRecta;
    private double areaRecta;

    /**
     * Método para llamar al valor almacenado en la variable baseRecta
     *
     * @return baseRecta
     */
    public double getBaseRecta() {
        return baseRecta;
    }

    /**
     * Método para almacenar un valor en la variable baseRecta
     *
     * @param baseRecta
     */
    public void setBaseRecta(double baseRecta) {
        this.baseRecta = baseRecta;
    }

    /**
     * Método para llamar al valor almacenado en la variable alturaRecta
     *
     * @return alturaRecta
     */
    public double getAlturaRecta() {
        return alturaRecta;
    }

    /**
     * Método para almacenar un valor en la variable alturaRecta
     *
     * @param alturaRecta
     */
    public void setAlturaRecta(double alturaRecta) {
        this.alturaRecta = alturaRecta;
    }

    /**
     * Método para llamar al valor almacenado en la variable areaRecta
     *
     * @return areaRecta
     */
    public double getAreaRecta() {
        return areaRecta;
    }

    /**
     * Método para calcular el área
     */
    public void calcularAreaRecta() {
        areaRecta = (getBaseRecta() * getAlturaRecta());
    }

}
