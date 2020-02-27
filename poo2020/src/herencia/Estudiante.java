package herencia;

/**
 * Clase que hereda de la clase Persona.
 * Contendrá todos los atributos y métodos definidos en Persona.
 */
public class Estudiante extends Persona {

    /**
     * Constructor para la clase Estudiante
     *
     * @param carrera
     * @param nombre
     * @param identificacion
     * @param estado_civil
     * @param fecha_nac
     */
    public Estudiante(String carrera, String nombre, String identificacion, String estado_civil, String fecha_nac) {
        this.carrera = carrera;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nac;
    }

    // Atributos propios de la clase Estudiante
    private String carrera;

    /**
     * Método para llamar al valor almacenado en la variable Carrera
     *
     * @return carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Método para almacenar un valor en la variable Carrera
     *
     * @param carrera
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * Método para matricularse
     */
    public void matricular() {
        System.out.println("Método para matricular.");
    }


    /**
     * Método para aprender
     */
    public void aprender() {
        System.out.println("Método para aprender.");
    }
}
