package polimorfismo_figura;

public class Circulo3 extends Figura3 {

    // Atributos propios de la clase Circulo3
    private double radioCirc;

    // También se extienden los atributos de la clase padre

    /**
     * Método para establecer el valor del radio del círculo
     *
     * @param radioCirc
     */
    public void setRadioCirc(double radioCirc) {
        this.radioCirc = radioCirc;
    }

    /**
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularArea() {
        area = Math.PI * Math.pow(radioCirc, 2);
    }

}
