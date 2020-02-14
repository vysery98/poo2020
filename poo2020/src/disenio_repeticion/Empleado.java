package disenio_repeticion;

public class Empleado {

    // Declaración de datos
    private int horasTrabajadas;
    private double valorHora;
    private String nombre;
    private double sueldo;

    // Métodos constructores
    public Empleado(String nombre, int horasTrabajadas, double vHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public Empleado(String nombre, int horasTrabajadas) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * Método para llamar al valor almacenado en la variable horasTrabajadas
     *
     * @return horasTrabajadas
     */
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    /**
     * Método para asignar un valor en la variable horasTrabajadas
     *
     * @param horasTrabajadas
     */
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
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
     * Método para asignar un valor en la variable horasTrabajadas
     *
     * @param valorHora
     */
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
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
     * Método para asignar un valor en la variable nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para calcular el sueldo de un empleado
     */
    public void calcularSueldo() {        if (horasTrabajadas <= 40) {
            sueldo = horasTrabajadas * valorHora;
        } else {
            sueldo = (40 * valorHora) + (horasTrabajadas - 40) * (valorHora * 2);
        }
    }

    /**
     * Método para llamar al valor almacenado en la variable sueldo
     * @return sueldo
     */
    public double getSueldo() {
        return sueldo;
    }
}
