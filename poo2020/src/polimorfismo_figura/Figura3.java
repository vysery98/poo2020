package polimorfismo_figura;

public abstract class Figura3 {

    // Definición de atributos protegidos para que puedan ser usados en otras clases
    protected String nomFigura;
    protected double area;

    /**
     * Método abstracto, que será empleado dentro
     * de las clases hijas.
     */
    public abstract void calcularArea();

    /**
     * Método para llamar al valor de la figura nomFigura
     *
     * @return nomFigura
     */
    public String getNomFigura() {
        return nomFigura;
    }

    /**
     * Método para establecer el nombre de la figura
     *
     * @param nomFigura
     */
    public void setNomFigura(String nomFigura) {
        this.nomFigura = nomFigura;
    }

    /**
     * Método para llamar al valor resultante del cálculo del área
     *
     * @return area
     */
    public double getArea() {
        return area;
    }

}
