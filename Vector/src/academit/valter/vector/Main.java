package academit.valter.vector;

public class Main {
    public static void main(String[] args) {

        double[] array1 = {11, 4, 3, 2, 1};
        double[] array2 = {55, 44, 33, 22, 11};
        double[] array3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        double[] array4 = {1, 2, 3};
        double[] array5 = {4, 5};
        Vector vectorOne = new Vector(7, array1);
        Vector vector1 = new Vector(array1);
        Vector vectorTwo = new Vector(array2);
        Vector vectorThree = new Vector(vectorOne);
        Vector vectorFour = new Vector(array4);
        Vector vectorFive = new Vector(array5);
        Vector vector6 = new Vector(array4);
        Vector vector7 = new Vector(array5);

        System.out.println(vector1.plus(vectorTwo));

//        Копирование части массива в вектор
//        for (int i = 0; i < vectorOne.getSize(); i++){
//            System.out.println(vectorOne.getValue(i));
//        }

//        Копирование массива в вектор
//        for (int i = 0; i < vectorTwo.getSize(); i++) {
//            System.out.println(vectorTwo.getValue(i));
//       }

//        Копирование вектора
//        for (int i = 0; i < vectorThree.getSize(); i++) {
//            System.out.println(vectorThree.getValue(i));
//        }

//        plus
//        System.out.println(vectorFour.plus(vectorFive));
//        System.out.println(vector7.plus(vector6));

//        minus
//        System.out.println(vectorFour.minus(vectorFive));
//        System.out.println(vector7.minus(vector6));

//        Скаляр
//        System.out.println(vector6.scalar(3));
//        Длинна
//        System.out.println(vector6.getLength());
//        Разворот
//        System.out.println(vector6.reverse());
//        equals
//        System.out.println(vector6.equals(vector7));
//        hashCode
//        System.out.println(vectorTwo.hashCode());

//        Статическая функция суммы векторов
//        System.out.println(Vector.sum(vectorFour,vectorTwo));

//        System.out.println(Vector.scalar(vectorFour,vectorFive));
    }
}