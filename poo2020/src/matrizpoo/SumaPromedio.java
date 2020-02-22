package matrizpoo;

/**
 * Taller Grupal:
 * Jorge Flores
 * Edgar Guamo
 * Luis Quizhpe
 * Brandon Vega
 */
public class SumaPromedio {

    // Declaración de datos
    private int[][] matriz;
    private double calcularSuma;
    private double calcularPromedio;

    /**
     * Método para llamar a los datos almacenados en el array matriz
     *
     * @return matriz
     */
    public int[][] getMatriz() {
        return matriz;
    }

    /**
     * Método para recibir array y asignarlo al array matriz
     *
     * @param matriz
     */
    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    /**
     * Método para llamar al total de la suma de los elementos del array matriz
     *
     * @return calcularSuma
     */
    public double getCalcularSuma() {
        return calcularSuma;
    }

    /**
     * Método para calcular la suma de los elementos del array matriz
     */
    public void calcularSuma() {
        calcularSuma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                calcularSuma += matriz[i][j];
            }
        }

    }

    /**
     * Método para llamar al total del promedio de los elementos del array matriz
     *
     * @return calcularPromedio
     */
    public double getCalcularPromedio() {
        return calcularPromedio;
    }

    /**
     * Método para calcular el promedio de los valores del array
     */
    public void calcularPromedio() {
        calcularPromedio = calcularSuma / (matriz.length * matriz[0].length);
    }

    /**
     * Método para presentar todos los valores del array que reciba
     *
     * @param matriz
     */
    public void presentarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            // Salto de línea
            System.out.println();
        }
    }
}
