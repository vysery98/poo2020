package herencia;

/**
 * Clase que hereda de la clase Persona.
 * Contendrá todos los atributos y métodos definidos en Persona.
 */
public class Administrativo extends Persona {

    /**
     * Constructor para la clase Administrativo
     *
     * @param dependencia
     * @param nombre
     * @param identificacion
     * @param estado_civil
     * @param fecha_nac
     */
    public Administrativo(String dependencia, String nombre, String identificacion, String estado_civil
            , String fecha_nac) {
        this.dependencia = dependencia;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nac;


    }

    // Atributos propios de la clase Administrativo
    private String dependencia;

    /**
     * Método para llamar al valor almacenado en la variable dependencia
     *
     * @return dependencia
     */
    public String getDependencia() {
        return dependencia;
    }

    /**
     * Método para almacenar un valor en la variable dependencia
     *
     * @param dependencia
     */
    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    /**
     * Método para gstionar los procesos
     */
    public void gestionar_procesos() {
        System.out.println("Método para gestionar los procesos.");
    }
}
