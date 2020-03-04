package herenciafigura;

public class Triangulo extends Figura {

    /**
     * Constructor para la clase Triangulo
     *
     * @param nombre
     * @param baseTria
     * @param alturaTria
     */
    public Triangulo(String nombre, double baseTria, double alturaTria) {
        this.nombre = nombre;
        this.baseTria = baseTria;
        this.alturaTria = alturaTria;
    }

    // Atributos propios de la clase Cuadrado
    private double baseTria;
    private double alturaTria;
    private double areaTria;

    /**
     * Método para llamar al valor almacenado en la variable baseTria
     *
     * @return baseTria
     */
    public double getBaseTria() {
        return baseTria;
    }

    /**
     * Método para almacenar un valor en la variable baseTria
     *
     * @param baseTria
     */
    public void setBaseTria(double baseTria) {
        this.baseTria = baseTria;
    }

    /**
     * Método para llamar al valor almacenado en la variable alturaTria
     *
     * @return alturaTria
     */
    public double getAlturaTria() {
        return alturaTria;
    }

    /**
     * Método para almacenar un valor en la variable alturaTria
     *
     * @param alturaTria
     */
    public void setAlturaTria(double alturaTria) {
        this.alturaTria = alturaTria;
    }

    /**
     * Método para llamar al valor almacenado en la variable areaTria
     *
     * @return areaTria
     */
    public double getAreaTria() {
        return areaTria;
    }

    /**
     * Método para calcular el área
     */
    public void calcularAreaTria() {
        areaTria = (getBaseTria() * getAlturaTria()) / 2;
    }

}
