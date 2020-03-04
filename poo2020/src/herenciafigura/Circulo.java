package herenciafigura;

public class Circulo extends Figura {

    /**
     * Constructor para la clase Rectangulo
     *
     * @param nombre
     * @param radioCirc
     */
    public Circulo(String nombre, double radioCirc) {
        this.nombre = nombre;
        this.radioCirc = radioCirc;
    }

    // Atributos propios de la clase Cuadrado
    private double radioCirc;
    private double areaCirc;

    /**
     * Método para llamar al valor almacenado en la variable radioCirc
     *
     * @return radioCirc
     */
    public double getRadioCirc() {
        return radioCirc;
    }

    /**
     * Método para almacenar un valor en la variable radioCirc
     *
     * @param radioCirc
     */
    public void setRadioCirc(double radioCirc) {
        this.radioCirc = radioCirc;
    }

    /**
     * Método para llamar al valor almacenado en la variable areaCirc
     *
     * @return areaCirc
     */
    public double getAreaCirc() {
        return areaCirc;
    }

    /**
     * Método para clacular el área
     */
    public void calcularAreaCirc() {
        areaCirc = Math.PI * Math.pow(getRadioCirc(), 2);
    }

}
