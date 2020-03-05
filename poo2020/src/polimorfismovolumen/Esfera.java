package polimorfismovolumen;

public class Esfera extends Figura {

    // Atributos propios de la clase Esfera
    private double radioEsf;

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
     * Implementación del método abstracto que
     * fue implementado previamente en la clase
     * padre
     */
    @Override
    public void calcularVolumen() {
        volumen = (4 / 3) * Math.PI * Math.pow(getRadioEsf(), 3);
    }
}
