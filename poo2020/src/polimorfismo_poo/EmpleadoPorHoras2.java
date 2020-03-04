package polimorfismo_poo;

public class EmpleadoPorHoras2 extends Empleado12 {

    // Atributos propios de la clase EmpleadoPorHoras2
    private double horas_trabajadas;
    private double cuota_por_hora;

    // También se extienden los atributos de la clase padre
    public void setHoras_trabajadas(double horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public void setCuota_por_hora(double cuota_por_hora) {
        this.cuota_por_hora = cuota_por_hora;
    }

    // También se extienen los métodos de la clase padre
    @Override
    public void calcularSueldoQna() {
        sueldoQna = horas_trabajadas * cuota_por_hora;
    }

}
