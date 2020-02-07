package intropoo;

public class EjecutaPersona {

    public static void main(String[] args) {
        // Creación de objeto, con inicialización de variables
        Persona persona = new Persona("Femenino", "Satánica", 69, "Juana");
        System.out.print("Nombre: " + persona.getNombre() + "\n");
        System.out.print("Edad: " + persona.getEdad() + "\n");
        System.out.print("Religión: " + persona.getReligion() + "\n");
        System.out.print("Género: " + persona.getGenero());

        // Creación de objeto con constructor 2
        Persona persona2 = new Persona("Masculino", "Catolico", 20);
        Persona persona3 = new Persona("Femenino", "Agnóstico", 30);
        System.out.println("Edad persona 2: " + persona2.getEdad());
        System.out.println("Edad persona 3: " + persona3.getEdad());
        System.out.println("Nombre persona 2: " + persona2.getNombre());
    }

}
