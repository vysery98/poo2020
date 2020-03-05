package polimorfismovolumen;

public class Cubo extends Figura {

    // Atributos propios de la clase Cubo
    private double aristaCubo;

    /**
     * Método para llamar al valor almacenado en la variable aristaCubo
     *
     * @return aristaCubo
     */
    public double getAristaCubo() {
        return aristaCubo;
    }

    /**
     * Método para almacenar un valor en la variable aristaCubo
     *
     * @param aristaCubo
     */
    public void setAristaCubo(double aristaCubo) {
        this.aristaCubo = aristaCubo;
    }

    /**
     * Implementación del método abstracto que
     * fue implementado previamente en la clase
     * padre
     */
    @Override
    public void calcularVolumen() {
        volumen = Math.pow(getAristaCubo(), 3);
    }
}
