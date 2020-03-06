package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEstudiante {

    public static void main(String[] args) {

        // Scanner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de datos
        boolean bandera = true;
        int opt;
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();

        // Inicio
        System.out.println("SISTEMA DE INGRESO DE ESTUDIANTES");

        do {
            System.out.print("Digite\n1. Almacenar nuevo estudiante.\n2. Presentar estudaintes.\n3. Salir\nOpción = ");
            opt = scan.nextInt();
            // Limpieza del Buffer
            scan.nextLine();

            switch (opt) {
                case 1:
                    Estudiante est = new Estudiante();
                    System.out.print("Ingrese nombre: ");
                    est.setNombre(scan.nextLine());
                    System.out.print("Ingrese cédula: ");
                    est.setCedula(scan.nextLine());
                    System.out.print("Ingrese carrera: ");
                    est.setCarrera(scan.nextLine());
                    System.out.print("Ingrese correo: ");
                    est.setCorreo(scan.nextLine());
                    System.out.print("Ingrese edad: ");
                    est.setEdad(scan.nextInt());
                    scan.nextLine();

                    // Agregamos objeto vehiculo a la lista
                    estudiantes.add(est);
                    break;

                case 2:
                    // Recorremos lista con foreach
                    for (Estudiante e : estudiantes) {
                        System.out.println("- - - - - - - - - - - - - - - - -\nNombre: " + e.getNombre() + "\nCédula: " +
                                e.getCedula() + "\nCarrera: " + e.getCarrera() + "\nCorreo: " + e.getCorreo() + "\nEda" +
                                "d: " + e.getEdad() + "\n- - - - - - - - - - - - - - - - -\n");
                    }

                    break;

                case 3:
                    System.out.println("\nS A L I E N D O. . .");
                    bandera = false;
                    break;

                default:
                    System.out.println("Opción incorrecta.");
                    break;

            }
        } while (bandera);

    }

}
