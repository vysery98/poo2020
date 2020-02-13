package disenio_seleccion;

public class Empleado {
    private String nombre;
    private int hTrabajadas;
    private double vHora;

    /**
     * Método para establecer el valor de la variable nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para establecer el valor de la variable hTrabajadas
     *
     * @param hTrabajadas
     */
    public void sethTrabajadas(int hTrabajadas) {
        this.hTrabajadas = hTrabajadas;
    }

    /**
     * Método para establecer el valor de la variable vHora
     *
     * @param vHora
     */
    public void setvHora(double vHora) {
        this.vHora = vHora;
    }

    /**
     * Método para establecer el cálculo del sueldo en la variable sueldo
     * Si el número de horas trabajadas es mayor a 40, entonces las horas dexcedentes de 40, se pagarán al doble.
     *
     * @return sueldo
     */
    public double calcularSueldo() {
        double sueldo;
        if (hTrabajadas <= 40) {
            sueldo = hTrabajadas * vHora;
        } else {
            sueldo = (40 * vHora) + (hTrabajadas - 40) * (vHora * 2);
        }
        return sueldo;
    }

    /**
     * Método para retornar el valor almacenado en la variable nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

}
