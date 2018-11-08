package ch.wenger;

import ch.wenger.components.Circle;
import ch.wenger.components.Ellipse;
import ch.wenger.components.Line;
import ch.wenger.components.Rectangle;

public class Main {
    private static final Display display = new Display();

    public static void main(String[] args) {
        display.addShape(new Rectangle(50,50,200,200));
        display.addShape(new Line(50,50,200,200));
        display.addShape(new Line(200,50,50,200));
        display.addShape(new Circle(50,50,200));
        display.addShape(new Ellipse(30, 10, 230, 105));
    }
}
