package taller1;

public class Animal {

    // definición de atributos globales
    private String familia;
    private String raza;
    private String especie;
    private double tamanio;
    private double veloc_desplazamiento;

    /**
     * Método para nacer
     */
    public void nacer() {
    }

    /**
     * Método para crecer
     */
    public void crecer() {
    }

    /**
     * Método para reproducir
     */
    public void reproducir() {
    }

    /**
     * Método para morir
     */
    public void morir() {
    }

    /**
     * Método para obtener el valor de la variable familia.
     *
     * @return this.familia
     */

    public String obtener_familia() {
        return this.familia;
    }

    /**
     * Método para obtener el valor de la variable raza.
     *
     * @return this.raza
     */

    public String obtener_raza() {
        return this.raza;
    }

    /**
     * Método para obtener el valor de la variable especie.
     *
     * @return this.especie
     */

    public String obtener_especie() {
        return this.especie;
    }

    /**
     * Método para obtener el valor de la variable tamanio
     *
     * @return this.tamanio
     */

    public double obtener_tamanio() {
        return this.tamanio;
    }

    /**
     * Método para obtener el valor de la variable veloc_desplazamiento.
     *
     * @return this.veloc_desplazamiento
     */

    public double obtener_veloc_desplazamiento() {
        return this.veloc_desplazamiento;
    }

    /**
     * Método para actualizar la variable familia
     *
     * @param familia
     */
    public void actualizar_familia(String familia) {
        this.familia = familia;
    }

    /**
     * Método para actualizar la variable raza
     *
     * @param raza
     */
    public void actualizar_raza(String raza) {
        this.raza = raza;
    }

    /**
     * Método para actualizar la variable especie
     *
     * @param especie
     */
    public void actualizar_especie(String especie) {
        this.especie = especie;
    }

    /**
     * Método para actualizar la variable tamanio
     *
     * @param tamanio
     */
    public void actualizar_tamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * Método para actualizar la variable veloc_desplazamiento
     *
     * @param veloc_desplazamiento
     */
    public void actualizar_veloc_desplazamiento(double veloc_desplazamiento) {
        this.veloc_desplazamiento = veloc_desplazamiento;
    }

}
