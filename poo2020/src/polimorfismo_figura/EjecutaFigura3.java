package polimorfismo_figura;

import herenciafigura.Circulo;

import java.util.Scanner;

public class EjecutaFigura3 {

    public static void main(String[] args) {

        // Scaner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        int opt;
        boolean salida = true;

        // Proceso para presentar el menú y calcular
        do {
            System.out.print("Ingrese un número según la opción que desee:\n1. Área del Cuadrado\n2. Área del Triángu" +
                    "lo\n3. Área del Rectángulo\n4. Área del Círculo\n5. Salir\nOpción = ");
            opt = scan.nextInt();

            switch (opt) {

                case 1:
                    // Creación e inicialización de objeto
                    Cuadrado3 cuad = new Cuadrado3();

                    // Lectura de datos solicitados
                    System.out.print("\nÁREA DEL CUADRADO\nIngrese el valor del lado: ");
                    cuad.setLadoCuad(scan.nextDouble());

                    cuad.setNomFigura("Cuadrado");
                    cuad.calcularArea();

                    // Salida
                    System.out.printf("\nFigura: %s\nÁrea = %.2f\n", cuad.getNomFigura().toUpperCase(), cuad.getArea());
                    break;

                case 2:
                    // Creación e inicialización de objeto
                    Triangulo3 triang = new Triangulo3();

                    // Lectura de datos solicitados
                    System.out.print("\nÁREA DEL TRIÁNGULO\nIngrese el valor de la base: ");
                    triang.setBase_tria(scan.nextDouble());
                    System.out.print("Ingrese el valor de la altura: ");
                    triang.setAlturaTria(scan.nextDouble());

                    triang.setNomFigura("Triángulo");
                    triang.calcularArea();

                    // Salida
                    System.out.printf("\nFigura: %s\nÁrea = %.2f\n", triang.getNomFigura().toUpperCase(), triang.getArea());
                    break;

                case 3:
                    // Creación e inicialización de objeto
                    Rectangulo3 rect = new Rectangulo3();

                    // Lectura de datos solicitados
                    System.out.print("\nÁREA DEL RECTÁNGULO\nIngrese el valor de la base: ");
                    rect.setBaseRecta(scan.nextDouble());
                    System.out.print("Ingrese el valor de la altura: ");
                    rect.setAlturaRecta(scan.nextDouble());

                    rect.setNomFigura("Rectángulo");
                    rect.calcularArea();

                    // Salida
                    System.out.printf("\nFigura: %s\nÁrea = %.2f\n", rect.getNomFigura().toUpperCase(), rect.getArea());
                    break;

                case 4:
                    // Creación e inicialización de objeto
                    Circulo3 circ = new Circulo3();

                    // Lectura de datos solicitados
                    System.out.print("\nÁREA DEL CÍRCULO\nIngrese el valor del radio: ");
                    circ.setRadioCirc(scan.nextDouble());

                    circ.setNomFigura("Círculo");
                    circ.calcularArea();

                    // Salida
                    System.out.printf("\nFigura: %s\nÁrea = %.2f\n", circ.getNomFigura().toUpperCase(), circ.getArea());
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
