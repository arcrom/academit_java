package academit.valter.shape;

public interface Shape {

    double getWidth();

    double getHeight();

    double getArea();

    double getPerimeter();

    String getName();

    boolean equals(Object obj);

    int hashCode();

    String toString();
}
