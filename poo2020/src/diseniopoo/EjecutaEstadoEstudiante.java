package diseniopoo;

import java.util.Scanner;

public class EjecutaEstadoEstudiante {

    public static void main(String[] args) {
        // Scanner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        String nombre;
        String asignatura;
        double calificacion_bim1;
        double calificacion_bim2;
        double total;

        // Lectura de datos
        System.out.print("Nombres completos del estudiante: ");
        nombre = scan.nextLine();
        System.out.print("Asignatura: ");
        asignatura = scan.nextLine();
        System.out.print("Calificación del Primer Bimestre: ");
        calificacion_bim1 = scan.nextDouble();
        System.out.print("Calificación del Segundo Bimestre: ");
        calificacion_bim2 = scan.nextDouble();

        // Creación de objeto con inicialización de variables
        EstadoEstudiante estado = new EstadoEstudiante(nombre, asignatura, calificacion_bim1, calificacion_bim2);

        // Salida
        System.out.println(estado.reportar(nombre, asignatura, estado.calcular_total(calificacion_bim1,
                calificacion_bim2), estado.aprobar_reprobar(estado.calcular_total(calificacion_bim1,
                calificacion_bim2))));
    }
}
