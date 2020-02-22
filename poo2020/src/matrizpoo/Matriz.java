package matrizpoo;

public class Matriz {

    // Declaración de datos
    private int[][] matrizA;
    private int[][] matrizB;
    private int[][] matrizC = new int[3][3];

    /**
     * Método para llamar a los datos contenidos en matrizA
     *
     * @return matrizA
     */
    public int[][] getMatrizA() {
        return matrizA;
    }

    /**
     * Método para establecer los datos a ingresar en la matriz matrizA
     *
     * @param matrizA
     */
    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    /**
     * Método para llamar a los datos contenidos en matrizB
     *
     * @return matrizB
     */
    public int[][] getMatrizB() {
        return matrizB;
    }

    /**
     * Método para establecer los datos a ingresar en la matriz matrizB
     *
     * @param matrizB
     */
    public void setMatrizB(int[][] matrizB) {
        this.matrizB = matrizB;
    }

    /**
     * Método para calcular los datos que van a ser ingresados en la matriz
     */
    public void sumaMatriz() {
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
    }

    /**
     * Método que retorna los datos almacenados en la matrizC
     *
     * @return matrizC
     */
    public int[][] obtenerSuma() {
        return matrizC;
    }

    /**
     * Método para presentar los datos de la matriz A
     */
    public void presentarMatrizA() {
        System.out.println("Matriz A:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            // Salto de línea
            System.out.println();
        }
    }

    /**
     * Método para presentar los datos de la matriz B
     */
    public void presentarMatrizB() {
        System.out.println("Matriz B:");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print(matrizB[i][j] + "\t");
            }
            // Salto de línea
            System.out.println();
        }
    }

    /**
     * Método para presentar los datos de la matriz C
     */
    public void presentarMatrizC() {
        System.out.println("Matriz C:");
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[i].length; j++) {
                System.out.print(matrizC[i][j] + "\t");
            }
            // Salto de línea
            System.out.println();
        }
    }

    /**
     * Método para presentar el arreglo que reciba, funciona con A, B y C
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
