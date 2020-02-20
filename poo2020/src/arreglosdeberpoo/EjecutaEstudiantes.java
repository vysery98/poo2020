package arreglosdeberpoo;

import taller1.Estudiante;

import java.util.Scanner;

public class EjecutaEstudiantes {

    public static void main(String[] args) {

        // Scanner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        String[] name = new String[5];
        int[] age = new int[5];
        String[] univ = new String[5];
        String[] cell = new String[5];

        // Creación e inicialización de objeto
        Estudiantes stud = new Estudiantes();

        // Lectura de datos solicitados
        for (int i = 0; i < name.length; i++) {
            System.out.println("Ingrese los datos del estudiante " + (i + 1) + ": ");
            System.out.print("Nombre: ");
            name[i] = scan.nextLine();
            System.out.print("Edad: ");
            age[i] = scan.nextInt();
            // Limpieza del buffer
            scan.nextLine();
            System.out.print("Iniciales de la universidad: ");
            univ[i] = scan.nextLine().toLowerCase();
            System.out.print("Número de celular: ");
            cell[i] = scan.nextLine();
        }

        // Establecer valores en objeto
        stud.setNombre(name);
        stud.setEdad(age);
        stud.setUniversidad(univ);
        stud.setCelular(cell);
        stud.presentar();

        // Salida
        System.out.println(stud.getSalida());
    }
}
