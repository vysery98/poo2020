package disenio_seleccion;

import java.util.Scanner;

public class EjecutaEmpleado {

    public static void main(String[] args) {
        // Scanner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        String nombre;
        int hTrabajadas;
        double vHora;

        // Lectura de datos
        System.out.print("Nombre del empleado: ");
        nombre = scan.nextLine();
        System.out.print("Número de horas trabajadas: ");
        hTrabajadas = scan.nextInt();
        System.out.print("Valor por cada hora: ");
        vHora = scan.nextDouble();

        // Creación de objeto con inicialización de variables
        Empleado empleado = new Empleado();
        empleado.setNombre(nombre);
        empleado.sethTrabajadas(hTrabajadas);
        empleado.setvHora(vHora);

        // Salida
        System.out.println("\nEmpleado: " + empleado.getNombre().toUpperCase() + "\nSueldo = $" +
                empleado.calcularSueldo());
    }
}
