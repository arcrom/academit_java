package academit.valter.shape;
import java.util.Comparator;

public class SortToMaxPerimeter implements Comparator<Shape> {
    public int compare(Shape o1, Shape o2) {
        double shape1 = o1.getPerimeter();
        double shape2 = o2.getPerimeter();
        if (shape1 < shape2) {
            return 1;
        } else if (shape1 > shape2) {
            return -1;
        } else {
            return 0;
        }
    }
}
