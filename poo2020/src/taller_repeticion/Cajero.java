package taller_repeticion;

/**
 * Integrantes:
 * Jorge Flores
 * Luis Quizhpe
 * Brandon Vega
 */
public class Cajero {
    private int opcion;
    private String nombre;
    private double deposito;
    private double retiro;
    private double saldo;
    private String reporte;

    /**
     * Método para llamar al valor almacenado en la variable opcion
     *
     * @return opcion
     */
    public int getOpcion() {
        return opcion;
    }

    /**
     * Método para asignar un valor a la variable nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para llamar al valor almacenado en la variable nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para asignar un valor a la variable opcion
     *
     * @param opcion
     */
    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    /**
     * Método para llamar al valor almacenador en la variable deposito
     *
     * @return deposito
     */
    public double getDeposito() {
        return deposito;
    }

    /**
     * Método para asignar un valor a la variable deposito
     *
     * @param deposito
     */
    public void setDeposito(double deposito) {
        this.deposito = deposito;
        saldo = saldo + deposito;
    }

    /**
     * Método para llamar al valor almacenado en la variable retiro
     *
     * @return retiro
     */
    public double getRetiro() {
        return retiro;
    }

    /**
     * Método para establecer un valor en la variable retiro
     *
     * @param retiro
     */
    public void setRetiro(double retiro) {
        this.retiro = retiro;
        saldo = saldo - retiro;
    }

    /**
     * Método llamar al valor almacenado en la variable saldo
     *
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para asignar un valor a la variable saldo
     *
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método para llamar al valor almacenado en la variable reporte
     *
     * @return reporte
     */
    public String getReporte() {
        return reporte;
    }

    /**
     * Método para generar un reporte según la opción seleccionada
     * por el usuario
     */
    public void setReporte() {
        switch (getOpcion()) {
            case 1:
                reporte = "Se realizó un depósito de: $" + getDeposito();
                break;
            case 2:
                reporte = "Se realizó un retiro de: $" + getRetiro();
                break;
            case 3:
                reporte = "Su saldo es de: $" + saldo;
                break;
            default:
                reporte = "Opcion invalida.";
                break;
        }
    }
}

