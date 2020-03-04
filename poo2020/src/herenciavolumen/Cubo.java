package herenciavolumen;

public class Cubo extends Volumen {

    /**
     * Método constructor para la clase Cubo
     *
     * @param nombre
     * @param arista
     */
    public Cubo(String nombre, double arista) {
        this.nombre = nombre;
        this.aristaCubo = arista;
    }

    // Atributos propios de la clase Cubo
    private double aristaCubo;
    private double areaCubo;

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
     * Método para llamar al valor almacenado en la variable aristaCubo
     *
     * @return areaCubo
     */
    public double getVolumenCubo() {
        return areaCubo;
    }

    /**
     * Método para calcular el área
     */
    public void calcularVolumenCubo() {
        areaCubo = Math.pow(getAristaCubo(), 3);
    }

}
