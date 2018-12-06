package ch.wenger;

import java.awt.*;
import java.util.List;

public class Drawing {
    List<Shape> shapes;

    public Drawing(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public void drawShapes(Graphics2D g2) {
        for (Shape shape : shapes) {
            shape.draw(g2);
        }
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void clearDisplay() {
        shapes.clear();
    }
}
