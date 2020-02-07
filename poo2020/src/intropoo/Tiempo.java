package intropoo;

public class Tiempo {

    // definición de atributos globales
    private int hora;
    private int minuto;
    private int segundo;

    /**
     * Método para obtener el valor de la variable hora.
     *
     * @return this.hora
     */

    public int obtener_hora() {
        return this.hora;
        // también se puede usar solo: return hora, emplea la variable global
    }

    /**
     * Método para obtener el valor de la variable minuto
     *
     * @return this.minuto
     */
    public int obtener_minuto() {
        return this.minuto;
    }

    /**
     * Método para obtener el valor de la variable segundo
     *
     * @return this.segundo
     */
    public int obtener_segundo() {
        return this.segundo;
    }

    /**
     * Método para obtener el tiempo en formato hh:mm:ss
     *
     * @return tiempo
     */
    public String obtener_tiempo() {
        String tiempo = hora + ":" + minuto + ":" + segundo;
        return tiempo;
    }

    /**
     * Método para actualizar la varible hora
     *
     * @param hora
     */
    public void actualizar_hora(int hora) {
        // con el this hacemos referencia a variables globales
        this.hora = hora;
        /*
        Si fuera: int h{
        hora = h;
        }
         */
    }

    /**
     * Método para actualizar la varible minuto
     *
     * @param minuto
     */
    public void actualizar_minuto(int minuto) {
        this.minuto = minuto;
    }

    /**
     * Método para actualizar la varible segundo
     *
     * @param segundo
     */
    public void actualizar_segundo(int segundo) {
        this.segundo = segundo;
    }
}
