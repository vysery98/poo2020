package herencia_empleado;

public class EmpleadoAsalariado extends Empleado {

    /**
     * Constructor para la clase EmpleadoAsalariado
     *
     * @param nombre
     * @param cargo
     * @param dependencia
     * @param valor_mensual
     */
    public EmpleadoAsalariado(String nombre, String cargo, String dependencia, double valor_mensual) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
        this.valor_mensual = valor_mensual;
    }

    // Atributos propios de la clase EmpleadoAsalariado
    private double valor_mensual;

    /**
     * Método para llamar al valor almacenado en la variable valor_mensual
     *
     * @return valor_mensual
     */
    public double getValor_mensual() {
        return valor_mensual;
    }

    /**
     * Método para establecer un valor en la variable valor_mensual
     *
     * @param valor_mensual
     */
    public void setValor_mensual(double valor_mensual) {
        this.valor_mensual = valor_mensual;
    }

    /**
     * Método para calcular el sueldo mensual del empleado
     */
    public void calcularSueldoMensual() {
        System.out.print(getValor_mensual());
    }
}
