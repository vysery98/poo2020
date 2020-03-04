package herenciaautomotriz;

import java.util.Scanner;

public class EjecutaEmpleado {

    public static void main(String[] args) {

        // Scaner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        String rfc, nombre, cadena = "\t\t\t\t\t\t\t\t\t\t\t\t\tREPORTE DE NÓMINA QUINCENAL\n\n RFC\t\t\t\tNOMBRE\t\t" +
                "\t\t\t\t\t\tDEPTO.\t\t\t\t\t\t\t\tPUESTO\t\t\t\t\t\tSUELDO QUINCENA\n_______________________________" +
                "____________________________________________________________________________________________________" +
                "_____\n";
        double sueldo, precio, suma, sumaAux = 0;
        int opt, num, puesto, empleado = 1;
        boolean salida = true, salida2 = true, salida3 = true;

        do {
            // Lectura de datos solicitados
            System.out.print("Ingrese los datos solicitados.\nRegistro Federal de Causantes: ");
            rfc = scan.nextLine();
            System.out.print("Nombre: ");
            nombre = scan.nextLine();
            System.out.print("Puesto:\n1. Administrativos\n2. Mecánicos\n3. Vendedores\nOpción = ");
            puesto = scan.nextInt();
            // Limpieza del Buffer
            scan.nextLine();
            do {
                switch (puesto) {
                    case 1:
                        // Lectura de datos solicitados
                        System.out.print("\nADMINISTRATIVO\nIngrese el valor del sueldo = $");
                        sueldo = scan.nextDouble();
                        // Limpieza del Buffer
                        scan.nextLine();

                        // Creación e inicialización de objeto
                        EmpAdmvo adm = new EmpAdmvo(rfc, nombre, "ADMINISTRATIVO", "ADMINISTRADOR", sueldo);
                        adm.calcularQuincena();

                        sumaAux += adm.getQuincena();

                        // Concatenación de datos para presentar a la salida
                        cadena = String.format("%s%s\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%s\t\t\t\t\t$%.2f\n", cadena,
                                adm.getRfc(), adm.getNombre().toUpperCase(), adm.getDpto(), adm.getPuesto(),
                                adm.getQuincena());
                        salida2 = false;
                        break;

                    case 2:
                        // Reinicio acumulador
                        suma = 0;

                        // Lectura de datos solicitados
                        System.out.print("\nMECÁNICA\nNúmero de trajabos realizados: ");
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

                        // Creación e inicialización de objeto
                        EmpMecanico mec = new EmpMecanico(rfc, nombre, "MECÁNICA", "MECÁNICO", suma);
                        mec.calcularQuincena();

                        sumaAux += mec.getQuincena();

                        // Concatenación de datos para presentar a la salida
                        cadena = String.format("%s%s\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%s\t\t\t\t\t$%.2f\n", cadena,
                                mec.getRfc(), mec.getNombre().toUpperCase(), mec.getDpto(), mec.getPuesto(),
                                mec.getQuincena());
                        salida2 = false;
                        break;

                    case 3:
                        // Reinicio acumulador
                        suma = 0;
                        // Lectura de datos solicitados
                        System.out.print("\nVENTAS\nNúmero de autos vendidos = ");
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

                        // Creación e inicialización de objeto
                        EmpVendedor sell = new EmpVendedor(rfc, nombre, "VENTAS", "VENDEDOR", suma);
                        sell.calcularQuincena();

                        sumaAux += sell.getQuincena();

                        // Concatenación de datos para presentar a la salida
                        cadena = String.format("%s%s\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%s\t\t\t\t\t$%.2f\n", cadena,
                                sell.getRfc(), sell.getNombre().toUpperCase(), sell.getDpto(), sell.getPuesto(),
                                sell.getQuincena());
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
                    System.out.println("Opción incorrecta, ingrese nuevamente.");
                }
            } while (salida3 == true);

        } while (salida == true);

        System.out.println(cadena);

    }

}
