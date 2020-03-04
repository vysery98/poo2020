package herenciavolumen;

public class Cilindro extends Volumen {

    /**
     * Método constructor para la clase Cilindro
     *
     * @param nombre
     * @param r
     * @param h
     */
    public Cilindro(String nombre, double r, double h) {
        this.nombre = nombre;
        this.radioCil = r;
        this.alturaCil = h;
    }

    // Atributos propios de la clase Cilindro
    private double radioCil;
    private double alturaCil;
    private double areaCil;

    /**
     * Método para llamar al valor almacenado en la variable radioCil
     *
     * @return radioCil
     */
    public double getRadioCil() {
        return radioCil;
    }

    /**
     * Método para almacenar un valor en la variable radioCil
     *
     * @param radioCil
     */
    public void setRadioCubo(double radioCil) {
        this.radioCil = radioCil;
    }

    /**
     * Método para llamar al valor almacenado en la variable alturaCil
     *
     * @return alturaCil
     */
    public double getAlturaCil() {
        return alturaCil;
    }

    /**
     * Método para almacenar un valor en la variable alturaCil
     *
     * @param alturaCil
     */
    public void setAlturaCil(double alturaCil) {
        this.alturaCil = alturaCil;
    }

    /**
     * Método para llamar al valor almacenado en la variable areaCil
     *
     * @return areaCil
     */
    public double getVolumenCil() {
        return areaCil;
    }

    /**
     * Método para calcular el área
     */
    public void calcularVolumenCil() {
        areaCil = Math.PI * Math.pow(getRadioCil(), 2) * getAlturaCil();
    }

}
