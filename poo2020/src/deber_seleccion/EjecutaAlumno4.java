package deber_seleccion;

import java.util.Scanner;

public class EjecutaAlumno4 {

    public static void main(String[] args) {

        // Scanner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        String nombre;
        double c1;
        double c2;
        double c3;
        double c4;

        // Declaración e inicialización de objeto
        Alumno4 objAlumno = new Alumno4();

        // Pedido y lectura de datos
        System.out.print("Nombre del alumno: ");
        nombre = scan.nextLine();
        System.out.print("Calificación 1: ");
        c1 = scan.nextDouble();
        System.out.print("Calificación 2: ");
        c2 = scan.nextDouble();
        System.out.print("Calificación 3: ");
        c3 = scan.nextDouble();
        System.out.print("Calificación 4: ");
        c4 = scan.nextDouble();

        // Establecer valores
        objAlumno.setNombreAlum(nombre);
        objAlumno.setCalif1(c1);
        objAlumno.setCalif2(c2);
        objAlumno.setCalif3(c3);
        objAlumno.setCalif4(c4);

        // Cálculo del promedio y de observación
        objAlumno.calcularPromedio();
        objAlumno.calcularObservacion();

        // Salida de datos
        System.out.println("Estudiante: " + objAlumno.getNombreAlum());
        System.out.println("Promedio: " + objAlumno.getPromedio());
        System.out.println("Observación: " + objAlumno.getObservacion());

    }
}
