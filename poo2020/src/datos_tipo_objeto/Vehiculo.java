package datos_tipo_objeto;

public class Vehiculo {

    private String placa;
    private String modelo;
    private String marca;
    private int anio;
    private String color;
    private int cilindraje;

    /**
     * Método para devolver el valor almacenado en placa
     *
     * @return placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Método para establecer un valor en placa
     *
     * @param placa
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Método para devolver el valor almacenado en modelo
     *
     * @return modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Método para establecer un valor en modelo
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Método para devolver el valor almacenado en marca
     *
     * @return marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método para establecer un valor en marca
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método para devolver el valor almacenado en anio
     *
     * @return anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Método para establecer un valor en anio
     *
     * @param anio
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * Método para devolver el valor almacenado en color
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Método para establecer un valor en color
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método para devolver el valor almacenado en cilindraje
     *
     * @return cilindraje
     */
    public int getCilindraje() {
        return cilindraje;
    }

    /**
     * Método para establecer un valor en cilindraje
     *
     * @param cilindraje
     */
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

}
