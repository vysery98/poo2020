package polimorfismoinversionistas;

import java.util.Scanner;

public class EjecutaInversionista {

    public static void main(String[] args) {

        // Scaner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        String nroCliente, nombre, nroCuenta, cadena = "\t\t\t\t\t\t\t\t\t\t\tREPORTE DE INVERSIONES\nNo. Cliente\t\t" +
                "\t\tNombre\t\t\t\t\t\t\t\tNo. Cuenta\t\t\t\t\t\t\t\tInterés Ganado\n________________________________" +
                "______________________________________________________________________________________\n";

        double sumaAux = 0;
        int opt, tipo, inversiones = 1;
        boolean salida = true, salida2 = true, salida3 = true;

        do {
            // Lectura de datos solicitados
            System.out.print("Número de Cliente: ");
            nroCliente = scan.nextLine();
            System.out.print("Nombre: ");
            nombre = scan.nextLine();
            System.out.print("Número de Cuenta: ");
            nroCuenta = scan.nextLine();
            System.out.print("Tipo de Cuenta:\n1. Cuenta de Ahorro\n2. Cuenta Maestra\n3. Pagaré\nOpción = ");
            tipo = scan.nextInt();
            // Limpieza del Buffer
            scan.nextLine();
            do {
                switch (tipo) {
                    case 1:
                        // Creación e inicialización de objeto
                        CuentaAhorro a = new CuentaAhorro();

                        // Lectura de datos solicitados
                        System.out.print("Capital = $");
                        a.setCapital(scan.nextDouble());
                        System.out.print("Tasa de Interés (anual) = %");
                        a.setInteres(scan.nextDouble());
                        System.out.print("Plazo de la inversión (meses) = ");
                        a.setPlazo(scan.nextInt());
                        // Limpieza del Buffer
                        scan.nextLine();

                        a.setNroCliente(nroCliente);
                        a.setNameCliente(nombre);
                        a.setNroCuenta(nroCuenta);
                        a.calcularIntGanado();

                        sumaAux += a.getIntGanado();

                        // Concatenación de datos para presentar a la salida
                        cadena = String.format("%s%s\t\t\t\t%s\t\t\t\t\t%s\t\t\t\t\t\t\t\t$%.2f\n", cadena,
                                a.getNroCliente(), a.getNameCliente().toUpperCase(), a.getNroCuenta(), a.getIntGanado());
                        salida2 = false;
                        break;

                    case 2:
                        // Creación e inicialización de objeto
                        CuentaMaestra b = new CuentaMaestra();

                        // Lectura de datos solicitados
                        System.out.print("Capital = $");
                        b.setCapital(scan.nextDouble());
                        System.out.print("Tasa de Interés (anual) = %");
                        b.setInteres(scan.nextDouble());
                        System.out.print("Plazo de la inversión (meses) = ");
                        b.setPlazo(scan.nextInt());
                        // Limpieza del Buffer
                        scan.nextLine();

                        b.setNroCliente(nroCliente);
                        b.setNameCliente(nombre);
                        b.setNroCuenta(nroCuenta);
                        b.calcularIntGanado();

                        sumaAux += b.getIntGanado();

                        // Concatenación de datos para presentar a la salida
                        cadena = String.format("%s%s\t\t\t\t%s\t\t\t\t\t%s\t\t\t\t\t\t\t\t$%.2f\n", cadena,
                                b.getNroCliente(), b.getNameCliente().toUpperCase(), b.getNroCuenta(), b.getIntGanado());
                        salida2 = false;
                        break;

                    case 3:
                        // Creación e inicialización de objeto
                        Pagare c = new Pagare();

                        // Lectura de datos solicitados
                        System.out.print("Capital = $");
                        c.setCapital(scan.nextDouble());
                        System.out.print("Tasa de Interés (anual) = %");
                        c.setInteres(scan.nextDouble());
                        System.out.print("Plazo de la inversión (meses) = ");
                        c.setPlazo(scan.nextInt());
                        // Limpieza del Buffer
                        scan.nextLine();

                        c.setNroCliente(nroCliente);
                        c.setNameCliente(nombre);
                        c.setNroCuenta(nroCuenta);
                        c.calcularIntGanado();

                        sumaAux += c.getIntGanado();

                        // Concatenación de datos para presentar a la salida
                        cadena = String.format("%s%s\t\t\t\t%s\t\t\t\t\t%s\t\t\t\t\t\t\t\t$%.2f\n", cadena,
                                c.getNroCliente(), c.getNameCliente().toUpperCase(), c.getNroCuenta(), c.getIntGanado());
                        salida2 = false;
                        break;

                    default:
                        // En caso de ingresar una opción incorrecta
                        System.out.println("Opción inválida.\n");
                        break;
                }

            } while (salida2);

            do {
                System.out.print("\n¿Desea ingresar otra inversión?\n1 = Si\n2 = No\nOpción = ");
                opt = scan.nextInt();
                // Limpieza del Buffer
                scan.nextLine();
                if (opt == 1) {
                    inversiones++;
                    System.out.println();
                    salida3 = false;
                } else if (opt == 2) {
                    cadena = String.format("%sTOTAL %d INVERSIONES\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$%.2f",
                            cadena, inversiones, sumaAux);
                    salida3 = false;
                    salida = false;
                } else {
                    System.out.println("Opción incorrecta.");
                }
            } while (salida3 == true);

        } while (salida == true);

        System.out.println(cadena);

    }

}
