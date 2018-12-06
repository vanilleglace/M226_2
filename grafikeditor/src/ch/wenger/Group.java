package ch.wenger;

import java.awt.*;

public class Group extends Shape {
    Shape[] shapes;

    public Group(Shape... shapes) {
        this.shapes = shapes;
    }

    public void move(int x, int y) {
        for (Shape f : this.shapes) {
            f.move(x, y);
        }
    }

    @Override
    public void draw(Graphics2D g2) {
        for (Shape shape : this.shapes) {
            shape.draw(g2);
        }
    }
}
