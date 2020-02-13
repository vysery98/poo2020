package deber_seleccion;

import java.util.Scanner;

public class EjecutaMayor4Numeros2 {

    public static void main(String[] args) {

        // Scanner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // declaración de variables
        int n1;
        int n2;
        int n3;
        int n4;

        // declaración e inicialización de objeto
        Mayor4Numeros2 objMayor4Numeros = new Mayor4Numeros2();

        // Lectura de datos solicitados
        System.out.print("Número 1: ");
        n1 = scan.nextInt();
        System.out.print("Número 2: ");
        n2 = scan.nextInt();
        System.out.print("Número 3: ");
        n3 = scan.nextInt();
        System.out.print("Número 4: ");
        n4 = scan.nextInt();

        // Envio de datos a los metodos por medio del objeto
        objMayor4Numeros.setNumA(n1);
        objMayor4Numeros.setNumB(n2);
        objMayor4Numeros.setNumC(n3);
        objMayor4Numeros.setNumD(n4);

        // Cálculo del mayor de los números ingresados
        objMayor4Numeros.calcularNuMayor();

        // Salida
        System.out.println(objMayor4Numeros.getNuMayor());

    }
}
