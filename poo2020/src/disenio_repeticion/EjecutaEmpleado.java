package disenio_repeticion;

import java.util.Scanner;

public class EjecutaEmpleado {

    public static void main(String[] args) {


        // declaración de variables
        String nombre;
        double valorHora;
        int horasTrabajadas;
        int opcion;
        boolean bandera = true;

        // Scanner para lectura de datos
        Scanner sc = new Scanner(System.in);

        // Se establece la cuota
        System.out.print("Costo por hora trabajada: $");
        valorHora = sc.nextDouble();
        // Limpieza del buffer
        sc.nextLine();

        // Ciclo repetitivo do-while para solicitar datos para cada empleado
        do {
            // Lectura de datos solicitados
            System.out.print("Nombre del empleado: ");
            nombre = sc.nextLine();
            System.out.print("Horas trabajadas: ");
            horasTrabajadas = sc.nextInt();
            // Limpieza del buffer
            sc.nextLine();

            // Creación de objeto y calculo del sueldo
            Empleado empleado = new Empleado(nombre, horasTrabajadas);
            empleado.setValorHora(valorHora);
            empleado.calcularSueldo();

            // Salida
            System.out.println("Empleado12: " + empleado.getNombre());
            System.out.println("Sueldo: " + empleado.getSueldo());

            // Proceso para determinar si se repite el ciclo
            System.out.println("¿Desea calcular el sueldo de otro empleado? [0 = No, cualquier otro valor = Si]");
            opcion = sc.nextInt();
            /**
             * nextLine para limpieza del buffer
             * caso contrario se salta directamente a "Horas trabajadas: "
             */
            sc.nextLine();
            if (opcion == 0) {
                bandera = false;
            }

        } while (bandera == true);
    }
}
