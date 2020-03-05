package polimorfismoautomotriz;

public class EmpVendedor extends Empleado {

    // Atributos propios de la clase EmpAdmvo
    private double valVenta;

    /**
     * Método para llamar al valor almacenado en la variable valVenta
     *
     * @return valVenta
     */
    public double getValVenta() {
        return valVenta;
    }

    /**
     * Método para almacenar un valor en la variable valVenta
     *
     * @param valVenta
     */
    public void setValVenta(double valVenta) {
        this.valVenta = valVenta;
    }

    /**
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularQuincena() {
        quincena = 400 + (getValVenta() * 0.02);
    }

}
