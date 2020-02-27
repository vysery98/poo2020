package herencia_empleado;

/**
 * Clase que hereda de la clase Empleado
 * Contendrá todos los atributos y métodos definidos en Empleado.
 */
public class EmpleadoPorHora extends Empleado {

    /**
     * Constructor para la clase Empleado por Hora
     *
     * @param nombre
     * @param cargo
     * @param dependencia
     * @param hora
     * @param valorHora
     */
    public EmpleadoPorHora(String nombre, String cargo, String dependencia, int hora, double valorHora) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
        this.hora = hora;
        this.valorHora = valorHora;
    }

    // Atributos propios de la clase EmpleadoPorHora
    private int hora;
    private double valorHora;

    /**
     * Método para llamar al valor almacenado en la variable hora
     *
     * @return hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * Método para establecer un valor en la variable hora
     *
     * @param hora
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * Método para llamar al valor almacenado en la variable valorHora
     *
     * @return valorHora
     */
    public double getValorHora() {
        return valorHora;
    }

    /**
     * Método para establecer un valor en la variable valorHora
     *
     * @param valorHora
     */
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    /**
     * Método para calcular el valor de un empleado que trabaje por horas
     */
    public void calcularSueldoPorHoras() {
        double sueldo;
        sueldo = hora * valorHora;
        System.out.print(sueldo);
    }
}
