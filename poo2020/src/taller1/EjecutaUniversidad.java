package taller1;

public class EjecutaUniversidad {

    public static void main(String[] args) {
        // Creación de objeto universidad
        Universidad un = new Universidad();

        un.actualizar_ubicacion("Loja - Ecuador");
        un.actualizar_nombre("Universidad Técnica Particular de Loja");
        un.actualizar_modalidad("Presencial & Distancia");
        un.actualizar_tipo("Particular");
        un.actualizar_url("utpl.edu.ec");

        System.out.println("Nombre: " + un.obtener_nombre() + "\nUbicación: " + un.obtener_ubicacion() + "\nTipo: " +
                un.obtener_tipo() + "\nModalidad: " + un.obtener_modalidad() + "\nUrl: " + un.obtener_url());
    }
}
