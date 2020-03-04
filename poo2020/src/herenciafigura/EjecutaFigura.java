package herenciafigura;

import java.util.Scanner;

public class EjecutaFigura {

    public static void main(String[] args) {

        // Scaner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        double base, altura, radio, lado;
        int opt;
        boolean salida = true;

        // Proceso para presentar el menú y calcular
        do {
            System.out.print("Ingrese un número según la opción que desee:\n1. Área del Cuadrado:\n2. Área del Triáng" +
                    "ulo\n3. Área del Rectángulo\n4. Área del Círculo\n5. Salir\nOpción = ");
            opt = scan.nextInt();

            switch (opt) {

                case 1:
                    // Lectura de datos solicitados
                    System.out.print("\nÁREA DEL CUADRADO\nIngrese el valor del lado: ");
                    lado = scan.nextDouble();

                    // Creación e inicialización de objeto
                    Cuadrado cuad = new Cuadrado("Cuadrado", lado);
                    cuad.calcularAreaCuad();

                    // Salida
                    System.out.printf("\nFigura: %s\nÁrea = %.2f\n", cuad.nombre.toUpperCase(), cuad.getAreaCuad());
                    break;

                case 2:
                    // Lectura de datos solicitados
                    System.out.print("\nÁREA DEL TRIÁNGULO\nIngrese el valor de la base: ");
                    base = scan.nextDouble();
                    System.out.print("Ingrese el valor de la altura: ");
                    altura = scan.nextDouble();

                    // Creación e inicialización de objeto
                    Triangulo triang = new Triangulo("Triángulo", base, altura);
                    triang.calcularAreaTria();

                    // Salida
                    System.out.printf("\nFigura: %s\nÁrea = %.2f\n", triang.nombre.toUpperCase(), triang.getAreaTria());
                    break;

                case 3:
                    // Lectura de datos solicitados
                    System.out.print("\nÁREA DEL RECTÁNGULO\nIngrese el valor de la base: ");
                    base = scan.nextDouble();
                    System.out.print("Ingrese el valor de la altura: ");
                    altura = scan.nextDouble();

                    // Creación e inicialización de objeto
                    Rectangulo rect = new Rectangulo("Rectángulo", base, altura);
                    rect.calcularAreaRecta();

                    // Salida
                    System.out.printf("\nFigura: %s\nÁrea = %.2f\n", rect.nombre.toUpperCase(), rect.getAreaRecta());
                    break;

                case 4:
                    // Lectura de datos solicitados
                    System.out.print("\nÁREA DEL CÍRCULO\nIngrese el valor del radio: ");
                    lado = scan.nextDouble();

                    // Creación e inicialización de objeto
                    Circulo circ = new Circulo("Círculo", lado);
                    circ.calcularAreaCirc();

                    // Salida
                    System.out.printf("\nFigura: %s\nÁrea = %.2f\n", circ.nombre.toUpperCase(), circ.getAreaCirc());
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
