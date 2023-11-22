import com.sabrina.module1.two.TwoDShape;
import com.sabrina.module1.two.Triangle;
import com.sabrina.module1.two.Circle;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list to hold shapes
        List<com.sabrina.module1.two.TwoDShape> shapeList = new ArrayList<>();

        // Add circles and triangles to the list
        shapeList.add(new Circle(4.0));
        shapeList.add(new Circle(5.0));
        shapeList.add(new Triangle(3.0, 4.0, 5.0));
        shapeList.add(new Triangle(5.0, 12.0, 13.0));

        // Loop through the list and check getArea and toString methods
        for (TwoDShape shape : shapeList) {
            System.out.println("Area: " + shape.getArea());
            System.out.println("ToString " + shape);
            System.out.println();
        }
    }
}
