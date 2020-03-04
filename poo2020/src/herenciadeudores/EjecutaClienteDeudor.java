package herenciadeudores;

import java.util.Scanner;

public class EjecutaClienteDeudor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        String num_cliente;
        String num_cuenta;
        String salida = "";
        double capital;
        double tasa_anual;
        double plazo;
        int aux = 0;
        boolean bandera = true;
        boolean bandera1 = true;
        boolean bandera2 = true;
        System.out.println("______________________________________________________\n|1. Para calcular un interés de p" +
                "réstamo personal.    |\n|2. Para calcular un interés de préstamo hipotecario. |\n|3. Para calcular u" +
                "n interés de préstamo de auto.     |\n|_____________________________________________________|\n\"Tip" +
                "o de préstamo del cual desea calcular el interés.");
        int opt = sc.nextInt();
        sc.nextLine();
        do {
            do {
                switch (opt) {
                    case 1:

                        System.out.print("Ingrese el nombre del cliente: ");
                        name = sc.nextLine();
                        System.out.print("Ingrese el número de cuenta: ");
                        num_cuenta = sc.nextLine();
                        System.out.print("Ingrese el número de cliente: ");
                        num_cliente = sc.nextLine();
                        System.out.print("Tasa de interés anual = %");
                        tasa_anual = sc.nextDouble();
                        System.out.print("Ingrese el plazo de la inversión realizada");
                        plazo = sc.nextDouble();
                        System.out.print("Ingrese la cantidad de capital prestado: ");
                        capital = sc.nextDouble();
                        // Limpieza del Buffer
                        sc.nextLine();

                        // Creación e inicialización de objeto
                        PrestamoPersonal pperso = new PrestamoPersonal(name, num_cliente, num_cuenta, capital, tasa_anual, plazo);
                        aux++;
                        bandera = false;
                        salida = String.format("%s\n%s", salida, pperso.presentar_informe());
                        break;

                    case 2:
                        System.out.print("Ingrese el nombre del cliente: ");
                        name = sc.nextLine();
                        System.out.print("Ingrese el número de cuenta: ");
                        num_cuenta = sc.nextLine();
                        System.out.print("Ingrese el número de cliente: ");
                        num_cliente = sc.nextLine();
                        System.out.print("Tasa de interés anual = %");
                        tasa_anual = sc.nextDouble();
                        System.out.print("Ingrese el plazo de la inversión realizada");
                        plazo = sc.nextDouble();
                        System.out.print("Ingrese la cantidad de capital prestado: ");
                        capital = sc.nextDouble();
                        // Limpieza del Buffer
                        sc.nextLine();

                        // Creación e inicialización de objeto
                        PrestamoHipotecario phipo = new PrestamoHipotecario(name, num_cliente, num_cuenta, capital, tasa_anual, plazo);
                        aux++;
                        bandera = false;
                        salida = String.format("%s\n%s", salida, phipo.presentar_informe());
                        break;

                    case 3:
                        System.out.print("Ingrese el nombre del cliente: ");
                        name = sc.nextLine();
                        System.out.print("Ingrese el número de cuenta: ");
                        num_cuenta = sc.nextLine();
                        System.out.print("Ingrese el número de cliente: ");
                        num_cliente = sc.nextLine();
                        System.out.print("Tasa de interés anual = %");
                        tasa_anual = sc.nextDouble();
                        System.out.print("Ingrese el plazo de la inversión realizada");
                        plazo = sc.nextDouble();
                        System.out.print("Ingrese la cantidad de capital prestado: ");
                        capital = sc.nextDouble();
                        // Limpieza del Buffer
                        sc.nextLine();

                        // Creación e inicialización de objeto
                        PrestamoAuto pauto = new PrestamoAuto(name, num_cliente, num_cuenta, capital, tasa_anual, plazo);
                        aux++;
                        salida = String.format("%s\n%s", salida, pauto.presentar_informe());
                        bandera = false;

                        break;

                    default:
                        System.out.println("Por favor ingrese una opción válida.");
                }

            } while (bandera == true);
            do {
                System.out.print("\n¿Desea calcular otro interés en deuda? Si = 1, No = 2");
                opt = sc.nextInt();
                // Limpieza del Buffer
                sc.nextLine();
                if (opt == 1) {
                    aux++;

                    bandera1 = false;
                } else if (opt == 2) {
                    bandera1 = false;
                    bandera2 = false;
                } else {
                    System.out.println("Opción incorrecta, ingrese nuevamente.");
                }
            } while (bandera1 == true);
        } while (bandera2 == true);
        System.out.println("\t\t\t\t\tREPORTE DE CLIENTES DEUDORES\t\t\t\t\t\nNo. Cliente\t\tNombre\t\tNo. Cuenta\t\t" +
                "Interés");
        System.out.println(salida);

    }
}
