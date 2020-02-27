package herencia;

import java.util.Date;

/**
 * Clase principal o superclase
 */
public class Persona {

    // Atributos comúnes para todas las clases
    protected String nombre;
    protected String identificacion;
    protected String estado_civil;
    protected String fecha_nacimiento;

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
     * Método para llamar al valor almacenado en la variable identificacion
     *
     * @return identificacion
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Método para almacenar un valor en la variable identificación
     *
     * @param identificacion
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Método para llamar al valor almacenado en la variable estado_civil
     *
     * @return
     */
    public String getEstado_civil() {
        return estado_civil;
    }

    /**
     * Método para almacenar un valor en la variable estado_civil
     *
     * @param estado_civil
     */
    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    /**
     * Método para llamar al valor almacenado en la variable fecha_nacimiento
     *
     * @return fecha_nacimiento
     */
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * Método para almacenar un valor en la variable fecha_nacimiento
     *
     * @param fecha_nacimiento
     */
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * Método para la asistencia al plantel
     */
    public void venir_univ() {
        System.out.println("Método para venir a la Universidad.");
    }
}
