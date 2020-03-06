package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNombre {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<String>();
        String nombre = "";
        boolean flag = true;
        int opt;

        do {

            System.out.println("1. Agregar nuevos nombres.");
            System.out.println("2. Presentar lista de nombres.");
            System.out.println("3. Salir del programa.");
            System.out.println("Ingrese por favor la opción que desea realizar: ");
            opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {

                case 1:
                    System.out.print("\nIngrese el nombre que desea registrar: \n");
                    nombre = sc.nextLine();
                    names.add(nombre);
                    break;

                case 2:
                    for (int i = 0; i < names.size(); i++) {

                        System.out.println(names.get(i));

                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Ha salido satisfactoriamente del sistema.");
                    flag = false;
                    break;
            }

        } while (flag);

    }

}