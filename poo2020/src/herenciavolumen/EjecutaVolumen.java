package herenciavolumen;

import java.util.Scanner;

public class EjecutaVolumen {

    public static void main(String[] args) {

        // Scaner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        double radio, altura, arista;
        int opt;
        boolean salida = true;

        // Proceso para presentar el menú y calcular
        do {
            System.out.print("Ingrese un número según la opción que desee:\n1. Volumen del Cubo:\n2. Volumen del Cili" +
                    "ndro\n3. Volúmen del Cono\n4. Volúmen de la Esfera\n5. Salir\nOpción = ");
            opt = scan.nextInt();

            switch (opt) {

                case 1:
                    // Lectura de datos solicitados
                    System.out.print("\nVOLÚMEN DEL CUBO\nIngrese el valor de la arista: ");
                    arista = scan.nextDouble();

                    // Creación e inicialización de objeto
                    Cubo cub = new Cubo("Cubo", arista);
                    cub.calcularVolumenCubo();

                    // Salida
                    System.out.printf("\nFigura: %s\nVolúmen = %.2f\n", cub.nombre.toUpperCase(), cub.getVolumenCubo());
                    break;

                case 2:
                    // Lectura de datos solicitados
                    System.out.print("\nVOLÚMEN DEL CILINDRO\nIngrese el valor de la altura: ");
                    altura = scan.nextDouble();
                    System.out.print("Ingrese el valor del radio: ");
                    radio = scan.nextDouble();

                    // Creación e inicialización de objeto
                    Cilindro cil = new Cilindro("Cilindro", radio, altura);
                    cil.calcularVolumenCil();

                    // Salida
                    System.out.printf("\nFigura: %s\nVolúmen = %.2f\n", cil.nombre.toUpperCase(), cil.getVolumenCil());
                    break;

                case 3:
                    // Lectura de datos solicitados
                    System.out.print("\nVOLÚMEN DEL CONO\nIngrese el valor de la altura: ");
                    altura = scan.nextDouble();
                    System.out.print("Ingrese el valor del radio: ");
                    radio = scan.nextDouble();

                    // Creación e inicialización de objeto
                    Cono con = new Cono("Cono", radio, altura);
                    con.calcularVolumenCono();

                    // Salida

                    System.out.printf("\nFigura: %s\nVolúmen = %.2f\n", con.nombre.toUpperCase(), con.getVolumenCono());
                    break;

                case 4:
                    // Lectura de datos solicitados
                    System.out.print("\nVOLÚMEN DE LA ESFERA\nIngrese el valor del radio: ");
                    radio = scan.nextDouble();

                    // Creación e inicialización de objeto
                    Esfera esf = new Esfera("Esfera", radio);
                    esf.calcularVolumenEsf();

                    // Salida
                    System.out.printf("\nFigura: %s\nVolúmen = %.2f\n", esf.nombre.toUpperCase(), esf.getVolumenEsf());
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
