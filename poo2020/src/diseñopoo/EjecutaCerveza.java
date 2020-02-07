package diseñopoo;

import java.util.Scanner;

public class EjecutaCerveza {

    public static void main(String[] args) {
        // Scanner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        String salida;
        String nombre;
        String tipo;
        double precio;
        int unidades;
        double total;

        // Lectura de datos
        System.out.print("Nombre de la Cerveza: ");
        nombre = scan.nextLine();
        System.out.print("Tipo de la Cerveza: ");
        tipo = scan.nextLine();
        System.out.print("Precio de la Cerveza: ");
        precio = scan.nextDouble();
        System.out.print("Unidades vendidas: ");
        unidades = scan.nextInt();

        // Creación de objeto con inicialización de variables
        Cerveza cerveza = new Cerveza(nombre, tipo, precio, unidades);
        total = cerveza.calcular_ventas(cerveza.getPrecio(), cerveza.getUnidades_vendidas());
        // Salida
        salida = cerveza.reportar(nombre, tipo, precio, unidades, total);
        System.out.println(salida);
    }
}
