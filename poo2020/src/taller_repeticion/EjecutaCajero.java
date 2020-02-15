package taller_repeticion;

/**
 * Integrantes:
 * Jorge Flores
 * Luis Quizhpe
 * Brandon Vega
 */

import java.util.Scanner;

public class EjecutaCajero {

    public static void main(String[] args) {

        // Scanner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        String socio;
        double saldo;
        double deposito;
        double retiro;
        boolean accion = true;
        int opcion;
        String opcion2;

        // Lectura de datos solicitados
        System.out.print("Nombre del socio: ");
        socio = scan.nextLine();
        System.out.print("Saldo inicial: $");
        saldo = scan.nextDouble();

        // Creación de objeto
        Cajero cajero = new Cajero();

        // Envío de datos a los métodos
        cajero.setSaldo(saldo);
        cajero.setNombre(socio);

        // Ciclo repetetivo
        while (accion == true) {
            System.out.println("Elija la opción que desea:\n1 = Depósito\n2 = Retiro\n3 = Consulta de saldo");

            // Lectura de la opción que desee el usuario
            opcion = scan.nextInt();
            // Limpieza de buffer
            scan.nextLine();

            // Envío de dato a método
            cajero.setOpcion(opcion);

            if (opcion == 1) {

                System.out.print("Cantidad a depositar: $");
                deposito = scan.nextDouble();
                // Limpieza del Buffer
                scan.nextLine();

                // Envío de dato a método y cálculo según la opción
                cajero.setDeposito(deposito);
                cajero.setReporte();

                // Salida
                System.out.println(cajero.getReporte());

                // Opción de salida del bucle
                System.out.print("¿Desea realizar alguna otra accion? Si / No: ");
                opcion2 = scan.nextLine().toLowerCase();
                if (opcion2.equals("no")) {
                    accion = false;
                }

            }
            if (opcion == 2) {

                System.out.print("Cantidad a retirar: $");
                retiro = scan.nextDouble();
                // Limpieza del Buffer
                scan.nextLine();

                // Envío de dato a método y cálculo según la opción
                cajero.setRetiro(retiro);
                cajero.setReporte();

                // Salida
                System.out.println(cajero.getReporte());

                // Opción de salida del bucle
                System.out.print("¿Desea realizar alguna otra accion? Si / No: ");
                opcion2 = scan.nextLine().toLowerCase();
                if (opcion2.equals("no")) {
                    accion = false;
                }

            }

            if (opcion == 3) {

                // Envío de dato a método
                cajero.setReporte();

                // Salida
                System.out.println(cajero.getReporte());

                // Opción de salida del bucle
                System.out.println("¿Desea realizar alguna otra accion? Si / No: ");
                opcion2 = scan.nextLine().toLowerCase();
                if (opcion2.equals("no")) {
                    accion = false;
                }

            }
        }
    }
}
