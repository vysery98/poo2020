package polimorfismoautomotriz;

public class EmpAdmvo extends Empleado {

    // Atributos propios de la clase EmpAdmvo
    private double sueldo;

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
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularQuincena() {
        quincena = getSueldo() / 2;
    }
}
