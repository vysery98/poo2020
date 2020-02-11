package taller1;

public class EjecutaAnimal {

    public static void main(String[] args) {
        // creación de objeto animal
        Animal animal = new Animal();

        animal.actualizar_familia("cánido");
        animal.actualizar_raza("collie");
        animal.actualizar_especie("C. lupus");
        animal.actualizar_tamanio(61);
        animal.actualizar_veloc_desplazamiento(3);

        System.out.println("Familia: " + animal.obtener_familia() + "\nRaza: " + animal.obtener_raza() + "\nEspecie: "
        + animal.obtener_especie() + "Tamaño: " + animal.obtener_tamanio() + "cm.\nVelocidad: " +
                animal.obtener_veloc_desplazamiento() + "m/s.");

    }

}
