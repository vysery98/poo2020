package herencia_empleado;

public class Empleado {

    // Atributos comunes para todas las clases
    protected String nombre;
    protected String cargo;
    protected String dependencia;

    /**
     * Método para llamar al valor almacenado en la variable nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer un valor en la variable nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para llamar al valor almacenado en la variable cargo
     *
     * @return cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Método para establecer un valor en la variable cargo
     *
     * @param cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Método para llamar al valor almacenado en la variable dependencia
     *
     * @return dependencia
     */
    public String getDependencia() {
        return dependencia;
    }

    /**
     * Método para establecer un valor en la variable dependencia
     *
     * @param dependencia
     */
    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
}
