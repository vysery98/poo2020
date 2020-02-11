package taller1;

public class EjecutaDocente {

    public static void main(String[] args) {
        // Creación de objeto docente
        Docente docente = new Docente();

        docente.actualizar_area("Técnica");
        docente.actualizar_edad(35);
        docente.actualizar_estado_civil("soltero");
        docente.actualizar_sexo("M");
        docente.actualizar_identificacion("0123456789");

        System.out.println("Identificación: " + docente.obtener_identificacion() + "\nEdad: " + docente.obtener_edad()
                + "\nEstado Civil: " + docente.obtener_estado_civil() + "\nSexo: " + docente.obtener_sexo() + "\nÁrea: "
                + docente.obtener_area());
    }
}
