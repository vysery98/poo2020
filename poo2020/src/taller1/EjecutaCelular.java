package taller1;

public class EjecutaCelular {

    public static void main(String[] args) {
        // creación de objeto celular
        Celular celular = new Celular();

        celular.actualizar_marca("Samsung");
        celular.actualizar_resolucion_camara(12);
        celular.actualizar_almacenamiento(64);
        celular.actualizar_sistema_operativo("Android Oreo");
        celular.actualizar_color("negro");

        System.out.println("Marca: " + celular.obtener_marca() + "\nResolución: " + celular.obtener_resolucion_camara()
                + "megapixeles.\nAlmacenamiento: " + celular.obtener_almacenamiento() + "GB\nSistema Operativo: " +
                celular.obtener_sistema_operativo() + "\nColor: " + celular.obtener_color());
    }
}
