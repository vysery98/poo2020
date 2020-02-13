package disenio_seleccion;

import java.util.Scanner;

public class EjecutaDia {

    public static void main(String[] args) {
        // Scanner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // declaración de variables
        int num;

        // Lectura de datos
        System.out.print("Digite el valor correspondiente al número de día(Valor entre 1 y 7): ");
        num = scan.nextInt();

        // Creación de objeto
        Dia dia = new Dia();
        dia.setNum(num);

        System.out.println(dia.calcularDia());
    }
}
