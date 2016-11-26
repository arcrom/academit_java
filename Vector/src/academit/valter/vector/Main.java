package academit.valter.vector;

public class Main {
    public static void main(String[] args) {

        double[] array1 = {11, 4, 3, 2, 1};
        double[] array2 = {55, 44, 33, 22, 11};
        double[] array3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Vector vectorOne = new Vector(7, array1);
        Vector vectorTwo = new Vector(array2);
        Vector vectorThree = new Vector(vectorOne);

//        Копирование части массива в вектор
//        for (int i = 0; i < vectorOne.getSize(); i++){
//            System.out.println(vectorOne.getValue(i));
//        }

//        Копирование массива в вектор
//        for (int i = 0; i < vectorTwo.getSize(); i++) {
//            System.out.println(vectorTwo.getValue(i));
//        }

//        Копирование вектора
//        for (int i = 0; i < vectorThree.getSize(); i++) {
//            System.out.println(vectorThree.getValue(i));
//        }

        System.out.println(vectorTwo.toString());
    }
}