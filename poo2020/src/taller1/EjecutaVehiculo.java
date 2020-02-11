package taller1;

public class EjecutaVehiculo {

    public static void main(String[] args) {
        // Creación de objeto vehículo
        Vehiculo v = new Vehiculo();

        v.actualizar_modelo("Kia Sedan");
        v.actualizar_motor("1.4L MPI");
        v.actualizar_kilometraje(0);
        v.actualizar_color("rojo");
        v.actualizar_placa("LAG - 1234");

        System.out.println("Modelo: " + v.obtener_modelo() + "\nMotor: " + v.obtener_motor() + "\nKilometraje: " +
                v.obtener_kilometraje() + "km.\nColor: " + v.obtener_color() + "\nPlaca: " + v.obtener_placa());
    }
}
