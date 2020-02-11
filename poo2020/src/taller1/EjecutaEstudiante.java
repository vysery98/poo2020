package taller1;

public class EjecutaEstudiante {

    public static void main(String[] args) {
        // Creación de objeto estudiante
        Estudiante estudiante = new Estudiante();

        estudiante.actualizar_nombre("Fernando");
        estudiante.actualizar_sexo("M");
        estudiante.actualizar_nacionalidad("ecuatoriana");
        estudiante.actualizar_institucion("Técnico");
        estudiante.actualizar_altura(1.64);

        System.out.println("Nombre: " + estudiante.obtener_nombre() + "\nSexo: " + estudiante.obtener_sexo() + "\nNac" +
                "ionalidad: " + estudiante.obtener_nacionalidad() + "\nInstitución: " + estudiante.obtener_institucion()
                + "\nAltura: " + estudiante.obtener_altura() + "m.");
    }
}
