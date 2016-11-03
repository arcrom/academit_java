package academit.valter.shape;

public class Triangle implements Shape {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    private static double sideLength(double pointX1, double pointY1, double pointX2, double pointY2) {
        return Math.sqrt(Math.pow(pointX1 - pointX2, 2) + Math.pow(pointY1 - pointY2, 2));
    }

    public double getWidth() {
        return Math.max(Math.max(x1, x2), x3) - Math.min(Math.min(x1, x2), x3);
    }

    public double getHeight() {
        return Math.max(Math.max(y1, y2), y3) - Math.min(Math.min(y1, y2), y3);
    }

    public double getArea() {
        double a = sideLength(x1, y1, x2, y2);
        double b = sideLength(x2, y2, x3, y3);
        double c = sideLength(x1, y1, x3, y3);
        double halfPerimeter = (a + b + c) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    public double getPerimeter() {
        double a = sideLength(x1, y1, x2, y2);
        double b = sideLength(x2, y2, x3, y3);
        double c = sideLength(x1, y1, x3, y3);
        return a + b + c;
    }

    public String getName() {
        return "Triangle";
    }
}
