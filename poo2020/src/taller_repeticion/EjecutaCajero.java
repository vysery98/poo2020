package taller_repeticion;

/**
 * Integrantes:
 * Jorge Flores
 * Luis Quizhpe
 * Brandon Vega
 */
import java.util.Scanner;

public class EjecutaCajero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cajero cajero = new Cajero();

        System.out.println("Ingrese el nombre del socio: ");
        String socio = scan.nextLine();

        System.out.println("Ingrese su saldo inicial: ");
        double saldo = scan.nextDouble();
        cajero.setSaldo(saldo);

        boolean accion = true;
        int opcion;
        String opcion2;
        while(accion){
            System.out.println("Eliga la opcion que desea:\n\n1. Deposito\n2. Retiro\n3. Consulta de saldo");
            opcion = scan.nextInt();
            scan.nextLine();
            cajero.setOpcion(opcion);

            if(opcion == 1){
                System.out.println("Ingrese la cantidad que desea depositar: ");
                double deposito = scan.nextDouble();
                scan.nextLine();
                cajero.setDeposito(deposito);
                System.out.println(cajero.getReporte());
                saldo = cajero.getDeposito() + cajero.getSaldo();
                cajero.setSaldo(saldo);
                System.out.println("¿Desea realizar alguna otra accion? Si / No");
                opcion2 = scan.nextLine().toLowerCase();
                if(opcion2.equals("no")){
                    accion = false;
                }
            }
            if(opcion == 2){
                System.out.println("Ingrese la cantidad que desea retirar: ");
                double retiro = scan.nextDouble();
                scan.nextLine();
                cajero.setRetiro(retiro);
                System.out.println(cajero.getReporte());
                saldo = cajero.getSaldo() - cajero.getRetiro();
                cajero.setSaldo(saldo);
                System.out.println("¿Desea realizar alguna otra accion? Si / No");
                opcion2 = scan.nextLine().toLowerCase();
                if(opcion2.equals("no")) {
                    accion = false;
                }
            }

            if(opcion == 3){
                System.out.println(cajero.getReporte());
                System.out.println("¿Desea realizar alguna otra accion? Si / No");
                opcion2 = scan.nextLine().toLowerCase();
                if(opcion2.equals("no")) {
                    accion = false;
                }
            }
        }
    }
}
