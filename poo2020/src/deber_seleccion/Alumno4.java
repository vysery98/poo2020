package deber_seleccion;

public class Alumno4 {

    // declaración de datos
    private String nombreAlum;
    private double calif1;
    private double calif2;
    private double calif3;
    private double calif4;
    private double promedio;
    private String observacion;

    /**
     * Método para llamar al valor almacenado en la variable nombreAlum
     *
     * @return nombreAlum
     */
    public String getNombreAlum() {
        return nombreAlum;
    }

    /**
     * Método para establecer un valor a la variable nombreAlum
     *
     * @param nombreAlum
     */
    public void setNombreAlum(String nombreAlum) {
        this.nombreAlum = nombreAlum;
    }

    /**
     * Método para llamar al valor almacenado en la variable calif1
     *
     * @return calif1
     */
    public double getCalif1() {
        return calif1;
    }

    /**
     * Método para establecer un valor a la variable calif1
     *
     * @param calif1
     */
    public void setCalif1(double calif1) {
        this.calif1 = calif1;
    }

    /**
     * Método para llamar al valor almacenado en la variable calif2
     *
     * @return calif2
     */
    public double getCalif2() {
        return calif2;
    }

    /**
     * Método para establecer un valor a la variable calif2
     *
     * @param calif2
     */
    public void setCalif2(double calif2) {
        this.calif2 = calif2;
    }

    /**
     * Método para llamar al valor almacenado en la variable calif3
     *
     * @return calif3
     */
    public double getCalif3() {
        return calif3;
    }

    /**
     * Método para establecer un valor a la variable calif3
     *
     * @param calif3
     */
    public void setCalif3(double calif3) {
        this.calif3 = calif3;
    }

    /**
     * Método para llamar al valor almacenado en la variable calif4
     *
     * @return
     */
    public double getCalif4() {
        return calif4;
    }

    /**
     * Método para establecer un valor a la variable calif4
     *
     * @param calif4
     */
    public void setCalif4(double calif4) {
        this.calif4 = calif4;
    }

    /**
     * Método para llamar al valor almacenado en la variable promedio
     *
     * @return promedio
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * Método para calcular el promedio
     */
    public void calcularPromedio() {
        promedio = (calif1 + calif2 + calif3 + calif4) / 4;
    }

    /**
     * Método para llamar al valor almacenado en la variable observacion
     *
     * @return observacion
     */
    public String getObservacion() {
        return observacion;
    }

    public void calcularObservacion() {
        if (promedio >= 40) {
            observacion = "Aprobado";
        } else {
            observacion = "Reprobado";
        }
    }
}
