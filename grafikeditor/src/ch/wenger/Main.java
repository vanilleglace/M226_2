package ch.wenger;

import ch.wenger.components.Circle;
import ch.wenger.components.Ellipse;
import ch.wenger.components.Line;
import ch.wenger.components.Rectangle;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final EditorControl editorControl = new EditorControl();

    public static void main(String[] args) {
        Color green = new Color(0x14CB0D);
        Color red = new Color(0xD90C10);
        Color blue = new Color(0x1931D9);
        Color yellow = new Color(0xFAFF24);
        Color black = new Color(0x000000);
        Color white = new Color(0xFFFFFF);

        Shape shape = new Rectangle(100, 100, 200, 200, white, black, 2);
        shape.move(10,10);
        shape = new Ellipse(100, 100, 200, 200, white, black, 2);
        Rectangle rect = new Rectangle(100, 100, 200, 200, white, black, 2);
        Line line = new Line(350,100,450, 200, blue, yellow, 4);
        Circle circle = new Circle(100, 350, 200, red, blue, 6);
        Ellipse ellipse = new Ellipse(350, 350, 200, 150, yellow, red, 10);
        Group group = new Group(circle, ellipse);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(rect);
        shapes.add(line);
        shapes.add(group);
        Drawing drawing = new Drawing(shapes);
        editorControl.setDrawing(drawing);
    }
}
