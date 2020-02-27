
package matrizpoo;

/**
 * Taller Grupal
 * Jorge Flores
 * Edgar Guamo
 * Luis Quizhpe
 * Brandon Vega
 */
public class MatrizTrans {
    private int[][] matriz;
    private int n;
    private int m;

    /**
     * Metodo para obtener la matriz
     *
     * @return matriz
     */
    public int[][] getMatriz() {
        return matriz;
    }

    /**
     * Metodo para actualizar la matriz
     *
     * @param matriz
     */
    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    /**
     * Metodo para obtener n
     *
     * @return n
     */
    public int getN() {
        return n;
    }

    /**
     * Metodo para actualizar n
     *
     * @param n
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * Metodo para obtener m
     *
     * @return m
     */
    public int getM() {
        return m;
    }

    /**
     * Metodo para actualizar m
     *
     * @param m
     */
    public void setM(int m) {
        this.m = m;
    }

    /**
     * Metodo para obtener el reporte final
     */
    public void getReporte() {
        System.out.println("Matriz A: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Matriz transpuesta: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");

    }
}