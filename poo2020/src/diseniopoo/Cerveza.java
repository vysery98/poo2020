package diseniopoo;

public class Cerveza {

    // declaración de datos
    private double precio;
    private int unidades_vendidas;
    private String nombre;
    private String tipo;

    public Cerveza(String nombre, String tipo, double precio, int unidades_vendidas) {
        this.precio = precio;
        this.unidades_vendidas = unidades_vendidas;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades_vendidas() {
        return unidades_vendidas;
    }

    public void setUnidades_vendidas(int unidades_vendidas) {
        this.unidades_vendidas = unidades_vendidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double calcular_ventas(double precio, int unidades_vendidas) {
        double total;

        total = precio * unidades_vendidas;

        return total;
    }

    public String reportar(String a, String b, double c, int d, double e) {
        String salida = "";
        salida = ("R E P O R T E\nCerveza: " + a + "\nTipo: " + b + "\nPrecio: " + c + "\nUnidades vendidas: " + d +
                "\nTOTAL VENTAS " + e + "\n");
        return salida;
    }
}
