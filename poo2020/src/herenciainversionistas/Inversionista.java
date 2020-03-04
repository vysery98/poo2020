package herenciainversionistas;

public class Inversionista {

    // Atributos comunes para todas las clases
    protected String nroCliente;
    protected String nameCliente;
    protected String nroCuenta;
    protected double capital;
    protected double interes;
    protected int plazo;

    /**
     * Método para llamar al valor almacenado en la variable nroCliente
     *
     * @return nroCliente
     */
    public String getNroCliente() {
        return nroCliente;
    }

    /**
     * Método para almacenar un valor en la variable nroCliente
     *
     * @param nroCliente
     */
    public void setNroCliente(String nroCliente) {
        this.nroCliente = nroCliente;
    }

    /**
     * Método para llamar al valor almacenado en la variable nameCliente
     *
     * @return nameCliente
     */
    public String getNameCliente() {
        return nameCliente;
    }

    /**
     * Método para almacenar un valor en la variable nameCliente
     *
     * @param nameCliente
     */
    public void setNameCliente(String nameCliente) {
        this.nameCliente = nameCliente;
    }

    /**
     * Método para llamar al valor almacenado en la variable nroCuenta
     *
     * @return nroCuenta
     */
    public String getNroCuenta() {
        return nroCuenta;
    }

    /**
     * Método para almacenar un valor en la variable nroCuenta
     *
     * @param nroCuenta
     */
    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    /**
     * Método para llamar al valor almacenado en la variable getCapital
     *
     * @return capital
     */
    public double getCapital() {
        return capital;
    }

    /**
     * Método para llamar al valor almacenado en la variable capital
     *
     * @param capital
     */
    public void setCapital(double capital) {
        this.capital = capital;
    }

    /**
     * Método para llamar al valor almacenado en la variable capital
     *
     * @return interes
     */
    public double getInteres() {
        return interes;
    }

    /**
     * Método para almacenar un valor en la variable interes
     *
     * @param interes
     */
    public void calcularInteres(double interes) {
        this.interes = interes;
    }

    /**
     * Método para llamar al valor almacenado en la variable plazo
     *
     * @return plazo
     */
    public int getPlazo() {
        return plazo;
    }

    /**
     * Método para almacenar un valor en la variable plazo
     *
     * @param plazo
     */
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

}
