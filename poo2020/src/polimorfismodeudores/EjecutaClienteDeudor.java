package polimorfismodeudores;

import java.util.Scanner;

public class EjecutaClienteDeudor {
    public static void main(String[] args) {
        // Scanner para lectura de datos
        Scanner sc = new Scanner(System.in);

        // Declaración de variables
        String cadena = ("\t\t\t\t\t\t\tREPORTE DE CLIENTES DEUDORES\nNO. CLIENTE\t\t\t\tNOMBRE\t\t\t\t\t\t\tNO. CUENTA" +
                "\t\t\t\tINTERÉS POR PAGAR\n");
        String name, nroCliente, nroCuenta;
        double capital, tasa, plazo, aux = 0;
        int clientes = 1, opt;
        boolean bandera = true, bandera2 = true, bandera3 = true;

        do {
            System.out.print("Número de cliente: ");
            nroCliente = sc.nextLine();
            System.out.print("Nombre del cliente: ");
            name = sc.nextLine();
            System.out.print("Número de cuenta: ");
            nroCuenta = sc.nextLine();
            System.out.print("Capital prestado: ");
            capital = sc.nextDouble();
            System.out.print("Tasa de interés anual = %");
            tasa = sc.nextDouble();
            System.out.print("Plazo de la inversión: ");
            plazo = sc.nextDouble();
            // Limpieza del Buffer
            sc.nextLine();

            System.out.print("Seleccione una de las opciones.\n1. Interés de préstamo personal.\n2. Interés de présta" +
                    "mo hipotecario.\n3. Interés de préstamo de auto.\nOpción = ");
            opt = sc.nextInt();
            sc.nextLine();
            do {

                switch (opt) {
                    case 1:
                        // Creación e inicialización de objeto
                        PrestamoPersonal a = new PrestamoPersonal();

                        a.setNum_cliente(nroCliente);
                        a.setName(name);
                        a.setNum_cuenta(nroCuenta);
                        a.setCapital_prestado(capital);
                        a.setTasa_anual(tasa);
                        a.setPlazo(plazo);
                        a.calcularInteresPaga();

                        aux += a.getInteresPaga();

                        // Concantenación de datos para la salida
                        cadena = String.format("%s%s\t\t\t\t\t%s\t\t\t%s\t\t\t\t%.2f\n", cadena, a.getNum_cliente(),
                                a.getName().toUpperCase(), a.getNum_cuenta(), a.getInteresPaga());

                        // Salida del bucle
                        bandera = false;
                        break;

                    case 2:
                        // Creación e inicialización de objeto
                        PrestamoHipotecario b = new PrestamoHipotecario();

                        b.setNum_cliente(nroCliente);
                        b.setName(name);
                        b.setNum_cuenta(nroCuenta);
                        b.setCapital_prestado(capital);
                        b.setTasa_anual(tasa);
                        b.setPlazo(plazo);
                        b.calcularInteresPaga();

                        aux += b.getInteresPaga();

                        // Concantenación de datos para la salida
                        cadena = String.format("%s%s\t\t\t\t\t%s\t\t\t%s\t\t\t\t%.2f\n", cadena, b.getNum_cliente(),
                                b.getName().toUpperCase(), b.getNum_cuenta(), b.getInteresPaga());

                        // Salida del bucle
                        bandera = false;
                        break;

                    case 3:
                        // Creación e inicialización de objeto
                        PrestamoAuto c = new PrestamoAuto();

                        c.setNum_cliente(nroCliente);
                        c.setName(name);
                        c.setNum_cuenta(nroCuenta);
                        c.setCapital_prestado(capital);
                        c.setTasa_anual(tasa);
                        c.setPlazo(plazo);
                        c.calcularInteresPaga();

                        aux += c.getInteresPaga();

                        // Concantenación de datos para la salida
                        cadena = String.format("%s%s\t\t\t\t\t%s\t\t\t%s\t\t\t\t%.2f\n", cadena, c.getNum_cliente(),
                                c.getName().toUpperCase(), c.getNum_cuenta(), c.getInteresPaga());

                        // Salida del bucle
                        bandera = false;
                        break;

                    default:
                        System.out.println("Opción inválida.");
                        break;
                }

            } while (bandera == true);

            do {

                System.out.print("\n¿Desea calcular otro interés en deuda? Si = 1, No = 2\nOpción = ");
                opt = sc.nextInt();
                // Limpieza del Buffer
                sc.nextLine();

                if (opt == 1) {
                    clientes++;
                    bandera2 = false;
                } else if (opt == 2) {
                    cadena = String.format("%sTOTAL %d CLIENTE(S)\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%.2f", cadena, clientes,
                            aux);
                    bandera2 = false;
                    bandera3 = false;
                } else {
                    System.out.println("Opción incorrecta.");
                }

            } while (bandera2 == true);

        } while (bandera3 == true);

        // Salida
        System.out.println(cadena);

    }
}
