package academit.valter.shape;

public class Square implements Shape {
    public static final int COUNT_SIDE_TO_SQUARE = 4;

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getWidth() {
        return side;
    }

    public double getHeight() {
        return side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * COUNT_SIDE_TO_SQUARE;
    }

    public String getName() {
        return "Square";
    }

}
