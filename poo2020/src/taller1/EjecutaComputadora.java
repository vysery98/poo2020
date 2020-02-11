package taller1;

public class EjecutaComputadora {

    public static void main(String[] args) {
        // creación de objeto computadora
        Computadora computadora = new Computadora();

        computadora.actualizar_marca("Dell");
        computadora.actualizar_procesador("Intel(R) Core(TM) i7-8750H CPU @ 2.20GHz");
        computadora.actualizar_ram(8);
        computadora.actualizar_sistema_operativo("Windows 10 Home 64 bits");
        computadora.actualizar_color("rojo");

        System.out.println("Marca: " + computadora.obtener_marca() + "\nProcesador: " + computadora.obtener_procesador()
        + "\nRam: " + computadora.obtener_ram() + "\nSistema Operativo: " + computadora.obtener_sistema_operativo()+
                "\nColor: " + computadora.obtener_color());

    }
}
