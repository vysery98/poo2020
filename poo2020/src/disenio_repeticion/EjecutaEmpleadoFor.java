package disenio_repeticion;

import java.util.Scanner;

public class EjecutaEmpleadoFor {

    public static void main(String[] args) {


        // declaración de variables
        String nombre;
        double valorHora;
        int horasTrabajadas;
        int numEmpleados;
        String salida = "";

        // Scanner para lectura de datos
        Scanner sc = new Scanner(System.in);

        // Se establece la cuota
        System.out.print("Costo por hora trabajada: $");
        valorHora = sc.nextDouble();
        System.out.print("Número de empleados: ");
        numEmpleados = sc.nextInt();
        // Limpieza del buffer
        sc.nextLine();

        // Ciclo repetitivo do-while para solicitar datos para cada empleado
        for (int i = 1; i <= numEmpleados; i++) {
            // Lectura de datos solicitados
            System.out.print("Nombre del empleado " + i + ": ");
            nombre = sc.nextLine();
            System.out.print("Horas trabajadas: ");
            horasTrabajadas = sc.nextInt();
            // Limpieza del buffer
            sc.nextLine();

            // Creación de objeto y calculo del sueldo
            Empleado empleado = new Empleado(nombre, horasTrabajadas);
            empleado.setValorHora(valorHora);
            empleado.calcularSueldo();

            // Concatenación de datos
            salida = String.format(("%s\nEmpleado12 " + i + ": " + empleado.getNombre() + "\nSueldo: " + empleado.getSueldo() +
                    "\n"), salida);
        }

        // Salida
        System.out.println(salida);

    }
}
