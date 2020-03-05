package polimorfismovolumen;

public class Cono extends Figura {

    // Atributos propios de la clase Cono
    private double radioCono;
    private double alturaCono;

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
     * Implementación del método abstracto que
     * fue implementado previamente en la clase
     * padre
     */
    @Override
    public void calcularVolumen() {
        volumen = (Math.PI * (getRadioCono() * getRadioCono()) * getAlturaCono()) / 3;
    }
}
