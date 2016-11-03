package academit.valter.shape;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        ArrayList<Shape> shapeList = new ArrayList<Shape>();

        Shape Shape1 = new Square(5);
        Shape Shape2 = new Rectangle(8, 10);  //36
        Shape Shape3 = new Circle(7);
        Shape Shape4 = new Triangle(1, 3, 4, 5, 7, 9);
        Shape Shape5 = new Circle(4);

//        System.out.println(Shape4.getArea());

        shapeList.add(Shape1);
        shapeList.add(Shape2);
        shapeList.add(Shape3);
        shapeList.add(Shape4);
        shapeList.add(Shape5);

        Collections.sort(shapeList, new SortToMaxArea());
        System.out.println("Максимальная площадь из этого списка " + shapeList.get(0).getArea() + " у фигуры " + shapeList.get(0).getName());


        Collections.sort(shapeList, new SortToMaxPerimeter());
        System.out.println("Второй по величине периметр из этого списка " + shapeList.get(1).getPerimeter() + " у фигуры " + shapeList.get(1).getName());

//        System.out.println(Shape4.getWidth());
//        System.out.println(Shape4.getHeight());
//        System.out.println(Shape4.getArea());
//        System.out.println(Shape4.getPerimeter());
    }
}
