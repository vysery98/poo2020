package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaVehiculo {

    public static void main(String[] args) {

        // Scanner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de datos
        boolean bandera = true;
        int opt;
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        // Inicio
        System.out.println("SISTEMA DE INGRESO DE VEHICULOS");

        do {
            System.out.print("Digite\n1. Almacenar nuevo vehículo.\n2. Presentar vehículos.\n3. Salir\nOpción = ");
            opt = scan.nextInt();
            // Limpieza del Buffer
            scan.nextLine();

            switch (opt) {
                case 1:
                    Vehiculo vehiculo = new Vehiculo();
                    System.out.print("Ingrese placa: ");
                    vehiculo.setPlaca(scan.nextLine());
                    System.out.print("Ingrese marca: ");
                    vehiculo.setMarca(scan.nextLine());
                    System.out.print("Ingrese modelo: ");
                    vehiculo.setModelo(scan.nextLine());
                    System.out.print("Ingrese color: ");
                    vehiculo.setColor(scan.nextLine());
                    System.out.print("Ingrese año: ");
                    vehiculo.setAnio(scan.nextInt());
                    System.out.print("Ingrese cilindraje: ");
                    vehiculo.setCilindraje(scan.nextInt());
                    // Limpieza del Buffer
                    scan.nextLine();

                    // Agregamos objeto vehiculo a la lista
                    vehiculos.add(vehiculo);
                    break;

                case 2:
                    // Recorremos lista con foreach
                    // SALIDA 1 System.out.println("PLACA\t\t\tMARCA\t\tCILINDRAJE");
                    for (Vehiculo v : vehiculos) {
                        // SALIDA 1 System.out.println(v.getPlaca() + "\t\t" + v.getMarca() + "\t\t" + v.getCilindraje());
                        // SALIDA 2
                        System.out.println("- - - - - - - - - - - - - - - - -\nPlaca: " + v.getPlaca() + "\nMarca: " +
                                v.getMarca() + "\nModelo: " + v.getModelo() + "\nAño: " + v.getAnio() + "\nCilindraje" +
                                ": " + v.getCilindraje() + "\nColor: " + v.getColor() + "\n- - - - - - - - - - - - - " +
                                "- - - -\n");
                    }

                    break;

                case 3:
                    System.out.println("\nS A L I E N D O. . .");
                    bandera = false;
                    break;

                default:
                    System.out.println("Opción incorrecta.");
                    break;

            }
        } while (bandera);

    }

}
