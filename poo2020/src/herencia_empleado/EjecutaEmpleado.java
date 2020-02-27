package herencia_empleado;

import java.util.Scanner;

public class EjecutaEmpleado {

    public static void main(String[] args) {

        // Scanner para lectura de datos
        Scanner sc = new Scanner(System.in);

        // Declaración de variables
        String nombre, cargo, dependencia;
        int hora, opt;
        double valorHora, valor_mensual;
        boolean salida = true;

        // Menú a presentarse en el bucle
        String menu = "Ingrese la opción que desee:\n1. Realizar el Cálculo de un empleado cuyo Sueldo es por Horas:" +
                "\n2. Realizar el Cálculo de un empleado cuyo Sueldo es fijo (Empleado Asalariado):\n3. Salir.\nOpció" +
                "n = ";

        do {
            // Ingreso de opción deseada
            System.out.print(menu);
            opt = sc.nextInt();
            // Limpieza del Buffer
            sc.nextLine();
            switch (opt) {

                case 1:
                    // Lectura de datos solicitados
                    System.out.print("Ingrese los datos del empleado.\nNombre: ");
                    nombre = sc.nextLine();
                    System.out.print("Cargo: ");
                    cargo = sc.nextLine();
                    System.out.print("Dependencia: ");
                    dependencia = sc.nextLine();
                    System.out.print("Horas trabajadas: ");
                    hora = sc.nextInt();
                    System.out.print("Valor por Hora: ");
                    valorHora = sc.nextDouble();

                    // Creación e inicialización de objeto
                    EmpleadoPorHora empHor = new EmpleadoPorHora(nombre, cargo, dependencia, hora, valorHora);

                    // Salida
                    System.out.println("--------------------------------------\nDatos de objeto empleado por hora:");
                    System.out.println("Nombre: " + empHor.getNombre());
                    System.out.println("Cargo: " + empHor.getCargo());
                    System.out.println("Dependencia: " + empHor.getDependencia());
                    System.out.print("Sueldo = $");
                    empHor.calcularSueldoPorHoras();
                    System.out.println("\n--------------------------------------");
                    break;

                case 2:
                    // Lectura de datos solicitados
                    System.out.print("Ingrese los datos del empleado.\nNombre: ");
                    nombre = sc.nextLine();
                    System.out.print("Cargo: ");
                    cargo = sc.nextLine();
                    System.out.print("Dependencia: ");
                    dependencia = sc.nextLine();
                    System.out.print("Cuota mensual: ");
                    valor_mensual = sc.nextDouble();

                    // Creación e inicialización de objeto
                    EmpleadoAsalariado empAsal = new EmpleadoAsalariado(nombre, cargo, dependencia, valor_mensual);

                    // Salida
                    System.out.println("--------------------------------------\nDatos de objeto empleado asalariado:");
                    System.out.println("Nombre: " + empAsal.getNombre());
                    System.out.println("Cargo: " + empAsal.getCargo());
                    System.out.println("Dependencia: " + empAsal.getDependencia());
                    System.out.print("Sueldo = $");
                    empAsal.calcularSueldoMensual();
                    System.out.println("\n--------------------------------------");
                    break;

                case 3: // Opción para salir del menú
                    salida = false;
                    break;

                default:
                    System.out.println("Opción inválida, ingrese una de las opciones mencionadas previamente.");
                    break;
            }
        } while (salida == true);

    }
}
