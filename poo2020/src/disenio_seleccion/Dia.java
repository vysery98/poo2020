package disenio_seleccion;

public class Dia {

    // declaración de datos
    private int num;
    private String nombre;

    /**
     * Método para actualizar el número de día
     *
     * @param num
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * Método para actualizar el nombre del día
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para llamar al valor asignado a la variable num
     *
     * @return num
     */
    public int getNum() {
        return num;
    }

    /**
     * Método para llamar al valor asignado a la variable nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    public String calcularDia() {

        switch (num) {
            case 1:
                nombre = "Domingo";
                break;
            case 2:
                nombre = "Lunes";
                break;
            case 3:
                nombre = "Martes";
                break;
            case 4:
                nombre = "Miércoles";
                break;
            case 5:
                nombre = "Jueves";
                break;
            case 6:
                nombre = "Viernes";
                break;
            case 7:
                nombre = "Sábado";
                break;
            default:
                nombre = "Opción incorrecta.";
                break;
        }
        return nombre;
    }
}
