package polimorfismo_figura;

public class Rectangulo3 extends Figura3 {

    // Atributos propios de la clase Rectangulo3
    private double baseRecta;
    private double alturaRecta;

    // También se extienden los atributos de la clase padre

    /**
     * Mpetodo para establecer el valor de la base del Rectángulo
     *
     * @param baseRecta
     */
    public void setBaseRecta(double baseRecta) {
        this.baseRecta = baseRecta;
    }

    /**
     * Método para establecer el valor del a altura del Rectángulo
     *
     * @param alturaRecta
     */
    public void setAlturaRecta(double alturaRecta) {
        this.alturaRecta = alturaRecta;
    }

    /**
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularArea() {
        area = baseRecta * alturaRecta;
    }


}
