package polimorfismo_figura;

public class Triangulo3 extends Figura3 {

    // Atributos propios de la clase Triangulo3
    private double baseTria;
    private double alturaTria;

    // También se extienden los atributos de la clase padre

    /**
     * Método para establecer el valor de la base del Triángulo
     *
     * @param baseTria
     */
    public void setBase_tria(double baseTria) {
        this.baseTria = baseTria;
    }

    /**
     * Método para establecer el valor de la altura del Triángulo
     *
     * @param alturaTria
     */
    public void setAlturaTria(double alturaTria) {
        this.alturaTria = alturaTria;
    }

    /**
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularArea() {
        area = baseTria * alturaTria;
    }

}
