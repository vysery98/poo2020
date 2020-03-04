package herenciainversionistas;

public class CuentaMaestra extends Inversionista {

    /**
     * Método constructor para la clase CuentaAhorro
     *
     * @param nroCliente
     * @param nameCliente
     * @param nroCuenta
     * @param capital
     * @param interes
     * @param plazo
     */
    public CuentaMaestra(String nroCliente, String nameCliente, String nroCuenta, double capital, double interes, int plazo) {
        this.nroCliente = nroCliente;
        this.nameCliente = nameCliente;
        this.nroCuenta = nroCuenta;
        this.capital = capital;
        this.interes = interes;
        this.plazo = plazo;
    }

    // Atributos de la clase CuentaAhorro
    private double intGanado;

    /**
     * Método para llamar al valor almacenado en la variable intGanado
     *
     * @return intGanado
     */
    public double getIntGanado() {
        return intGanado;
    }

    /**
     * Método para calcular el Interes ganado
     */
    public void calcularIntGanado() {
        intGanado = capital * (interes / 100) * plazo;
    }

}
