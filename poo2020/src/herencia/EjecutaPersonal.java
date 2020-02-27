package herencia;

import java.util.Date;
import java.util.Scanner;

public class EjecutaPersonal {

    public static void main(String[] args) {

        // Scanner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        String nombre, carrera, area, dependencia, identificacion, estado_civil, fecha_nac;

        // Lectura de datos solicitados
        System.out.println("CREACIÓN DE OBJETO ESTUDIANTE\nIngrese los siguientes datos del estudiante:");
        System.out.print("Nombre: ");
        nombre = scan.nextLine();
        System.out.print("Identificacion: ");
        identificacion = scan.nextLine();
        System.out.print("Carrera: ");
        carrera = scan.nextLine();
        System.out.print("Estado Civil: ");
        estado_civil = scan.nextLine();
        System.out.print("Fecha de nacimiento: ");
        fecha_nac = scan.nextLine();

        // Creación de objetos de las clases Estudiante
        Estudiante est = new Estudiante(carrera, nombre, identificacion, estado_civil, fecha_nac);

        // Lectura de datos solicitados
        System.out.println("\nCREACIÓN DE OBJETO DOCENTE\nIngrese los siguientes datos del docente:");
        System.out.print("Nombre: ");
        nombre = scan.nextLine();
        System.out.print("Identificacion: ");
        identificacion = scan.nextLine();
        System.out.print("Area: ");
        area = scan.nextLine();
        System.out.print("Estado Civil: ");
        estado_civil = scan.nextLine();
        System.out.print("Fecha de nacimiento: ");
        fecha_nac = scan.nextLine();

        // Creación de objetos de las clases Docente
        Docente doc = new Docente(area, nombre, identificacion, estado_civil, fecha_nac);

        // Lectura de datos solicitados
        System.out.println("\nCREACIÓN DE OBJETO ADMINISTRATIVO\nIngrese los siguientes datos del personal administr" +
                "ativo:");
        System.out.print("Nombre: ");
        nombre = scan.nextLine();
        System.out.print("Identificacion: ");
        identificacion = scan.nextLine();
        System.out.print("Dependencia: ");
        dependencia = scan.nextLine();
        System.out.print("Estado Civil: ");
        estado_civil = scan.nextLine();
        System.out.print("Fecha de nacimiento: ");
        fecha_nac = scan.nextLine();

        // Creación de objetos de las clases Administrativo
        Administrativo adm = new Administrativo(dependencia, nombre, identificacion, estado_civil, fecha_nac);

        // SALIDA ESTUDIANTE
        System.out.println("--------------------------------------\nDatos de objeto estudiante:");
        System.out.println("Nombre: " + est.getNombre());
        System.out.println("Identificación: " + est.getIdentificacion());
        System.out.println("Carrera: " + est.getCarrera());
        System.out.println("Estado: " + est.getEstado_civil());
        System.out.println("Fecha de nacimiento: " + est.getFecha_nacimiento());
        System.out.println("--------------------------------------");

        // SALIDA DOCENTE
        System.out.println("\n--------------------------------------\nDatos de objeto docente:");
        System.out.println("Nombre: " + doc.getNombre());
        System.out.println("Identificación: " + doc.getIdentificacion());
        System.out.println("Area: " + doc.getArea());
        System.out.println("Estado: " + doc.getEstado_civil());
        System.out.println("Fecha de nacimiento: " + doc.getFecha_nacimiento());
        System.out.println("--------------------------------------");

        // SALIDA ADMINISTRATIVO
        System.out.println("\n--------------------------------------\nDatos de objeto administrativo:");
        System.out.println("Nombre: " + adm.getNombre());
        System.out.println("Identificación: " + adm.getIdentificacion());
        System.out.println("Dependencia: " + adm.getDependencia());
        System.out.println("Estado: " + adm.getEstado_civil());
        System.out.println("Fecha de nacimiento: " + adm.getFecha_nacimiento());
        System.out.println("--------------------------------------");
    }
}
