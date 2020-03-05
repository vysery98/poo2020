package polimorfismoautomotriz;

public abstract class Empleado {

    // Atributos comunes para todas las clases
    protected String rfc;
    protected String nombre;
    protected String dpto;
    protected String puesto;
    protected double quincena;

    /**
     * Método para llamar al valor almacenado en la variable rfc
     *
     * @return rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Método para almacenar un valor en la variable rfc
     *
     * @param rfc
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
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
     * Método para almacenar un valor en la variable nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para llamar al valor almacenado en la variable dpto
     *
     * @return dpto
     */
    public String getDpto() {
        return dpto;
    }

    /**
     * Método para almacenar un valor en la variable dpto
     *
     * @param dpto
     */
    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    /**
     * Método para llamar al valor almacenado en la variable puesto
     *
     * @return puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * Método para almacenar un valor en la variable puesto
     *
     * @param puesto
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * Método para llamar al valor almacenado en el
     * cálculo de la Quincena
     *
     * @return quincena
     */
    public double getQuincena() {
        return quincena;
    }

    /**
     * Método abstracto para calcular la quincena
     */
    public abstract void calcularQuincena();

}
