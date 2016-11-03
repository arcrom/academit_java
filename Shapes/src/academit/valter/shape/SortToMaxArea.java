package academit.valter.shape;
import java.util.Comparator;

public class SortToMaxArea implements Comparator<Shape> {
    public int compare(Shape o1, Shape o2) {
        double shape1 = o1.getArea();
        double shape2 = o2.getArea();
        if (shape1 < shape2) {
            return 1;
        } else if (shape1 > shape2) {
            return -1;
        } else {
            return 0;
        }
    }
}

