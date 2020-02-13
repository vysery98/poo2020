package diseniopoo;

public class EstadoEstudiante {
    // declaración de datos
    private String estudiante;
    private String asignatura;
    private double bim_uno;
    private double bim_dos;

    // Constructor
    public EstadoEstudiante(String nombre, String materia, double nota1, double nota2) {
        this.estudiante = nombre;
        this.asignatura = materia;
        this.bim_uno = nota1;
        this.bim_dos = nota2;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getBim_uno() {
        return bim_uno;
    }

    public void setBim_uno(double bim_uno) {
        this.bim_uno = bim_uno;
    }

    public double getBim_dos() {
        return bim_dos;
    }

    public void setBim_dos(double bim_dos) {
        this.bim_dos = bim_dos;
    }

    public double calcular_total(double bim_uno, double bim_dos) {
        double total;

        total = bim_uno + bim_dos;

        return total;
    }

    public String aprobar_reprobar(double total) {
        String estado = "";
        if (total >= 27.5 && total <= 40) {
            estado = "APROBADO";
        } else if (total >= 0 && total < 27.5) {
            estado = "REPROBADO[SUPLETORIO]";
        }
        return estado;
    }

    public String reportar(String name, String materia, double total, String estado) {
        String salida = "";

        salida = ("______________________________________________________________________\nUniversidad Técnica Parti" +
                "cular de Loja\nEstudiante: " + name.toUpperCase() + "\nAsignatura: " + materia.toUpperCase() + "\nEs" +
                "tado: " + estado + "\n______________________________________________________________________");

        return salida;
    }

}
