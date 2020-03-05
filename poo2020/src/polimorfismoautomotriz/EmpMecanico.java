package polimorfismoautomotriz;

public class EmpMecanico extends Empleado {

    // Atributos propios de la clase EmpAdmvo
    private double precioT;

    /**
     * Método para llamar al valor almacenado en la variable precioT
     *
     * @return precioT
     */
    public double getPrecioT() {
        return precioT;
    }

    /**
     * Método para almacenar un valor en la variable precioT
     *
     * @param precioT
     */
    public void setPrecioT(double precioT) {
        this.precioT = precioT;
    }

    /**
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularQuincena() {
        quincena = getPrecioT() * 0.04;
    }

}
