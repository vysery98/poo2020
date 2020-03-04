package herenciainversionistas;

import java.util.Scanner;

public class EjecutaInversionista {

    public static void main(String[] args) {

        // Scaner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        String nroCliente, nombre, nroCuenta, cadena = "\t\t\t\t\t\t\t\t\t\t\tREPORTE DE INVERSIONES\nNo. Cliente\t\t" +
                "\t\tNombre\t\t\t\t\t\t\t\tNo. Cuenta\t\t\t\t\t\t\t\tInterés Ganado\n________________________________" +
                "______________________________________________________________________________________\n";

        double capital, tasa, sumaAux = 0;
        int plazo, opt, puesto, inversiones = 1;
        boolean salida = true, salida2 = true, salida3 = true;

        do {
            // Lectura de datos solicitados
            System.out.print("Ingrese los datos solicitados.\nNúmero de Cliente: ");
            nroCliente = scan.nextLine();
            System.out.print("Nombre: ");
            nombre = scan.nextLine();
            System.out.print("Número de Cuenta: ");
            nroCuenta = scan.nextLine();
            System.out.print("Tipo de Cuenta:\n1. Cuenta de Ahorro\n2. Cuenta Maestra\n3. Pagaré\nOpción = ");
            puesto = scan.nextInt();
            // Limpieza del Buffer
            scan.nextLine();
            do {
                switch (puesto) {
                    case 1:
                        // Lectura de datos solicitados
                        System.out.print("\nCUENTA DE AHORRO\nIngrese el valor del capital = $");
                        capital = scan.nextDouble();
                        System.out.print("Tasa de Interés (anual) = %");
                        tasa = scan.nextDouble();
                        System.out.print("Plazo de la inversión (meses) = ");
                        plazo = scan.nextInt();
                        // Limpieza del Buffer
                        scan.nextLine();

                        // Creación e inicialización de objeto
                        CuentaAhorro ahor = new CuentaAhorro(nroCliente, nombre, nroCuenta, capital, tasa, plazo);
                        ahor.calcularIntGanado();

                        sumaAux += ahor.getIntGanado();

                        // Concatenación de datos para presentar a la salida
                        cadena = String.format("%s%s\t\t\t\t%s\t\t\t\t\t%s\t\t\t\t\t\t\t\t$%.2f\n", cadena,
                                ahor.getNroCliente(), ahor.getNameCliente().toUpperCase(), ahor.getNroCuenta(),
                                ahor.getIntGanado());
                        salida2 = false;
                        break;

                    case 2:
                        // Lectura de datos solicitados
                        System.out.print("\nCUENTA MAESTRA\nIngrese el valor del capital = $");
                        capital = scan.nextDouble();
                        System.out.print("Tasa de Interés (anual) = %");
                        tasa = scan.nextDouble();
                        System.out.print("Plazo de la inversión (meses) = ");
                        plazo = scan.nextInt();
                        // Limpieza del Buffer
                        scan.nextLine();

                        // Creación e inicialización de objeto
                        CuentaMaestra maes = new CuentaMaestra(nroCliente, nombre, nroCuenta, capital, tasa, plazo);
                        maes.calcularIntGanado();

                        sumaAux += maes.getIntGanado();

                        // Concatenación de datos para presentar a la salida
                        cadena = String.format("%s%s\t\t\t\t%s\t\t\t\t\t%s\t\t\t\t\t\t\t\t$%.2f\n", cadena,
                                maes.getNroCliente(), maes.getNameCliente().toUpperCase(), maes.getNroCuenta(),
                                maes.getIntGanado());
                        salida2 = false;
                        break;

                    case 3:
                        // Lectura de datos solicitados
                        System.out.print("\nPAGARÉ\nIngrese el valor del capital = $");
                        capital = scan.nextDouble();
                        System.out.print("Tasa de Interés (anual) = %");
                        tasa = scan.nextDouble();
                        System.out.print("Plazo de la inversión (meses) = ");
                        plazo = scan.nextInt();
                        // Limpieza del Buffer
                        scan.nextLine();

                        // Creación e inicialización de objeto
                        Pagare pag = new Pagare(nroCliente, nombre, nroCuenta, capital, tasa, plazo);
                        pag.calcularIntGanado();

                        sumaAux += pag.getIntGanado();

                        // Concatenación de datos para presentar a la salida
                        cadena = String.format("%s%s\t\t\t\t%s\t\t\t\t\t%s\t\t\t\t\t\t\t\t$%.2f\n", cadena,
                                pag.getNroCliente(), pag.getNameCliente().toUpperCase(), pag.getNroCuenta(),
                                pag.getIntGanado());
                        salida2 = false;
                        break;

                    default:
                        // En caso de ingresar una opción incorrecta
                        System.out.println("Opción inválida, ingrese nuevamente un número según las opciones indicada" +
                                "s.\n");
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
                    cadena = String.format("%sTOTAL %d INVERSIONES\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%.2f",
                            cadena, inversiones, sumaAux);
                    salida3 = false;
                    salida = false;
                } else {
                    System.out.println("Opción incorrecta, ingrese nuevamente.");
                }
            } while (salida3 == true);

        } while (salida == true);

        System.out.println(cadena);

    }

}
