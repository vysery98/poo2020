package polimorfismo_figura;

public class Cuadrado3 extends Figura3 {

    // Atributos propios de la clase Cuadrado3
    private double ladoCuad;

    // También se extienden los atributos de la clase padre

    /**
     * Método para establecer el valor de un lado del cuadrado
     *
     * @param ladoCuad
     */
    public void setLadoCuad(double ladoCuad) {
        this.ladoCuad = ladoCuad;
    }

    /**
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularArea() {
        area = Math.pow(ladoCuad, 2);
    }

}
