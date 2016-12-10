package academit.valter.matrix;

import academit.valter.vector.Vector;

/**
 * Created by Roman on 07.12.2016.
 */
public class Matrix {
    private Vector[] rows;

    public Matrix(int n, int size) {
        this.rows = new Vector[n];
        for (int i = 0; i < n; i++) {
            this.rows[i] = new Vector(size);
        }
    }

    public Vector getRows(int i) {
        return rows[i];
    }

    public Matrix(Matrix matrix) {
        this.rows = matrix.rows;
    }

    public Matrix(double array[][]) {
        this.rows = new Vector[array.length];
        for (int i = 0; i < array.length; i++) {
            this.rows[i] = new Vector(array[0].length);
        }
    }


    @Override
    public String toString() {
        int countChar = (int) (rows[0].getSize() * 5 + 4);
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < countChar; i++) {
            line.append("*");
        }

        StringBuilder string = new StringBuilder();
        for (int i = 0; i < rows.length; i++) {
            if (i == 0) {
                string.append(line).append("\n");
            }
            string.append("* ").append(rows[i]).append(" *").append("\n");
        }
        string.append(line);
        return string.toString();
    }
}
