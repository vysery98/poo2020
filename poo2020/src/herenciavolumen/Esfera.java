package herenciavolumen;

public class Esfera extends Volumen {

    /**
     * Método constructor para la clase Esfera
     *
     * @param nombre
     * @param r
     */
    public Esfera(String nombre, double r) {
        this.nombre = nombre;
        this.radioEsf = r;
    }

    // Atributos propios de la clase Esfera
    private double radioEsf;
    private double areaEsf;

    /**
     * Método para llamar al valor almacenado en la variable radioEsf
     *
     * @return radioEsf
     */
    public double getRadioEsf() {
        return radioEsf;
    }

    /**
     * Método para almacenar un valor en la variable radioEsf
     *
     * @param radioEsf
     */
    public void setRadioEsf(double radioEsf) {
        this.radioEsf = radioEsf;
    }

    /**
     * Método para llamar al valor almacenado en la variable areaEsf
     *
     * @return areaEsf
     */
    public double getVolumenEsf() {
        return areaEsf;
    }

    /**
     * Método para calcular el área
     */
    public void calcularVolumenEsf() {
        areaEsf = (4 / 3) * Math.PI * Math.pow(getRadioEsf(), 3);
    }

}
