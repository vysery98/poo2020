package herenciavolumen;

public class Cono extends Volumen {

    /**
     * Método constructor para la clase Cono
     *
     * @param nombre
     * @param r
     * @param h
     */
    public Cono(String nombre, double r, double h) {
        this.nombre = nombre;
        this.radioCono = r;
        this.alturaCono = h;
    }

    // Atributos propios de la clase Cono
    private double radioCono;
    private double alturaCono;
    private double areaCono;

    /**
     * Método para llamar al valor almacenado en la variable radioCono
     *
     * @return radioCono
     */
    public double getRadioCono() {
        return radioCono;
    }

    /**
     * Método para almacenar un valor en la variable radioCono
     *
     * @param radioCono
     */
    public void setRadioCono(double radioCono) {
        this.radioCono = radioCono;
    }

    /**
     * Método para llamar al valor almacenado en la variable alturaCono
     *
     * @return alturaCono
     */
    public double getAlturaCono() {
        return alturaCono;
    }

    /**
     * Método para almacenar un valor en la variable alturaCono
     *
     * @param alturaCono
     */
    public void setAlturaCono(double alturaCono) {
        this.alturaCono = alturaCono;
    }

    /**
     * Método para llamar al valor almacenado en la variable areaCil
     *
     * @return areaCil
     */
    public double getVolumenCono() {
        return areaCono;
    }

    /**
     * Método para calcular el área
     */
    public void calcularVolumenCono() {
        areaCono = (Math.PI * (getRadioCono() * getRadioCono()) * getAlturaCono()) / 3;
    }

}
