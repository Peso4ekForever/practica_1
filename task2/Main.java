package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(1, 2, 12, 0xF729FF));
        shapes.add(new Rectangle(1, 5, 1, 2, 0xFF2154));

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
