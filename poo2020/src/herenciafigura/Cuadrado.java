package herenciafigura;

public class Cuadrado extends Figura {

    /**
     * Constructor para la clase Cuadrado
     *
     * @param nombre
     * @param ladoCuad
     */
    public Cuadrado(String nombre, double ladoCuad) {
        this.nombre = nombre;
        this.ladoCuad = ladoCuad;
    }

    // Atributos propios de la clase Cuadrado
    private double ladoCuad;
    private double areaCuad;

    /**
     * Método para llamar al valor almacenado en la variable ladoCuad
     *
     * @return ladoCuad
     */
    public double getLadoCuad() {
        return ladoCuad;
    }

    /**
     * Método para almacenar un valor en la variable ladoCuad
     *
     * @param ladoCuad
     */
    public void setLadoCuad(double ladoCuad) {
        this.ladoCuad = ladoCuad;
    }

    /**
     * Método para llamar al valor almacenado en la variable areaCuad
     *
     * @return areaCuad
     */
    public double getAreaCuad() {
        return areaCuad;
    }

    /**
     * Método para calcular el área del cuadrado
     */
    public void calcularAreaCuad() {
        areaCuad = Math.pow(getLadoCuad(), 2);
    }

}
