package taller_repeticion;

/**
 * Integrantes:
 * Jorge Flores
 * Luis Quizhpe
 * Brandon Vega
 */
public class Cajero {
    private int opcion;
    private double deposito;
    private double retiro;
    private double saldo;
    private String reporte;

    /**
     * Metodo para obtener la opcion
     * @return opcion
     */
    public int getOpcion() {
        return opcion;
    }

    /**
     * Metodo para actualizar la opcion
     * @param opcion
     */
    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    /**
     * Metodo para obtener el deposito
     * @return deposito
     */
    public double getDeposito() {
        return deposito;
    }

    /**
     * Metodo para actualizar el deposito
     * @param deposito
     */
    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    /**
     * Metodo para obtener el retiro
     * @return retiro
     */
    public double getRetiro() {
        return retiro;
    }

    /**
     * Metodo para actualizar el retiro
     * @param retiro
     */
    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    /**
     * Metodo para obtener el saldo
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo para actualizar el saldo
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Metodo para obtener el reporte que se mostrara al usuario
     * @return reporte
     */
    public String getReporte() {
        String reporte;
        switch (getOpcion()) {
            case 1:
                reporte = "Se realizo un deposito de: " + getDeposito();
                break;
            case 2:
                reporte = "Se realizo un retiro de: " + getRetiro();
                break;
            case 3:
                reporte = "Su saldo es de: " + saldo;
                break;
            default:
                reporte = "Opcion invalida";
                break;
        }
        return reporte;
    }
}
