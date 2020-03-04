package polimorfismo_poo;

import disenio_seleccion.Empleado;

import java.util.Scanner;

public class EjecutaEmpleado12 {

    public static void main(String[] args) {

        // Scanner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Obtener el sueldo quincenal de un empleado por horas.
        EmpleadoPorHoras2 empHoras = new EmpleadoPorHoras2();

        System.out.println("Cálculo del sueldo quincenal empleado por horas.");
        System.out.print("Ingrese horas trabajadas: ");
        empHoras.setHoras_trabajadas(scan.nextDouble());
        System.out.print("Ingrese la cuota por hora: ");
        empHoras.setCuota_por_hora(scan.nextDouble());

        // Cálculo de la quincena
        empHoras.calcularSueldoQna();

        // Salida
        System.out.printf("Sueldo quincenal = $%.2f\n", empHoras.getSueldoQna());

        // Obtener el sueldo quincenal de un empleado por horas.
        EmpleadoAsalariado2 empAs = new EmpleadoAsalariado2();

        System.out.println("Cálculo de sueldo quincenal de empleado asalariado.");
        System.out.print("Ingrese el sueldo mensual: ");
        empAs.setSueldo_mensual(scan.nextDouble());

        // Cálculo de la quincena
        empAs.calcularSueldoQna();

        // Salida
        System.out.printf("Sueldo quincenal = $%.2f\n", empAs.getSueldoQna());

    }

}
