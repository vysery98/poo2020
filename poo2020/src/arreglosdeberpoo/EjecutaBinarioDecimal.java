package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutaBinarioDecimal {

    public static void main(String[] args) {

        // Scanner para lectura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables
        int bin;
        int aux;
        int residuo;
        boolean binValido;

        // Creación e inicialización de objeto
        BinarioDecimal convert = new BinarioDecimal();

        // Lectura de datos solicitados | Comprobación de si el número ingresado es binario
        do {
            System.out.print("Número binario a transformar: ");
            bin = scan.nextInt();
            binValido = true;
            aux = bin;
            while (aux != 0) {
                residuo = aux % 10;
                if (residuo != 0 && residuo != 1) {
                    binValido = false;
                }
                // Suprimir el último dígito para repetir el ciclo con el siguiente
                aux /= 10;
            }
        } while (!binValido);

        // Establecer valores en objeto
        convert.setBinario(Long.toString(bin)); // Parsing de long a String
        convert.setArrayBin();
        convert.calcularDecimal();

        //Salida
        System.out.println(convert.getBinario() + " en binario = " + convert.getDecimal() + " en decimal.");
    }
}
