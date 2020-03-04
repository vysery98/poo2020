package herenciaautomotriz;

public class EmpMecanico extends Empleado {

    /**
     * Método constructor para la clase EmpMecanico
     *
     * @param rfc
     * @param nombre
     * @param dpto
     * @param puesto
     * @param precioT
     */
    public EmpMecanico(String rfc, String nombre, String dpto, String puesto, double precioT) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.dpto = dpto;
        this.puesto = puesto;
        this.precioT = precioT;
    }

    // Atributos propios de la clase EmpAdmvo
    private double precioT;
    private double quincena;

    /**
     * Método para llamar al valor almacenado en la variable precioT
     *
     * @return precioT
     */
    public double getPrecioT() {
        return precioT;
    }

    /**
     * Método para almacenar un valor en la variable precioT
     *
     * @param precioT
     */
    public void setPrecioT(double precioT) {
        this.precioT = precioT;
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
     */
    public void calcularQuincena() {
        quincena = getPrecioT() * 0.04;
    }

}
