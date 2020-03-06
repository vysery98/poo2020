package polimorfismodeudores;

public abstract class ClienteDeudor {

    // Atributos comunes para todas las clases
    protected String name;
    protected String num_cliente;
    protected String num_cuenta;
    protected double capital_prestado;
    protected double tasa_anual;
    protected double plazo;
    protected double interesPaga;

    /**
     * Método para llamar al valor almacenado en la variable name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Método para almacenar un valor en la variable name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para llamar al valor almacenado en la variable num_cliente
     *
     * @return cum_cliente
     */
    public String getNum_cliente() {
        return num_cliente;
    }

    /**
     * Método para almacenar un valr en la variable num_cliente
     *
     * @param num_cliente
     */
    public void setNum_cliente(String num_cliente) {
        this.num_cliente = num_cliente;
    }

    /**
     * Método para llamar al valor almacenado en la variable num_cuenta
     *
     * @return num_cuenta
     */
    public String getNum_cuenta() {
        return num_cuenta;
    }

    /**
     * Método para almacenar un valor en la variable num_cuenta
     *
     * @param num_cuenta
     */
    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    /**
     * Método para llamar al valor almacenado en la variable capital_prestado
     *
     * @return capital_prestado
     */
    public double getCapital_prestado() {
        return capital_prestado;
    }

    /**
     * Método para almacenar un valor en la variable capital_prestado
     *
     * @param capital_prestado
     */
    public void setCapital_prestado(double capital_prestado) {
        this.capital_prestado = capital_prestado;
    }

    /**
     * Método para llamar al valor almacenado en la variable tasa_anual
     *
     * @return tasa_anual
     */
    public double getTasa_anual() {
        return tasa_anual;
    }

    /**
     * Método para almacenar un valor en la variable tasa_anual
     *
     * @param tasa_anual
     */
    public void setTasa_anual(double tasa_anual) {
        this.tasa_anual = tasa_anual;
    }

    /**
     * Método para llamar al valor almacenado en la variable plazo
     *
     * @return plazo
     */
    public double getPlazo() {
        return plazo;
    }

    /**
     * Método para almacenar un valor en la variable plazo
     *
     * @param plazo
     */
    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }

    /**
     * Método para devolver el valor del interes calculado
     *
     * @return interesPaga
     */
    public double getInteresPaga() {
        return interesPaga;
    }

    /**
     * Método abstracto para el cálculo del interés3
     */
    public abstract void calcularInteresPaga();

}
