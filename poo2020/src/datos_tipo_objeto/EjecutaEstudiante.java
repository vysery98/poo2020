package datos_tipo_objeto;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        // Scanner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        int cont, opcion, edad_acum;
        Estudiante[] estudiantes = new Estudiante[3];
        Estudiante estudiante;
        boolean bandera = true;

        for (cont = 0; cont < estudiantes.length; cont++) {

            Estudiante est = new Estudiante();
            System.out.println("DATOS DEL ESTUDIANTE " + (cont + 1));
            System.out.print("Nombre del estudiante: ");
            est.setNombre(scan.nextLine());
            System.out.print("Cédula del estudiante: ");
            est.setCedula(scan.nextLine());
            System.out.print("Edad del estudiante: ");
            est.setEdad(scan.nextInt());
            // Limpieza del Buffer
            scan.nextLine();
            System.out.print("Carrera del estudiante: ");
            est.setCarrera(scan.nextLine());
            System.out.print("Correo del estudiante: ");
            est.setCorreo(scan.nextLine());

            // Asignamos el objeto est a la variable estudiante
            estudiantes[cont] = est;

        }

        System.out.println("\nLISTA DE ESTUDIANTES");
        System.out.println("Cédula\t\tNombre");
        edad_acum = 0;
        for (cont = 0; cont < estudiantes.length; cont++) {

            // Suma de las edades para el promedio
            edad_acum += estudiantes[cont].getEdad();

            // Optención de los valores que contiene el tipo de dato Estudiante:
            System.out.println(estudiantes[cont].getCedula() + "\t" + estudiantes[cont].getNombre());
/*
            System.out.println(estudiantes[cont].getEdad());
            System.out.println(estudiantes[cont].getCarrera());
            System.out.println(estudiantes[cont].getCorreo());
 */
        }

        System.out.println("EDAD PROMEDIO DE LOS ESTUDIANTES = " + (edad_acum / estudiantes.length) + "\nFIN DEL PROG" +
                "RAMA");

    }

}
