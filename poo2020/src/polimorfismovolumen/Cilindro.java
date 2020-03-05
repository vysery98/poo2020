package polimorfismovolumen;

public class Cilindro extends Figura {

    // Atributos propios de la clase Cilindro
    private double radioCil;
    private double alturaCil;

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
    public void setRadioCil(double radioCil) {
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
     * Implementación del método abstracto que
     * fue implementado previamente en la clase
     * padre
     */
    @Override
    public void calcularVolumen() {
        volumen = Math.PI * Math.pow(getRadioCil(), 2) * getAlturaCil();
    }

}
