package herencia;

/**
 * Clase que hereda de la clase Persona.
 * Contendrá todos los atributos y métodos definidos en Persona.
 */
public class Docente extends Persona {

    /**
     * Constructor para la clase Docente
     *
     * @param area
     * @param nombre
     * @param identificacion
     * @param estado_civil
     * @param fecha_nac
     */
    public Docente(String area, String nombre, String identificacion, String estado_civil, String fecha_nac) {
        this.area = area;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nac;
    }

    // Atributos propios de la clase Docente
    private String area;

    /**
     * Método para llamar al valor almacenado en la variable area
     * @return area
     */
    public String getArea() {
        return area;
    }

    /**
     * Método para establecer un valor en la variable area
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * Método para enseñar
     */
    public void enseniar() {
        System.out.println("Método para enseñar.");
    }

    /**
     * Método para calificar
     */
    public void calificar() {
        System.out.println("Método para calificar.");
    }

}
