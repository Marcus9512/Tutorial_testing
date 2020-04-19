/**
 * @project tutorial
 * @autor Marcus Jonnson Ewerbring and Diego Leon on 2020-04-03.
 */
public class MyMath {
    /**
     * Calculates the dot product of two matrices
     * @param a is a 2D matrix of size m X n
     * @param b is a 2D matrix of size n X k
     * @return matrix product of size m X k.
     */
    public static int[][] mult(int[][] a, int[][] b) {
        if(a[0].length != b.length) throw new IllegalArgumentException(
                "The number of columns in the first matrix must be equal to the number of rows in the second matrix");
        int[][] c = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int t = 0; t < a[0].length; t++) {
                    c[i][j] = c[i][j] + a[i][t] * b[t][j];
                }
            }
        }
        return c;
    }

    /**
     * Calculates the sum of the diagonal elements
     * @param m is a 2D matrix of size n X n
     * @return sum of the diagonal elements from m
     */
    public static int trace(int[][] m) {
        if(m[0].length != m.length) throw new IllegalArgumentException(
                "The number of columns must be equal to the number of rows");
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }

    /**
     * Return the absolute value of an int x
     * @param x is a integer
     * @return the absolute value of x
     */
    public static int absolute(int x) {
        if(x > 0)
            return x;
        else
            return x;
    }
}
