package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutaCedula {

    public static void main(String[] args) {

        // Scanner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        String cedula;
        boolean valid;

        // Bucle para verificar la longitud de la cédula
        do {
            System.out.print("Ingrese número de cédula: ");
            cedula = scan.nextLine();
            valid = true;
            if (cedula.length() != 10) {
                System.out.println("Número de cédula inválido, recuerde que un número de cédula contiene 10 dígitos.");
                valid = false;
            }
        } while (!valid);

        // Creación e inicialización de objeto
        Cedula id = new Cedula();

        // Establecer valores en objeto
        id.setId(cedula);
        id.setArrayId();
        id.calcularValidez();
        id.validarPresentarSalida();

        // Salida
        System.out.println(id.getPresentarSalida());
    }
}
