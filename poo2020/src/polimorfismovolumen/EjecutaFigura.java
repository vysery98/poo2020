package polimorfismovolumen;

import java.util.Scanner;

public class EjecutaFigura {

    public static void main(String[] args) {

        // Scaner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        int opt;
        boolean salida = true;

        // Proceso para presentar el menú y calcular
        do {
            System.out.print("Ingrese un número según la opción que desee calcular el volúmen:\n1. Cubo:\n2. Cilindro" +
                    "\n3. Cono\n4. Esfera\n5. Salir\nOpción = ");
            opt = scan.nextInt();

            switch (opt) {

                case 1:
                    // Creación e inicialización de objeto
                    Cubo a = new Cubo();

                    // Lectura de datos solicitados
                    System.out.print("\nVOLÚMEN DEL CUBO\nIngrese el valor de la arista: ");
                    a.setAristaCubo(scan.nextDouble());

                    a.setNombre("cubo");
                    a.calcularVolumen();

                    // Salida
                    System.out.printf("\nFigura: %s\nVolúmen = %.2f\n", a.getNombre().toUpperCase(), a.getVolumen());
                    break;

                case 2:
                    // Creación e inicialización de objeto
                    Cilindro b = new Cilindro();

                    // Lectura de datos solicitados
                    System.out.print("\nVOLÚMEN DEL CILINDRO\nIngrese el valor de la altura: ");
                    b.setAlturaCil(scan.nextDouble());
                    System.out.print("Ingrese el valor del radio: ");
                    b.setRadioCil(scan.nextDouble());

                    b.setNombre("cilindo");
                    b.calcularVolumen();

                    // Salida
                    System.out.printf("\nFigura: %s\nVolúmen = %.2f\n", b.getNombre().toUpperCase(), b.getVolumen());
                    break;

                case 3:
                    // Creación e inicialización de objeto
                    Cono c = new Cono();

                    // Lectura de datos solicitados
                    System.out.print("\nVOLÚMEN DEL CONO\nIngrese el valor de la altura: ");
                    c.setAlturaCono(scan.nextDouble());
                    System.out.print("Ingrese el valor del radio: ");
                    c.setRadioCono(scan.nextDouble());

                    c.setNombre("cono");
                    c.calcularVolumen();

                    // Salida
                    System.out.printf("\nFigura: %s\nVolúmen = %.2f\n", c.getNombre().toUpperCase(), c.getVolumen());
                    break;

                case 4:
                    // Creación e inicialización de objeto
                    Esfera d = new Esfera();

                    // Lectura de datos solicitados
                    System.out.print("\nVOLÚMEN DE LA ESFERA\nIngrese el valor del radio: ");
                    d.setRadioEsf(scan.nextDouble());

                    d.setNombre("esfera");
                    d.calcularVolumen();

                    // Salida
                    System.out.printf("\nFigura: %s\nVolúmen = %.2f\n", d.getNombre().toUpperCase(), d.getVolumen());
                    break;

                case 5:
                    // Salida del programa
                    System.out.println("S A L I E N D O. . .");
                    salida = false;
                    break;

                default:
                    // En caso de ingresar una opción incorrecta
                    System.out.println("Opción inválida, ingrese nuevamente un número según las opciones indicadas.\n");
                    break;

            }

        } while (salida == true);

    }

}
