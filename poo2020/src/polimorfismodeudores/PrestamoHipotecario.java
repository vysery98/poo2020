package polimorfismodeudores;

public class PrestamoHipotecario extends ClienteDeudor {

    /**
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularInteresPaga() {
        interesPaga = (capital_prestado * (tasa_anual / 100));
    }

}
