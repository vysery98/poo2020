package polimorfismoinversionistas;

public class CuentaAhorro extends Inversionista {

    /**
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularIntGanado() {
        intGanado = capital * (interes / 100) * plazo;
    }

}
