package academit.valter.matrix;

import academit.valter.vector.Vector;

/**
 * Created by Roman on 07.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(2, 3);
        Matrix matrix2 = new Matrix(matrix);

        double array[][] = new double[2][7];

        Matrix matrix3 = new Matrix(array);

        System.out.println(matrix3.toString());


    }
}
