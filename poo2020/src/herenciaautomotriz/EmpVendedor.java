package herenciaautomotriz;

public class EmpVendedor extends Empleado {

    /**
     * Método constructor para la clase EmpVendedor
     *
     * @param rfc
     * @param nombre
     * @param dpto
     * @param puesto
     * @param valVenta
     */
    public EmpVendedor(String rfc, String nombre, String dpto, String puesto, double valVenta) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.dpto = dpto;
        this.puesto = puesto;
        this.valVenta = valVenta;
    }

    // Atributos propios de la clase EmpAdmvo
    private double valVenta;
    private double quincena;

    /**
     * Método para llamar al valor almacenado en la variable valVenta
     *
     * @return valVenta
     */
    public double getValVenta() {
        return valVenta;
    }

    /**
     * Método para almacenar un valor en la variable valVenta
     *
     * @param valVenta
     */
    public void setValVenta(double valVenta) {
        this.valVenta = valVenta;
    }

    /**
     * Método para llamar al valor almacenado en la variable quincena
     *
     * @return quincena
     */
    public double getQuincena() {
        return quincena;
    }

    /**
     * Método para cálcular el sueldo quincenal.
     * 400 -> Representa el salario mínimo
     */
    public void calcularQuincena() {
        quincena = 400 + (getValVenta() * 0.02) ;
    }

}
