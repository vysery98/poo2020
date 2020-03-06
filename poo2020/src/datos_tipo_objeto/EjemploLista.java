package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;

public class EjemploLista {

    public static void main(String[] args) {

        // Creación de una lista en java para almacenar valores de tipo String
        List<String> universidades = new ArrayList<String>();
        universidades.add("UTPL");
        System.out.println("Tamaño de la lista: " + universidades.size());

        universidades.add("ESPOL");
        System.out.println("Tamaño de la lista: " + universidades.size());

        universidades.add("UNL");
        System.out.println("Tamaño de la lista: " + universidades.size());

        // Eliminación del elemento en la posición 1
        universidades.remove(1);
        System.out.println("Tamaño de la lista luego de eliminar elemento: " + universidades.size());

        // Recorremos lista para presentar valores
        System.out.println("VALORES DE LA LISTA");
        // Reemplazamos valores de una posiciónde nuestra lista
        universidades.set(1, "UIDE");
        // Agregamos un nuevo valor en una posición intermedia
        universidades.add(1, "UNL");
        /*
        for (int cont = 0; cont < universidades.size(); cont++) {
            System.out.println(universidades.get(cont));
        }
         */
        for (String univ : universidades) {
            System.out.println(univ);
        }

    }

}
