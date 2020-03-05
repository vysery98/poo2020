package polimorfismoautomotriz;

import java.util.Scanner;

public class EjecutaEmpleado {

    public static void main(String[] args) {

        // Scaner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        String cadena = "\t\t\t\t\t\t\t\t\t\t\t\t\tREPORTE DE NÓMINA QUINCENAL\n\n RFC\t\t\t\tNOMBRE\t\t" +
                "\t\t\t\t\t\tDEPTO.\t\t\t\t\t\t\t\tPUESTO\t\t\t\t\t\tSUELDO QUINCENA\n_______________________________" +
                "____________________________________________________________________________________________________" +
                "_____\n";
        double precio, suma, sumaAux = 0;
        int opt, num, puesto, empleado = 1;
        boolean salida = true, salida2 = true, salida3 = true;

        do {
            System.out.print("Puesto:\n1. Administrativos\n2. Mecánicos\n3. Vendedores\nOpción = ");
            puesto = scan.nextInt();
            // Limpieza del Buffer
            scan.nextLine();
            do {
                switch (puesto) {
                    case 1:
                        // Creación e inicialización de objeto
                        EmpAdmvo a = new EmpAdmvo();

                        // Lectura de datos solicitados
                        System.out.print("Registro Federal de Causantes: ");
                        a.setRfc(scan.nextLine());
                        System.out.print("Nombre: ");
                        a.setNombre(scan.nextLine());
                        System.out.print("Sueldo = $");
                        a.setSueldo(scan.nextDouble());
                        // Limpieza del Buffer
                        scan.nextLine();

                        a.setDpto("ADMINISTRATIVO");
                        a.setPuesto("ADMINISTRADOR");
                        a.calcularQuincena();

                        sumaAux += a.getQuincena();

                        // Concatenación de datos para presentar a la salida
                        cadena = String.format("%s%s\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%s\t\t\t\t\t$%.2f\n", cadena,
                                a.getRfc(), a.getNombre().toUpperCase(), a.getDpto(), a.getPuesto(), a.getQuincena());
                        salida2 = false;
                        break;

                    case 2:
                        // Creación e inicialización de objeto
                        EmpMecanico b = new EmpMecanico();

                        // Reinicio acumulador
                        suma = 0;

                        // Lectura de datos solicitados
                        System.out.print("Registro Federal de Causantes: ");
                        b.setRfc(scan.nextLine());
                        System.out.print("Nombre: ");
                        b.setNombre(scan.nextLine());
                        System.out.print("Número de trajabos realizados: ");
                        num = scan.nextInt();
                        // Limpieza del Buffer
                        scan.nextLine();

                        for (int i = 1; i <= num; i++) {
                            System.out.print("Precio por trabajo " + i + " = $");
                            precio = scan.nextDouble();
                            // Limpieza del Buffer
                            scan.nextLine();
                            suma += precio;
                        }

                        b.setDpto("MECÁNICA");
                        b.setPuesto("MECÁNICO");
                        b.setPrecioT(suma);
                        b.calcularQuincena();

                        sumaAux += b.getQuincena();

                        // Concatenación de datos para presentar a la salida
                        cadena = String.format("%s%s\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%s\t\t\t\t\t$%.2f\n", cadena,
                                b.getRfc(), b.getNombre().toUpperCase(), b.getDpto(), b.getPuesto(), b.getQuincena());
                        salida2 = false;
                        break;

                    case 3:
                        // Creación e inicialización de objeto
                        EmpVendedor c = new EmpVendedor();

                        // Reinicio acumulador
                        suma = 0;

                        // Lectura de datos solicitados
                        System.out.print("Registro Federal de Causantes: ");
                        c.setRfc(scan.nextLine());
                        System.out.print("Nombre: ");
                        c.setNombre(scan.nextLine());
                        System.out.print("Número de autos vendidos = ");
                        num = scan.nextInt();
                        // Limpieza del Buffer
                        scan.nextLine();
                        for (int i = 1; i <= num; i++) {
                            System.out.print("Valor del auto vendido " + i + " = $");
                            precio = scan.nextDouble();
                            // Limpieza del Buffer
                            scan.nextLine();
                            suma += precio;
                        }

                        c.setValVenta(suma);
                        c.setDpto("VENTAS");
                        c.setPuesto("VENDEDOR");
                        c.calcularQuincena();

                        sumaAux += c.getQuincena();

                        // Concatenación de datos para presentar a la salida
                        cadena = String.format("%s%s\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%s\t\t\t\t\t$%.2f\n", cadena,
                                c.getRfc(), c.getNombre().toUpperCase(), c.getDpto(), c.getPuesto(), c.getQuincena());
                        salida2 = false;
                        break;

                    default:
                        // En caso de ingresar una opción incorrecta
                        System.out.println("Opción incorrecta.\n");
                        break;
                }

            } while (salida2);

            do {
                System.out.print("\n¿Desea ingresar otro empleado?\n1 = Si\n2 = No\nOpción = ");
                opt = scan.nextInt();
                // Limpieza del Buffer
                scan.nextLine();
                if (opt == 1) {
                    empleado++;
                    System.out.println();
                    salida3 = false;
                } else if (opt == 2) {
                    cadena = String.format("%sTOTAL %d EMPLEADOS\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" +
                            "\t$%.2f", cadena, empleado, sumaAux);
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
