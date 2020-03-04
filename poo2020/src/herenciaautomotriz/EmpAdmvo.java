package herenciaautomotriz;

public class EmpAdmvo extends Empleado {

    /**
     * Método constructor para la clase EmpAdmvo
     *
     * @param rfc
     * @param nombre
     * @param dpto
     * @param puesto
     * @param sueldo
     */
    public EmpAdmvo(String rfc, String nombre, String dpto, String puesto, double sueldo) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.dpto = dpto;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    // Atributos propios de la clase EmpAdmvo
    private double sueldo;
    private double quincena;

    /**
     * Método para llamar al valor almacenado en la variable sueldo
     *
     * @return sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Método para almacenar un valor en la variable sueldo
     *
     * @param sueldo
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
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
        quincena = getSueldo() / 2;
    }
}
