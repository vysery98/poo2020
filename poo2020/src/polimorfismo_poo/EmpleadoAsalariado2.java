package polimorfismo_poo;

public class EmpleadoAsalariado2 extends Empleado12 {

    // Atributos propios de la clase EmpleadoPorHoras2
    private double sueldo_mensual;

    // También se extienden los atributos de la clase padre
    public double getSueldo_mensual() {
        return sueldo_mensual;
    }

    public void setSueldo_mensual(double sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }

    /**
     * Implementación del método abstracto que fue
     * definido en la clase padre
     */
    @Override
    public void calcularSueldoQna() {
        sueldoQna = getSueldo_mensual() / 2;
    }

}
