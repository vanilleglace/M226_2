package ch.wenger;

import ch.wenger.components.Circle;
import ch.wenger.components.Ellipse;
import ch.wenger.components.Line;
import ch.wenger.components.Rectangle;

import java.awt.*;

public class Main {
    private static final Display display = new Display();

    public static void main(String[] args) {
        Color green = new Color(0x14CB0D);
        Color red = new Color(0xD90C10);
        Color blue = new Color(0x1931D9);
        Color yellow = new Color(0xD4D923);
        display.addShape(new Rectangle(100,100,200,200, green, red, 10));
        display.addShape(new Line(350,100,200, blue, yellow, 10));
        display.addShape(new Circle(100,350,200, red, blue, 10));
        display.addShape(new Ellipse(350, 350, 200, 150, yellow, red, 10));
    }
}
