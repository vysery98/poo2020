package herenciadeudores;

public class PrestamoAuto extends ClienteDeudor {

    /**
     * Método constructor
     *
     * @param name
     * @param num_cliente
     * @param num_cuenta
     * @param capital
     * @param tasa_anual
     * @param plazo
     */
    public PrestamoAuto(String name, String num_cliente, String num_cuenta, double capital, double tasa_anual, double plazo) {
        this.name = name;
        this.capital_prestado = capital;
        this.num_cliente = num_cliente;
        this.num_cuenta = num_cuenta;
        this.plazo = plazo;
        this.tasa_anual = tasa_anual;
    }

    /**
     * Método para calcular el Interés
     *
     * @return interes
     */
    public double calcular_inte_adeudado() {
        double interes = (capital_prestado * (tasa_anual / 100));
        return interes;
    }

    /**
     * Método para el informe | salida
     *
     * @return salida
     */
    public String presentar_informe() {
        String salida = "" + num_cliente + "   " + name + "   " + num_cuenta + "" +
                "       " + calcular_inte_adeudado() + "\n";
        return salida;
    }
}
