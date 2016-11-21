package academit.valter.vector;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(10);


        double[] array = {5, 4, 3, 2, 1};
        double[] array2 = {55, 44, 33, 22, 11};
        Vector vector2 = new Vector(7, array2);

//        for (int i = 0; i < vector2.getValue().length; i++) {
//            System.out.println(vector2.getValue()[i]);
//        }

       Vector vector3 = new Vector(2);

        System.out.println(vector2.toString());
    }
}