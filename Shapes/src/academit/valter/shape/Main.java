package academit.valter.shape;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Shape> shapeList = new ArrayList<Shape>();

        shapeList.add(new Square(5));
        shapeList.add(new Rectangle(8, 10));
        shapeList.add(new Circle(7));
        shapeList.add(new Triangle(1, 3, 4, 5, 7, 9));
        shapeList.add(new Circle(4));
        shapeList.add(shapeList.get(2));

//        System.out.println(shapeList.get(1).getArea());

//        Collections.sort(shapeList, new SortToMaxArea());
//        System.out.println("Максимальная площадь из этого списка " + shapeList.get(0).getArea() + " у фигуры " + shapeList.get(0).getName());

//        Collections.sort(shapeList, new SortToMaxPerimeter());
//        System.out.println("Второй по величине периметр из этого списка " + shapeList.get(1).getPerimeter() + " у фигуры " + shapeList.get(1).getName());

//        System.out.println(shapeList.get(0).getWidth());
//        System.out.println(shapeList.get(1).getHeight());
//        System.out.println(shapeList.get(2).getArea());
//        System.out.println(shapeList.get(3).getPerimeter());

//        Object object = new Object();
//        int hCode;
//        hCode = object.hashCode();
//        System.out.println(hCode);

        System.out.println(shapeList.get(2).equals(shapeList.get(5)));

        System.out.println(shapeList.get(0).hashCode());

        System.out.println(shapeList.get(0).toString());

        System.out.println(shapeList.get(3).toString());
    }
}
